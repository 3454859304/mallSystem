package com.pjy.mallsystem.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pjy.common.utils.PageUtils;
import com.pjy.mallsystem.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author pjy
 * @email 3454859304@qq.com
 * @date 2022-05-12 17:22:47
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

