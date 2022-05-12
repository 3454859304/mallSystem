package com.pjy.mallsystem.order.dao;

import com.pjy.mallsystem.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
