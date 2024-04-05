package com.mall4j.cloud.coupon.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class AddChooseMemberEventDTO {

    @NotBlank(message = "活动标题为必填项")
    @ApiModelProperty(value = "活动title",required = true)
    private String eventTitle;

    @NotNull(message = "请选择开始时间")
    @ApiModelProperty(value = "开始时间",required = true)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventStartTime;

    @NotNull(message = "请选择结束时间")
    @ApiModelProperty(value = "结束时间",required = true)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventEndTime;

//    @NotNull(message = "支持门店选项不能为空")
//    @ApiModelProperty(value = "0部分门店，1全部门店",required = true)
//    private Boolean isAllShop;

    @NotNull(message = "兑换类型为必选项")
    @ApiModelProperty(value = "0兑礼到店，1快递",required = true)
    private Integer exchangeType;

    @ApiModelProperty(value = "库存数量，可设置为0，0为不限制库存数量")
    private Integer stockNum = 0;

    @ApiModelProperty(value = "每人可领取数量")
    private Integer restrictNum;

    @NotBlank(message = "封面图为必选项")
    @ApiModelProperty(value = "封面图url",required = true)
    private String coverImageUrl;

    @NotBlank(message = "礼品图为必选项")
    @ApiModelProperty(value = "礼品url",required = true)
    private String giftImageUrl;

    @NotBlank(message = "非指定会员提示信息为必填项")
    @ApiModelProperty(value = "非指定会员提示信息",required = true)
    private String nonChooseMemberMessage;

    @NotBlank(message = "非平台注册会员提示信息为必填项")
    @ApiModelProperty(value = "非平台注册会员提示信息",required = true)
    private String nonMemberMessage;

    @ApiModelProperty(value = "0未开启，1开启")
    private Integer eventEnabledStatus;


//    @ApiModelProperty(value = "门店Id列表")
//    private List<AddEventShopRelationDTO> shopList;

    @NotEmpty(message = "指定用户为必选项")
    @ApiModelProperty(value = "指定用户绑定手机号",required = true)
    private List<String> mobileList;

    @ApiModelProperty(value = "优惠券ID列表")
    @Size(max = 1,message = "无法选择一个以上的优惠券项目")
    private List<Long> couponIdList;

    @ApiModelProperty(value = "活动介绍")
    private String presentation;

}
