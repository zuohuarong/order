package com.imooc.order.utils;

import java.util.Random;

/**
 * @ClassName KeyUtil
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-06 17:00
 * @Version 1.0
 **/
public class KeyUtil {

  /**
   * 生成唯一的主键
   * 时间+随机数6
   */
  public static synchronized String genUniqueKey(){
    Random random = new Random();
    Integer number = random.nextInt(900000)+100000;

    return System.currentTimeMillis() + String.valueOf(number);
  }
}
