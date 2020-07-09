package com.imooc.order.vo;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-07 15:09
 * @Version 1.0
 **/
@Data
public class ResultVO<T> {

  private Integer code;

  private String message;

  private T data;

}
