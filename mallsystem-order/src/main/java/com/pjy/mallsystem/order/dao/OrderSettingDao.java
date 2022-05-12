package com.pjy.mallsystem.order.dao;

import com.pjy.mallsystem.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:46
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
