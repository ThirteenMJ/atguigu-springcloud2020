package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

/**
 * @author thirteenmj
 * Date: 2021/4/12 23:53
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/snowflake")
    public String index() {
        return orderService.getIdBySnowFlake();
    }
}
