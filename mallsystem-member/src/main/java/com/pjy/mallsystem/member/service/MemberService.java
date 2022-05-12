package com.pjy.mallsystem.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:20:48
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

