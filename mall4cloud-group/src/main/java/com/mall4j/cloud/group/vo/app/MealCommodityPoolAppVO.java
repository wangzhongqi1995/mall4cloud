package com.mall4j.cloud.group.vo.app;

import com.mall4j.cloud.group.vo.MealCommodityPoolDetailVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel("套餐一口价商品池实体-app")
public class MealCommodityPoolAppVO implements Serializable {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("套餐一口价表id")
    private Integer mealId;
    @ApiModelProperty("商品池名称")
    private String commodityPoolName;
    @ApiModelProperty("商品池内选择件数")
    private Integer commodityPoolNum;
    @ApiModelProperty("商品列表")
    private List<MealCommodityPoolDetailAppVO> details;
}

