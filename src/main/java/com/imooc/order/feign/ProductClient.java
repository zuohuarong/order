package com.imooc.order.feign;

import com.imooc.order.dto.CartDTO;
import com.imooc.order.entity.ProductInfo;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName ProductClient
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-20 18:32
 * @Version 1.0
 **/
@FeignClient(name = "product")
public interface ProductClient {

  @GetMapping("/msg")
  String productMsg();

  @GetMapping("/product/findList")
  List<ProductInfo> findList(@RequestParam("productIdList") List<String> productIdList);

  @PostMapping("/product/findList1")
  List<ProductInfo> findList1(@RequestBody List<String> productIdList);

  /**
   * 减商品库存
   * @param cartDTOList
   */
  @PostMapping("/product/decrease")
  void decreaseStock(@RequestBody List<CartDTO> cartDTOList);

}
