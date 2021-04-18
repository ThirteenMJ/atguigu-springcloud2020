package serviceimpl;

import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;
import service.OrderService;
import util.IdGeneratorSnowflake;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author thirteenmj
 * Date: 2021/4/12 23:58
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private IdGeneratorSnowflake idGenerator;

    @Override
    public String getIdBySnowFlake() {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            threadPool.submit(() -> {
                System.out.println(idGenerator.snowflakeId());
            });

        }
        threadPool.shutdown();

        return "hello snowflake";
    }
}
