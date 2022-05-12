package com.pjy.mallsystem.coupon.dao;

import com.pjy.mallsystem.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:15:41
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
