package com.mall4j.cloud.biz.dto.channels.sharer;

import com.mall4j.cloud.common.database.dto.PageDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Author axin
 * @Date 2023-02-23 15:15
 **/
@Data
public class SharerPageListReqDto extends PageDTO {
    @ApiModelProperty(value = "分享员姓名")
    private String name;

    @ApiModelProperty(value = "绑定状态 0初始化,1待绑定 2失效 3成功 4解绑")
    private Integer status;
}
