package edu.prs.prsutils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.data.redis.core.RedisCommand;
import org.springframework.data.redis.core.RedisTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class PrsUtilsApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    RedisTemplate<String ,Object> template;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
        template.opsForValue().set("test",1);
        Object test = template.opsForValue().get("test");
        System.out.println(test);

    }

}
