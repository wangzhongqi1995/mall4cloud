package com.mall4j.cloud.common.product.dto;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * 属性值-国际化表DTO
 *
 * @author YXF
 * @date 2021-04-15 16:47:33
 */
public class SpuAttrValueLangDTO{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("属性值id")
    private Long spuAttrValueId;

    @ApiModelProperty("语言 0.通用 1.中文 2.英文")
    private Integer lang;

    @ApiModelProperty("属性名称")
    private String attrName;

    @ApiModelProperty("属性值")
    private String attrValueName;

    @ApiModelProperty("属性值")
    private String attrDesc;

	public Long getSpuAttrValueId() {
		return spuAttrValueId;
	}

	public void setSpuAttrValueId(Long spuAttrValueId) {
		this.spuAttrValueId = spuAttrValueId;
	}

	public Integer getLang() {
		return lang;
	}

	public void setLang(Integer lang) {
		this.lang = lang;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValueName() {
		return attrValueName;
	}

	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

	public String getAttrDesc() {
		return attrDesc;
	}

	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}

	@Override
	public String toString() {
		return "SpuAttrValueLangDTO{" +
				"spuAttrValueId=" + spuAttrValueId +
				",lang=" + lang +
				",attrName=" + attrName +
				",attrValueName=" + attrValueName +
				",attrDesc=" + attrDesc +
				'}';
	}
}
