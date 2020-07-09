package com.imooc.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.imooc.order.converter.OrderForm2OrderDTOConvert;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import com.imooc.order.service.OrderService;
import com.imooc.order.utils.ResultVOUtil;
import com.imooc.order.vo.ResultVO;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-06 16:43
 * @Version 1.0
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

  @Autowired
  private OrderService orderService;

  /**
   * 1.参数校验
   * 2。查询商品信息
   * 3。计算总价
   * 4。扣库存
   * 5。订单入库
   */
  @PostMapping("/create")
  public ResultVO<Map<String,String>> creat(@Valid OrderForm orderForm, BindingResult bindingResult){
    if(bindingResult.hasErrors()){
      log.error("[创建订单]参数不正确，orderForm={}",orderForm);
      throw new OrderException(ResultEnum.PARAMS_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
    }
    OrderDTO orderDTO = OrderForm2OrderDTOConvert.convert(orderForm);
    if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
      log.error("[创建订单]购物车为空");
      throw new OrderException(ResultEnum.CART_EMPTY);
    }
    OrderDTO result = orderService.create(orderDTO);
    Map<String,String> map = new HashMap<>();
    map.put("orderId",result.getOrderId());
    return ResultVOUtil.success(map);
  }

  public static void main(String[] args) {
    //{"pics":["http://wutianrss.cycares.cn/ESD01.png","http://wutianrss.cycares.cn/ESD02.png","http://wutianrss.cycares.cn/ESD03.png","http://wutianrss.cycares.cn/ESD04.png","http://wutianrss.cycares.cn/ESD05.png","http://wutianrss.cycares.cn/ESD06.png","http://wutianrss.cycares.cn/ESD07.png","http://wutianrss.cycares.cn/ESD08.png","http://wutianrss.cycares.cn/ESD09.png","http://wutianrss.cycares.cn/ESD10.png","http://wutianrss.cycares.cn/ESD11.png","http://wutianrss.cycares.cn/ESD12.png","http://wutianrss.cycares.cn/ESD13.png","http://wutianrss.cycares.cn/ESD14.png","http://wutianrss.cycares.cn/ESD15.png","http://wutianrss.cycares.cn/ESD16.png","http://wutianrss.cycares.cn/ESD17.png","http://wutianrss.cycares.cn/ESD18.png","http://wutianrss.cycares.cn/ESD19.png","http://wutianrss.cycares.cn/ESD20.png","http://wutianrss.cycares.cn/ESD21.png","http://wutianrss.cycares.cn/ESD22.png","http://wutianrss.cycares.cn/ESD23.png","http://wutianrss.cycares.cn/ESD24.png","http://wutianrss.cycares.cn/ESD25.png","http://wutianrss.cycares.cn/ESD26.png","http://wutianrss.cycares.cn/ESD27.png","http://wutianrss.cycares.cn/ESD28.png","http://wutianrss.cycares.cn/ESD29.png"]}

    //http://wutianrss.cycares.cn/zq/zq01.png
    JSONObject jsonObject = new JSONObject();
    String[] pics = new String[52];
    for(int i=0;i<52;i++){
      String a = "";
      if(i<9){
        a = "0"+(i+1);
      }else{
        a = "" + (i+1);
      }
      pics[i] = "http://wutianrss.cycares.cn/wesd/wesd"+a+".png";
    }
    jsonObject.put("pics",pics);
    System.out.println(jsonObject);
  }
}
