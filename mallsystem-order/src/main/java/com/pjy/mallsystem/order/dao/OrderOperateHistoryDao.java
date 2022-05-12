package com.pjy.mallsystem.order.dao;

import com.pjy.mallsystem.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:47
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
