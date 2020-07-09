package com.imooc.order.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 * @ClassName OrderDetail
 * @Description
 * @Author zuohuarong
 * @Date 2020-06-24 17:16
 * @Version 1.0
 **/
@Entity
@Data
public class OrderDetail {


  @Id
  private String detailId;

  private String orderId;

  private String productId;
  /**
   * 商品名称
   */
  private String productName;
  /**
   * 当前价格,单位分
   */
  private BigDecimal productPrice;
  /**
   * 数量
   */
  private Integer productQuantity;
  /**
   * 小图
   */
  private String productIcon;

  private Date createTime;

  private Date updateTime;


}
