package com.mall4j.cloud.group.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "open_screen_ad_shop")
public class OpenScreenAdShop implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Long shopId;
    private Integer activityId;
}
