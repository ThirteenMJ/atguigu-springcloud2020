package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.enties.CommonResult;
import com.atguigu.springcloud.enties.Payment;

/**
 * @author thirteenmj
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客户自定义, global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客户自定义, global handlerException-----2");
    }
}
