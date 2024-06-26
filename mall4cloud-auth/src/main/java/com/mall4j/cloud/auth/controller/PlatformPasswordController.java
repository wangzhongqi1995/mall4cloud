package com.mall4j.cloud.auth.controller;

import com.mall4j.cloud.api.auth.bo.UserInfoInTokenBO;
import com.mall4j.cloud.api.auth.vo.TokenInfoVO;
import com.mall4j.cloud.api.biz.feign.NotifyFeignClient;
import com.mall4j.cloud.auth.dto.ForgetPasswordDTO;
import com.mall4j.cloud.auth.dto.UpdatePasswordDTO;
import com.mall4j.cloud.auth.manager.TokenStore;
import com.mall4j.cloud.auth.model.AuthAccount;
import com.mall4j.cloud.auth.service.AuthAccountService;
import com.mall4j.cloud.common.constant.SendTypeEnum;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.common.security.AuthUserContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author FrozenWatermelon
 * @date 2021/01/29
 */
@Slf4j
@RequestMapping("/p/platform")
@RestController
@Api(tags = "platform密码")
public class PlatformPasswordController {

	@Autowired
	private TokenStore tokenStore;

	@Autowired
	private AuthAccountService authAccountService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private NotifyFeignClient notifyFeignClient;


	@PutMapping("/update_password")
	@ApiOperation(value = "更新密码", notes = "更新当前用户的密码, 更新密码之后要退出登录，清理token")
	public ServerResponseEntity<Void> updatePassword(@Valid @RequestBody UpdatePasswordDTO updatePasswordDTO) {
		UserInfoInTokenBO userInfoInToken = AuthUserContext.get();
		AuthAccount authAccount = authAccountService.getByUserIdAndType(userInfoInToken.getUserId(), userInfoInToken.getSysType());
		if (!passwordEncoder.matches(updatePasswordDTO.getOldPassword(), authAccount.getPassword())) {
			return ServerResponseEntity.showFailMsg("旧密码不正确");
		}
		authAccountService.updatePassword(userInfoInToken.getUserId(), userInfoInToken.getSysType(), updatePasswordDTO.getNewPassword());

		tokenStore.deleteAllToken(userInfoInToken.getSysType().toString(), userInfoInToken.getUid());
		return ServerResponseEntity.success();
	}


}
