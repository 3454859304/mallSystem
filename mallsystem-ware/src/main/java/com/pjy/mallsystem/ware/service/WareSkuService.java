package com.pjy.mallsystem.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:24:05
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

