package com.pjy.mallsystem.ware.dao;

import com.pjy.mallsystem.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:24:05
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
