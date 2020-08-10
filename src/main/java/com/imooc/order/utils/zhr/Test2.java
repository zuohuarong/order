package com.imooc.order.utils.zhr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Test2
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-05 13:44
 * @Version 1.0
 **/
public class Test2 {

  public static void main(String[] args) {
    List<String> accounts = new ArrayList<>();
    accounts.add("tom");
    accounts.add("jerry");
    accounts.add("beita");
    accounts.add("vike");
    accounts.add("jerry");

    //1.
    for (String accout : accounts) {
      if (accout.length() >= 5) {
        System.out.println("有效帐号：" + accout);
      }
    }

    //2.迭代器
    Iterator<String> iterable = accounts.iterator();
    while (iterable.hasNext()) {
      String account = iterable.next();
      if (account.length() >= 5) {
        System.out.println("it有效帐号：" + account);
      }
    }

    //3.stram + lambda
    List<String> validAccounts = accounts.stream().filter(s -> s.length()>=5).collect(Collectors.toList());
    System.out.println(validAccounts);
    System.out.printf("123%s","z");
    System.out.println("Test2.main");
    System.out.println("args = [" + args + "]");
    System.out.println("validAccounts = " + validAccounts);

  }
}
