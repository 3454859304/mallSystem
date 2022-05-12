package com.pjy.mallsystem.member.dao;

import com.pjy.mallsystem.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:20:48
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
