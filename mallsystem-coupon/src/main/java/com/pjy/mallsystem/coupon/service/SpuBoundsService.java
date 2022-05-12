package com.pjy.mallsystem.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:15:40
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

