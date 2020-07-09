package com.imooc.order.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.entity.OrderDetail;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import java.util.ArrayList;
import java.util.List;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName OrderForm2OrderDTOConvert
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-07 14:38
 * @Version 1.0
 **/
@Slf4j
public class OrderForm2OrderDTOConvert {

  public static OrderDTO convert(OrderForm orderForm){
    OrderDTO orderDTO = new OrderDTO();
    orderDTO.setBuyerName(orderForm.getName());
    orderDTO.setBuyerPhone(orderForm.getPhone());
    orderDTO.setBuyerAddress(orderForm.getAddress());
    orderDTO.setBuyerOpenid(orderForm.getOpenid());

    List<OrderDetail> orderDetailList = new ArrayList<>();
    Gson gson = new Gson();
    try{
//      gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
      orderDetailList = JSON.parseArray(orderForm.getItems(),OrderDetail.class);
    }catch (Exception e){
      log.error("[json]转换错误，String={}",orderForm.getItems());
      throw new OrderException(ResultEnum.PARAMS_ERROR);
    }
    orderDTO.setOrderDetailList(orderDetailList);

    return orderDTO;
  }

  public static void main(String[] args) {
    String a = "[{\"productId\":\"157875196366160022\",\"productQuantity\":2}]";
    JSONArray array = JSON.parseArray(a);
    List<OrderDetail> list = JSON.parseArray(a,OrderDetail.class);
    System.out.println(list);
  }
}
