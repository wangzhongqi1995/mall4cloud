package com.mall4j.cloud.api.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author FrozenWatermelon
 * @date 2020/11/16
 */
public class EsPageVO<T> {

    @ApiModelProperty("总页数")
    private Integer pages;

    @ApiModelProperty("总条目数")
    private Long total;

    @ApiModelProperty("结果集")
    private List<T> list;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "EsPageVO{" +
                ", pages=" + pages +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
