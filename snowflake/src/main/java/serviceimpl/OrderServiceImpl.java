package serviceimpl;

import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

/**
 * @author thirteenmj
 * Date: 2021/4/12 23:58
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public String getIdBySnowFlake() {
        return "hello snowflake";
    }
}
