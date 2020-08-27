package com.imooc.order.utils.zhr;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ClassA
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-13 15:38
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassA {

  private String name;

  private List<ClassB> classBList;

  public static void main(String[] args) {
    ClassC c1 = new ClassC("c1");
    ClassC c2 = new ClassC("c2");
    List<ClassC> listc1 = new ArrayList<>();
    listc1.add(c1);
    listc1.add(c2);

    ClassC c3 = new ClassC("c3");
    ClassC c4 = new ClassC("c4");
    List<ClassC> listc2 = new ArrayList<>();
    listc2.add(c3);
    listc2.add(c4);

    ClassB b1 = new ClassB("b1",listc1);
    ClassB b2 = new ClassB("b1",listc2);

    List<ClassB> classBList = new ArrayList<>();
    classBList.add(b1);
    classBList.add(b2);

    ClassA a1 = new ClassA("a1",classBList);
    List<ClassA> classAS = new ArrayList<>();
    classAS.add(a1);

    classAS.forEach(classA -> {
      List<ClassB> classBList1 = classA.getClassBList();

    });
  }
}
