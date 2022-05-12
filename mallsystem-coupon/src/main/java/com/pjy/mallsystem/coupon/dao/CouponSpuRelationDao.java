package com.pjy.mallsystem.coupon.dao;

import com.pjy.mallsystem.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:15:41
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
