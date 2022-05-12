package com.pjy.mallsystem.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

