package com.mall4j.cloud.product.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
/**
 * 属性值信息
 *
 * @author FrozenWatermelon
 * @date 2020-10-28 15:27:24
 */
public class AttrValue extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Long attrValueId;

    /**
     * 属性ID
     */
    private Long attrId;

    /**
     * 属性值
     */
    private String value;

    private String name;

	/**
	 * 属性值图片
	 */
	private String imgUrl;

	public Long getAttrValueId() {
		return attrValueId;
	}

	public void setAttrValueId(Long attrValueId) {
		this.attrValueId = attrValueId;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "AttrValue{" +
				"attrValueId=" + attrValueId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",attrId=" + attrId +
				",value=" + value +
				'}';
	}
}
