package com.mall4j.cloud.api.product.dto;

import lombok.Data;

import java.util.List;

@Data
public class ErpSyncDTO {
    List<SpuErpSyncDTO> dtoList;
}
