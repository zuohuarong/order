package com.imooc.order.utils.zhr;

/**
 * @ClassName PersonUtil
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-05 11:02
 * @Version 1.0
 **/
public class PersonUtil {

  public int compareByName(Person p1, Person p2) {
    return p1.getName().hashCode() - p2.getName().hashCode();
  }
}
