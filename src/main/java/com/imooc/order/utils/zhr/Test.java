package com.imooc.order.utils.zhr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-05 10:20
 * @Version 1.0
 **/
public class Test {

  public static void main(String[] args) {

    List<Person> personList = new ArrayList<>();
    personList.add(new Person("tom", 16, "男"));
    personList.add(new Person("aimy", 32, "男"));
    personList.add(new Person("jfrerry", 28, "男"));
    personList.add(new Person("tony", 12, "男"));
    personList.add(new Person("jeick", 47, "男"));
    personList.add(new Person("jams", 16, "男"));
    personList.add(new Person("bob", 18, "男"));

    System.out.println(personList);
    System.out.println();
    System.out.println();

    //1.匿名内部类
//    Collections.sort(personList, new Comparator<Person>() {
//      @Override
//      public int compare(Person o1, Person o2) {
//        return o1.getAge() - o2.getAge();
//      }
//    });

    //2.lambda
//    Collections.sort(personList, (Person p1, Person p2) -> p1.getAge() - p2.getAge());
//    Collections.sort(personList, (p1, p2) -> p1.getAge() - p2.getAge());
//    Collections.sort(personList, (Person p1, Person p2) -> {
//      return p1.getAge() - p2.getAge();
//    });

    //3.静态方法引用
//    Collections.sort(personList,Person::compareByAge);

    //4.实例方法引用
//    PersonUtil personUtil = new PersonUtil();
//    System.out.println("jfrerry".hashCode());
//    System.out.println("bob".hashCode());
//    System.out.println("tom".hashCode());
//    Collections.sort(personList,personUtil::compareByName);

//    System.out.println(personList);

    //5。构造方法引用
    IPersion iPersion = Person::new;
    Person person = iPersion.initPersion("tom",16,"男");
    System.out.println(person);


  }
}
