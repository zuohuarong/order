package com.imooc.order.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
  WAIT(0,"等待支付"),
  SUCCESS(1,"完成支付");

  PayStatusEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  private Integer code;
  private String message;
}
