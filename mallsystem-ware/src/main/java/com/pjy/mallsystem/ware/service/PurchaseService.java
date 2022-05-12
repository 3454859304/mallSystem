package com.pjy.mallsystem.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:24:05
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

