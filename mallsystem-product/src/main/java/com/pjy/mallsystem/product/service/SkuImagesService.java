package com.pjy.mallsystem.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

