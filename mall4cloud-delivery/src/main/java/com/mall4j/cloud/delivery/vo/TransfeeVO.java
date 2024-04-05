package com.mall4j.cloud.delivery.vo;

import com.mall4j.cloud.api.delivery.vo.AreaVO;
import com.mall4j.cloud.common.vo.BaseVO;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 运费项VO
 *
 * @author FrozenWatermelon
 * @date 2020-12-07 15:10:01
 */
public class TransfeeVO extends BaseVO{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("运费项id")
    private Long transfeeId;

    @ApiModelProperty("运费模板id")
    private Long transportId;

    @ApiModelProperty("续件数量")
    private Double continuousPiece;

    @ApiModelProperty("首件数量")
    private Double firstPiece;

    @ApiModelProperty("续件费用")
    private Long continuousFee;

    @ApiModelProperty("首件费用")
    private Long firstFee;

	@ApiModelProperty(value = "指定条件运费城市项")
	private List<AreaVO> cityList;

	public List<AreaVO> getCityList() {
		return cityList;
	}

	public void setCityList(List<AreaVO> cityList) {
		this.cityList = cityList;
	}
	public Long getTransfeeId() {
		return transfeeId;
	}

	public void setTransfeeId(Long transfeeId) {
		this.transfeeId = transfeeId;
	}

	public Long getTransportId() {
		return transportId;
	}

	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}

	public Double getContinuousPiece() {
		return continuousPiece;
	}

	public void setContinuousPiece(Double continuousPiece) {
		this.continuousPiece = continuousPiece;
	}

	public Double getFirstPiece() {
		return firstPiece;
	}

	public void setFirstPiece(Double firstPiece) {
		this.firstPiece = firstPiece;
	}

	public Long getContinuousFee() {
		return continuousFee;
	}

	public void setContinuousFee(Long continuousFee) {
		this.continuousFee = continuousFee;
	}

	public Long getFirstFee() {
		return firstFee;
	}

	public void setFirstFee(Long firstFee) {
		this.firstFee = firstFee;
	}

	@Override
	public String toString() {
		return "TransfeeVO{" +
				"transfeeId=" + transfeeId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",transportId=" + transportId +
				",continuousPiece=" + continuousPiece +
				",firstPiece=" + firstPiece +
				",continuousFee=" + continuousFee +
				",firstFee=" + firstFee +
				'}';
	}
}
