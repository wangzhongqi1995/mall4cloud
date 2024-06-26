package com.mall4j.cloud.product.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
/**
 * 购物车
 *
 * @author FrozenWatermelon
 * @date 2020-11-21 10:01:23
 */
public class ShopCartItem extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long cartItemId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 产品ID
     */
    private Long spuId;

    /**
     * SkuID
     */
    private Long skuId;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 购物车产品个数
     */
    private Integer count;

    /**
     * 满减活动ID
     */
    private Long discountId;

    /**
     * 售价，加入购物车时的商品价格
     */
    private Long priceFee;

    /**
     * 分销员用户id
     */
    private Long distributionUserId;

	/**
	 * 是否已经勾选
	 */
	private Integer isChecked;

	/**
	 * 店铺是否停业 1：否 0：是
	 */
	private Integer isClosed;

	public Integer getIsClosed() {
		return isClosed;
	}

	public void setIsClosed(Integer isClosed) {
		this.isClosed = isClosed;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Long getPriceFee() {
		return priceFee;
	}

	public void setPriceFee(Long priceFee) {
		this.priceFee = priceFee;
	}

	public Long getDistributionUserId() {
		return distributionUserId;
	}

	public void setDistributionUserId(Long distributionUserId) {
		this.distributionUserId = distributionUserId;
	}


	public Integer getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(Integer isChecked) {
		this.isChecked = isChecked;
	}

	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	@Override
	public String toString() {
		return "ShopCartItem{" +
				"cartItemId=" + cartItemId +
				", shopId=" + shopId +
				", spuId=" + spuId +
				", skuId=" + skuId +
				", categoryId=" + categoryId +
				", userId=" + userId +
				", count=" + count +
				", discountId=" + discountId +
				", priceFee=" + priceFee +
				", distributionUserId=" + distributionUserId +
				", isChecked=" + isChecked +
				", isClosed=" + isClosed +
				'}';
	}
}
