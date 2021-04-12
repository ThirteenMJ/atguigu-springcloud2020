package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thirteenmj
 * Date: 2021/4/12 23:55
 */
public interface OrderService {

    String getIdBySnowFlake();
}
