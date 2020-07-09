package com.imooc.order.enums;

import lombok.Getter;

/**
 * @ClassName OrderStatusEnum
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-06 13:49
 * @Version 1.0
 **/
@Getter
public enum OrderStatusEnum {

  NEW(0,"新下单"),
  FINISHED(1,"完结"),
  CANCEL(2,"取消");

  OrderStatusEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  private Integer code;
  private String message;
}
