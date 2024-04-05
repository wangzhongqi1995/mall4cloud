package com.mall4j.cloud.biz.vo.cp;

import com.mall4j.cloud.biz.model.cp.CpWelcome;
import com.mall4j.cloud.biz.model.cp.CpWelcomeAttachment;
import com.mall4j.cloud.biz.model.cp.ShopWelcomeConfig;
import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 欢迎语配置表VO
 *
 * @author hwy
 * @date 2022-01-24 11:05:42
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WelcomeDetailVO extends BaseVO {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("欢迎语对象")
    private CpWelcome welcome;
    @ApiModelProperty("商店列表对象")
    private List<ShopWelcomeConfig> shops;
    @ApiModelProperty("回复消息2对象")
    private CpWelcomeAttachment attachment;

    public WelcomeDetailVO(CpWelcome welcome, CpWelcomeAttachment attachment, List<ShopWelcomeConfig> shops){
        this.welcome =welcome;
        this.attachment = attachment;
        this.shops =shops;
    }
}
