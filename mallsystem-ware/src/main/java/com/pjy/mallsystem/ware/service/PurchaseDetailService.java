package com.pjy.mallsystem.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.mallsystem.common.utils.PageUtils;
import com.pjy.mallsystem.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:24:05
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

