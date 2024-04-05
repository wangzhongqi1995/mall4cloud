package com.mall4j.cloud.coupon.constant;

/**
 * 活动 [状态]
 *
 * @author shijing
 * @date 2021-12-10 18:07:21
 */

public enum ActivityStatusEnum {
    /**
     * 0：启用
     */
    ENABLE(0, "启用"),

    /**
     * 1：停用
     */
    DISABLE(1,"未启用"),
    /**
     * 0：启用
     */
    NOT_START(2, "未开始"),

    /**
     * 1：停用
     */
    START(3,"进行中"),
    /**
     * 1：停用
     */
    OVER(4,"已结束")
    ;

    private final Integer value;

    private final String desc;

    public Integer value() {
        return value;
    }

    public String desc() {
        return desc;
    }

    ActivityStatusEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ActivityStatusEnum instance(Integer value) {
        ActivityStatusEnum[] enums = values();
        for (ActivityStatusEnum statusEnum : enums) {
            if (statusEnum.value().equals(value)) {
                return statusEnum;
            }
        }
        return null;
    }

}
