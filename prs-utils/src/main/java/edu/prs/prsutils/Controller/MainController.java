package edu.prs.prsutils.Controller;

import com.alibaba.fastjson.JSON;
import edu.prs.prsutils.Mapper.StationInfoMapper;
import edu.prs.prsutils.Model.StationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: Anhlaidh
 * @date: 2021-03-17 11:16
 */
@RestController
public class MainController {
    @Autowired
    StationInfoMapper mapper;
    @Autowired
    StringRedisTemplate template;

    @RequestMapping("test")
    public String test() {
        List<StationInfo> list = new ArrayList<>();
        StationInfo info = mapper.selectByPrimaryKey(1);
        System.out.println(info);
        list.add(info);
        String s = JSON.toJSONString(info);
        return s;
    }

    @RequestMapping("testRedis")
    public String RedisTest() {
        Long id = template.opsForValue().increment("id");
        return id+"";
    }
}
