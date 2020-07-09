package com.imooc.order.dto;

import com.imooc.order.entity.OrderDetail;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Id;
import lombok.Data;

/**
 * @ClassName OrderDTO
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-06 17:11
 * @Version 1.0
 **/
@Data
public class OrderDTO {

  /**
   * 订单ID
   */
  private String orderId;

  /**
   * 买家名字
   */
  private String buyerName;

  /**
   * 买家电话
   */
  private String buyerPhone;

  /**
   * 买家地址
   */
  private String buyerAddress;

  /**
   * 买家微信openid
   */
  private String buyerOpenid;

  /**
   * 订单总金额
   */
  private BigDecimal orderAmount;

  /**
   * 订单状态, 默认为新下单
   */
  private Integer orderStatus;

  /**
   * 支付状态, 默认未支付
   */
  private Integer payStatus;

  private Date createTime;

  private Date updateTime;

  private List<OrderDetail> orderDetailList;
}
