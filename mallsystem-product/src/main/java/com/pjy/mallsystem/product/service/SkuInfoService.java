package com.pjy.mallsystem.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

