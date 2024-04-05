package com.mall4j.cloud.seckill.constant;

/**
 * 等级
 * @author yxf
 * @date 2020/11/20
 */
public enum SuitableProdTypeEnum {

	/**
	 * 全部商品参与
	 */
	ALL_SPU(0),

	/**
	 * 指定商品参与
	 */
	ASSIGN_SPU(1)
	;

	private final Integer value;

	public Integer value() {
		return value;
	}

	SuitableProdTypeEnum(Integer value) {
		this.value = value;
	}

}
