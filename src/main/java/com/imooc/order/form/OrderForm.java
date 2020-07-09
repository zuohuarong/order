package com.imooc.order.form;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @ClassName OrderForm
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-07 14:11
 * @Version 1.0
 **/
@Data
public class OrderForm {

  /**
  买家姓名
   */
  @NotEmpty(message = "姓名必填")
  private String name;

  /**
   * 买家电话
   */
  @NotEmpty(message = "电话必填")
  private String phone;

  /**
   * 买家地址
   */
  @NotEmpty(message = "地址必填")
  private String address;

  /**
   * 买家微信openID
   */
  @NotEmpty(message = "微信openID必填")
  private String openid;

  /**
   * 购物车
   */
  @NotEmpty(message = "购物车不能为空")
  private String items;


}
