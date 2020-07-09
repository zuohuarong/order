package com.imooc.order.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.imooc.order.entity.OrderDetail;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderDetailRepositoryTest {

  @Autowired
  private OrderDetailRepository orderDetailRepository;

  @Test
  public void saveTest(){
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setDetailId("123456");
    orderDetail.setOrderId("123456");
    orderDetail.setProductId("157875196366160022");
    orderDetail.setProductName("pidanzou");
    orderDetail.setProductIcon("http://xxx.xx.com/xx.png");
    orderDetail.setProductPrice(new BigDecimal(0.1));
    orderDetail.setProductQuantity(2);
    OrderDetail result = orderDetailRepository.save(orderDetail);
    System.out.println(result);
  }
}