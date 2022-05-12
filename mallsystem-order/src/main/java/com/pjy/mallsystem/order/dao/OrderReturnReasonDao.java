package com.pjy.mallsystem.order.dao;

import com.pjy.mallsystem.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:47
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
