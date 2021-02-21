import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

/**
 * @Author: thirteenmj
 * @Date: 2021/2/16 20:56
 */
public class T2 {

    @Test
    public void test1(){
        //默认时区
        ZonedDateTime zbj = ZonedDateTime.now();

        System.out.println(zbj);

        //2021-02-16T20:58:07.779+08:00[Asia/Shanghai]

    }
}
