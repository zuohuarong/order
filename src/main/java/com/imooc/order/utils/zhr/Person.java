package com.imooc.order.utils.zhr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-05 10:18
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  private String name;

  private Integer age;

  private String sex;

  public static int compareByAge(Person p1, Person p2) {
    return p1.age - p2.age;
  }
}
