package com.pjy.mallsystem.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:15:41
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

