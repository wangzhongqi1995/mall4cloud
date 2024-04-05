package com.mall4j.cloud.group.dto;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

/**
 * 拼团活动表DTO
 *
 * @author YXF
 * @date 2021-03-20 10:39:31
 */
public class GroupActivityDTO{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("拼团活动id")
    private Long groupActivityId;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("活动名称")
    private String activityName;

    @ApiModelProperty("活动开始时间（活动状态：未开始、经行中、已结束）")
    private Date startTime;

    @ApiModelProperty("活动结束时间（活动状态：未开始、经行中、已结束）")
    private Date endTime;

    @ApiModelProperty("成团人数")
    private Integer groupNumber;

    @ApiModelProperty("商品是否限购（1:限购、0:不限购）")
    private Integer hasMaxNum;

    @ApiModelProperty("限购数量")
    private Integer maxNum;

    @ApiModelProperty("是否模拟成团（1:模拟参团、0:不模拟）")
    private Integer hasRobot;

    @ApiModelProperty("活动是否预热")
    private Integer isPreheat;

    @ApiModelProperty("是否开启凑团模式（1:凑团、0:不凑团）")
    private Integer hasGroupTip;

    @ApiModelProperty("商品id")
    private Long spuId;

    @ApiModelProperty("拼团状态(-1:删除、0:未启用、1:启用、2:违规下架、3:等待审核 4:已失效 5:已结束)")
    private Integer status;

	@ApiModelProperty("商品价格（sku最低价）")
	private Long price;

    @ApiModelProperty("团购sku")
    private List<GroupSkuDTO> groupSkuList;

	@ApiModelProperty("指定门店类型 0-所有门店 1-部分门店")
    private Integer limitStoreType;

	@ApiModelProperty("指定门店集合")
    private List<Long> limitStoreIdList;

	public Long getGroupActivityId() {
		return groupActivityId;
	}

	public void setGroupActivityId(Long groupActivityId) {
		this.groupActivityId = groupActivityId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}

	public Integer getHasMaxNum() {
		return hasMaxNum;
	}

	public void setHasMaxNum(Integer hasMaxNum) {
		this.hasMaxNum = hasMaxNum;
	}

	public Integer getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getHasRobot() {
		return hasRobot;
	}

	public void setHasRobot(Integer hasRobot) {
		this.hasRobot = hasRobot;
	}

	public Integer getIsPreheat() {
		return isPreheat;
	}

	public void setIsPreheat(Integer isPreheat) {
		this.isPreheat = isPreheat;
	}

	public Integer getHasGroupTip() {
		return hasGroupTip;
	}

	public void setHasGroupTip(Integer hasGroupTip) {
		this.hasGroupTip = hasGroupTip;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<GroupSkuDTO> getGroupSkuList() {
		return groupSkuList;
	}

	public void setGroupSkuList(List<GroupSkuDTO> groupSkuList) {
		this.groupSkuList = groupSkuList;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getLimitStoreType() {
		return limitStoreType;
	}

	public void setLimitStoreType(Integer limitStoreType) {
		this.limitStoreType = limitStoreType;
	}

	public List<Long> getLimitStoreIdList() {
		return limitStoreIdList;
	}

	public void setLimitStoreIdList(List<Long> limitStoreIdList) {
		this.limitStoreIdList = limitStoreIdList;
	}

	@Override
	public String toString() {
		return "GroupActivityDTO{" +
				"groupActivityId=" + groupActivityId +
				",shopId=" + shopId +
				",activityName=" + activityName +
				",startTime=" + startTime +
				",endTime=" + endTime +
				",groupNumber=" + groupNumber +
				",hasMaxNum=" + hasMaxNum +
				",maxNum=" + maxNum +
				",hasRobot=" + hasRobot +
				",isPreheat=" + isPreheat +
				",hasGroupTip=" + hasGroupTip +
				",spuId=" + spuId +
				",price=" + price +
				",status=" + status +
				",groupSkuList=" + groupSkuList +
				'}';
	}
}