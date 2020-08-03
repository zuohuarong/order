package com.imooc.order.controller;

import com.imooc.order.dto.CartDTO;
import com.imooc.order.entity.ProductInfo;
import com.imooc.order.feign.ProductClient;
import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ServerController
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-13 17:05
 * @Version 1.0
 **/
@RestController
@RequestMapping("/")
public class ClientController {

//  @Autowired
//  private LoadBalancerClient loadBalancerClient;

  @Autowired
  private ProductClient productClient;

//  @Autowired
//  private RestTemplate restTemplate;

  @GetMapping("/getProductMsg")
  public String msg(){
    //1.第一种方式 （直接使用RestTemplate，URL写死）
//    RestTemplate restTemplate = new RestTemplate();
//    String result = restTemplate.getForObject("http://localhost:8082/msg",String.class);

    //2。第二种方式  （通过loacbanlanceClient用应用名获取URL，再通过RestTemplate）
//    RestTemplate restTemplate = new RestTemplate();
//    ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT1");
//    serviceInstance.getHost();
//    String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()) + "/msg";
//    String result = restTemplate.getForObject("http://localhost:8082/msg",String.class);

    //3.第三种方式（用loadBalanced注解，可以在restBalance直接使用应用名称）
//    String result = restTemplate.getForObject("http://PRODUCT1/msg",String.class);

    String result = productClient.productMsg();
    return result;
  }

  @GetMapping(value = "findList",produces = {"application/json;charset=UTF-8"})
  public List<ProductInfo> findList(@RequestParam(value = "productIdList") List<String> productIdList){
    return productClient.findList(productIdList);
  }

  @GetMapping("productDecreaseStock")
  public String productDecreaseStock(){
    productClient.decreaseStock(Arrays.asList(new CartDTO("164103465734242707",3)));
    return "ok";
  }

}
