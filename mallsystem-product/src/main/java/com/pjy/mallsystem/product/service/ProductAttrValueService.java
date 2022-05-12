package com.pjy.mallsystem.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

