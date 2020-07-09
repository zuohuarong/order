package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description
 * @Author zuohuarong
 * @Date 2020-07-07 15:10
 * @Version 1.0
 **/
public class ResultVOUtil {

  public static ResultVO success(Object object){
    ResultVO resultVO = new ResultVO();
    resultVO.setCode(0);
    resultVO.setMessage("成功");
    resultVO.setData(object);

    return resultVO;
  }
}
