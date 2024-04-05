package com.mall4j.cloud.distribution.controller.platform;

import com.mall4j.cloud.distribution.model.DistributionDevelopingRewardDetail;
import com.mall4j.cloud.distribution.service.DistributionDevelopingRewardDetailService;
import com.mall4j.cloud.distribution.vo.DistributionDevelopingRewardDetailVO;
import com.mall4j.cloud.distribution.dto.DistributionDevelopingRewardDetailDTO;

import com.mall4j.cloud.api.auth.bo.UserInfoInTokenBO;
import com.mall4j.cloud.common.database.dto.PageDTO;
import com.mall4j.cloud.common.database.vo.PageVO;
import com.mall4j.cloud.common.response.ServerResponseEntity;
import com.mall4j.cloud.common.security.AuthUserContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

/**
 * 分销推广-发展奖励明细
 *
 * @author ZengFanChang
 * @date 2021-12-26 17:16:08
 */
@RestController("platformDistributionDevelopingRewardDetailController")
@RequestMapping("/p/distribution_developing_reward_detail")
@Api(tags = "平台端-分销推广-发展奖励明细")
public class DistributionDevelopingRewardDetailController {

    @Autowired
    private DistributionDevelopingRewardDetailService distributionDevelopingRewardDetailService;

    @Autowired
	private MapperFacade mapperFacade;

	@GetMapping("/page")
	@ApiOperation(value = "获取分销推广-发展奖励明细列表", notes = "分页获取分销推广-发展奖励明细列表")
	public ServerResponseEntity<PageVO<DistributionDevelopingRewardDetail>> page(@Valid PageDTO pageDTO) {
		PageVO<DistributionDevelopingRewardDetail> distributionDevelopingRewardDetailPage = distributionDevelopingRewardDetailService.page(pageDTO);
		return ServerResponseEntity.success(distributionDevelopingRewardDetailPage);
	}

	@GetMapping
    @ApiOperation(value = "获取分销推广-发展奖励明细", notes = "根据id获取分销推广-发展奖励明细")
    public ServerResponseEntity<DistributionDevelopingRewardDetail> getById(@RequestParam Long id) {
        return ServerResponseEntity.success(distributionDevelopingRewardDetailService.getById(id));
    }

    @PostMapping
    @ApiOperation(value = "保存分销推广-发展奖励明细", notes = "保存分销推广-发展奖励明细")
    public ServerResponseEntity<Void> save(@Valid @RequestBody DistributionDevelopingRewardDetailDTO distributionDevelopingRewardDetailDTO) {
        DistributionDevelopingRewardDetail distributionDevelopingRewardDetail = mapperFacade.map(distributionDevelopingRewardDetailDTO, DistributionDevelopingRewardDetail.class);
        distributionDevelopingRewardDetail.setId(null);
        distributionDevelopingRewardDetailService.save(distributionDevelopingRewardDetail);
        return ServerResponseEntity.success();
    }

    @PutMapping
    @ApiOperation(value = "更新分销推广-发展奖励明细", notes = "更新分销推广-发展奖励明细")
    public ServerResponseEntity<Void> update(@Valid @RequestBody DistributionDevelopingRewardDetailDTO distributionDevelopingRewardDetailDTO) {
        DistributionDevelopingRewardDetail distributionDevelopingRewardDetail = mapperFacade.map(distributionDevelopingRewardDetailDTO, DistributionDevelopingRewardDetail.class);
        distributionDevelopingRewardDetailService.update(distributionDevelopingRewardDetail);
        return ServerResponseEntity.success();
    }

    @DeleteMapping
    @ApiOperation(value = "删除分销推广-发展奖励明细", notes = "根据分销推广-发展奖励明细id删除分销推广-发展奖励明细")
    public ServerResponseEntity<Void> delete(@RequestParam Long id) {
        distributionDevelopingRewardDetailService.deleteById(id);
        return ServerResponseEntity.success();
    }
}
