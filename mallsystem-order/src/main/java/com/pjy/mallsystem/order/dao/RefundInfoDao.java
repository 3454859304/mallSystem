package com.pjy.mallsystem.order.dao;

import com.pjy.mallsystem.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:46
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
