package com.mall4j.cloud.api.biz.dto.livestore.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RelatedAftersaleInfo {

    @JsonProperty("aftersale_list")
    private List<Aftersale> aftersale;
}
