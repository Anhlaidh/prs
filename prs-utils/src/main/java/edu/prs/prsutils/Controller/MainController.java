package edu.prs.prsutils.Controller;

import edu.prs.prsutils.Mapper.StationInfoMapper;
import edu.prs.prsutils.Model.StationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Anhlaidh
 * @date: 2021-03-17 11:16
 */
@RestController
public class MainController {
    @Autowired
    StationInfoMapper mapper;
    @RequestMapping("test")
    public StationInfo test() {
        System.out.println(mapper.selectByPrimaryKey(1).getName());
        return mapper.selectByPrimaryKey(15);
    }
}
