package com.imooc.order.utils.zhr;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ClassB
 * @Description
 * @Author zuohuarong
 * @Date 2020-08-13 15:39
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassB {

  private String name;

  private List<ClassC> classCList;
}
