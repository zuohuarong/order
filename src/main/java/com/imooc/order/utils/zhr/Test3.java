package com.imooc.order.utils.zhr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test3
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-05 14:10
 * @Version 1.0
 **/
public class Test3 {

  public static void main(String[] args) {
    //1.批量数据 --》 steam
    Stream stream = Stream.of("admin", "tom", "dum");

    //2.数组
    String[] stream2 = new String[]{"xueqi", "biyao"};

    //3.列表
    List<String> list = new ArrayList<>();
    list.add("少林");
    list.add("武当");
    list.add("青城");
    Stream stream3 = list.stream();

    //4。集合
    Set<String> set = new HashSet<>();
    set.add("少林罗汉钱");
    set.add("武汉扫堂腿");
    set.add("武汉18罗汉");
    Stream stream4 = set.stream();

    //5.Map
    Map<String, Integer> map = new HashMap<>();
    map.put("toom", 1000);
    map.put("jerry", 200);
    Stream stream5 = map.entrySet().stream();

    //stream对基本类型的功能封装
    //int / double /long
//    IntStream.of(new int[]{10,20,30}).forEach(System.out::println);
//    IntStream.range(1, 5).forEach(System.out::println);
//    IntStream.rangeClosed(1,5).forEach(System.out::println);

    //stream --> 指定对象
    //数组
//    Object[] objects = stream.toArray(String[]::new);
    //字符串
//    String string = stream.collect(Collectors.joining()).toString();
//    System.out.println(string);
    //list 列表
//    List<String> list1 = (List<String>) stream.collect(Collectors.toList());
//    System.out.println(list1);
    //集合
//    Set<String> set1 = (Set<String>) stream.collect(Collectors.toSet());
//    System.out.println(set1);
    //map
//    Map<String,String> map1 = (Map<String, String>) stream.collect(Collectors.toMap(x->x,y->"value:"+y));
//    System.out.println(map1);

    //stream常见API
    List<String> accountList = new ArrayList<>();
    accountList.add("likui");
    accountList.add("zhangsan");
    accountList.add("lisong");
    accountList.add("wusong");
    accountList.add("wulong");
    accountList.add("liuyuxuan");

    //map 中间操作 map()接收function接口
//    accountList = accountList.stream().map(x->"梁山好汉:"+x).collect(Collectors.toList());
    //filter 过滤
//    accountList = accountList.stream().filter(x->x.length()>5).collect(Collectors.toList());
    //foreach增强操作
    //peek() 中间操作 迭代数据完成数据的依次处理过程
//    accountList.stream().peek(x -> System.out.println("peek1:" + x))
//        .peek(x -> System.out.println("peek2:"+x))
//        .forEach(System.out::println);
//
//    accountList.forEach(System.out::println);

    //stream对数字操作
    List<Integer> integerList = new ArrayList<>();
    integerList.add(20);
    integerList.add(83);
    integerList.add(10);
    integerList.add(8);
    integerList.add(220);
    integerList.add(756);
    integerList.add(20);

    //skip() 中间操作,有状态，跳过部分数据
//    integerList.stream().skip(3).forEach(System.out::println);

    //limit() 中间操作,有状态，限制输出数量
//    integerList.stream().skip(3).limit(2).forEach(System.out::println);

    //distinct() 中间操作,有状态，删除重复
//    integerList.stream().distinct().forEach(System.out::println);
    //sorted() 中间操作,有状态，排序
    integerList = integerList.stream().sorted().collect(Collectors.toList());
    integerList.forEach(System.out::println);
    //max()
//    Optional optional = integerList.stream().max((x, y) -> x - y);
//    System.out.println(optional.get());
    //min()
    //reduce() 合并
//    Optional optional2 = integerList.stream().reduce((sum,x)->sum+x);
//    System.out.println(optional2.get());

  }
}
