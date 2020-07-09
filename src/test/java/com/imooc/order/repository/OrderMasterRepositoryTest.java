package com.imooc.order.repository;

import com.imooc.order.entity.OrderMaster;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class OrderMasterRepositoryTest {

  @Autowired
  private OrderMasterRepository orderMasterRepository;

  @Test
  public void testSave(){
    OrderMaster orderMaster = new OrderMaster();
    orderMaster.setOrderId("123456");
    orderMaster.setBuyerAddress("北京");
    orderMaster.setBuyerName("小左");
    orderMaster.setBuyerOpenid("openid");
    orderMaster.setBuyerPhone("12345678912");
    orderMaster.setOrderAmount(new BigDecimal(2.5));
    orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
    orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
    orderMaster.setCreateTime(new Date());
    orderMaster.setUpdateTime(new Date());
    OrderMaster result = orderMasterRepository.save(orderMaster);
    System.out.println(result);
  }
}