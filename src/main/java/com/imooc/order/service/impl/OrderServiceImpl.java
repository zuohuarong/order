package com.imooc.order.service.impl;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.entity.OrderMaster;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import com.imooc.order.repository.OrderDetailRepository;
import com.imooc.order.repository.OrderMasterRepository;
import com.imooc.order.service.OrderService;
import com.imooc.order.utils.KeyUtil;
import java.math.BigDecimal;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-06 17:11
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderMasterRepository orderMasterRepository;

  @Autowired
  private OrderDetailRepository orderDetailRepository;
  /**
   *
   * @param orderDTO
   * @return
   */
  @Override
  public OrderDTO create(OrderDTO orderDTO) {
    /**
     * 2。查询商品信息
     * 3。计算总价
     * 4。扣库存
     * 5。订单入库
     */

    OrderMaster orderMaster = new OrderMaster();
    orderDTO.setOrderId(KeyUtil.genUniqueKey());
    BeanUtils.copyProperties(orderDTO,orderMaster);
    orderMaster.setOrderAmount(new BigDecimal(5));
    orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
    orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
    orderMasterRepository.save(orderMaster);

    return orderDTO;
  }
}
