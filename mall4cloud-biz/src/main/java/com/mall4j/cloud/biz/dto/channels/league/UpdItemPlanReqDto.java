package com.mall4j.cloud.biz.dto.channels.league;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Description 修改推广计划
 * @Author axin
 * @Date 2023-02-20 17:07
 **/
@Data
public class UpdItemPlanReqDto {
    @ApiModelProperty(value = "计划ID")
    @NotNull(message = "计划id不能为空")
    private Long id;

    @ApiModelProperty(value = "计划名称")
    @NotBlank(message = "推广计划名称不能为空")
    @Length(max = 50,message = "长度超出限制")
    private String name;

//    @ApiModelProperty(value = "推广计划类型 1普通推广 2定向推广 3专属推广")
//    @NotNull(message = "推广计划类型不能为空")
//    private Integer type;
//
//    @ApiModelProperty(value = "计划开始时间")
//    @NotNull(message = "计划开始时间不能为空")
//    private Date beginTime;
//
//    @ApiModelProperty(value = "计划结束时间")
//    @NotNull(message = "计划结束时间不能为空")
//    private Date endTime;

    @ApiModelProperty(value = "添加达人列表")
    @Size(max = 30,message = "超出长度限制")
    private List<String> addFinderIds;

    @ApiModelProperty(value = "删除达人列表")
    @Size(max = 30,message = "超出长度限制")
    private List<String> delFinderIds;

    @ApiModelProperty(value = "添加商品")
    @Size(max = 20,message = "超出长度限制")
    private List<AddItem> addItems;

    @ApiModelProperty(value = "编辑商品")
    @Size(max = 20,message = "超出长度限制")
    private List<UpdItem> updItems;

    @ApiModelProperty(value = "删除商品")
    @Size(max = 20,message = "删除超出长度限制")
    private List<UpdItem> delItems;

}
