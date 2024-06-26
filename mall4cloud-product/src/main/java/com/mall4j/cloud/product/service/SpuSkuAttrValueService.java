package com.mall4j.cloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall4j.cloud.common.product.dto.SpuSkuAttrValueDTO;
import com.mall4j.cloud.product.model.SpuAttrValue;
import com.mall4j.cloud.product.model.SpuSkuAttrValue;

import java.util.List;

/**
 * 商品sku销售属性关联信息
 *
 * @author FrozenWatermelon
 * @date 2020-10-28 15:27:24
 */
public interface SpuSkuAttrValueService extends IService<SpuSkuAttrValue> {

	/**
	 * 保存商品sku销售属性关联信息
	 *
	 * @param spuSkuAttrValueList 商品sku销售属性关联信息
	 */
	void save(List<SpuSkuAttrValueDTO> spuSkuAttrValueList);

	/**
	 * 批量更新商品sku销售属性关联信息
	 *
	 * @param spuSkuAttrValues 商品sku销售属性关联信息
	 */
	void updateBatch(List<SpuSkuAttrValue> spuSkuAttrValues);

	/**
	 * 根据商品sku销售属性关联信息id删除商品sku销售属性关联信息
	 *
	 * @param spuSkuAttrId
	 */
	void deleteById(Long spuSkuAttrId);

	/**
	 * 根据spuId删除sku信息
	 *
	 * @param spuId spuId
	 */
	void updateBySpuId(Long spuId);

	/**
	 * 根据skuId列表，改变销售属性状态
	 * @param skuIds
	 * @param status
	 */
    void changeStatusBySkuId(List<Long> skuIds, Integer status);

    List<SpuSkuAttrValue> getSpuSkuAttrValueBySkuId(Long spuId);


}
