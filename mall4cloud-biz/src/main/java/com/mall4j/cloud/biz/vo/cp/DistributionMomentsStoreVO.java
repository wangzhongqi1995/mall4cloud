package com.mall4j.cloud.biz.vo.cp;

import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.annotations.ApiModelProperty;

/**
 * 分销推广-朋友圈门店VO
 *
 * @author ZengFanChang
 * @date 2021-12-22 22:05:57
 */
public class DistributionMomentsStoreVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("朋友圈ID")
    private Long momentsId;

    @ApiModelProperty("门店ID")
    private Long storeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMomentsId() {
		return momentsId;
	}

	public void setMomentsId(Long momentsId) {
		this.momentsId = momentsId;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "DistributionMomentsStoreVO{" +
				"id=" + id +
				",momentsId=" + momentsId +
				",storeId=" + storeId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				'}';
	}
}
