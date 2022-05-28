package com.pjy.mallsystem.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:20:48
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

