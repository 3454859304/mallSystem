package com.pjy.mallsystem.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 16:33:33
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

