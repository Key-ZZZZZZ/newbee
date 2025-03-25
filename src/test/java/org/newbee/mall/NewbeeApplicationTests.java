package org.newbee.mall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) // 排除数据源自动配置
public class NewbeeApplicationTests {

    @Test
    void contextLoads() {
    }
}