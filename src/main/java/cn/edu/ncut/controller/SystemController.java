package cn.edu.ncut.controller;

import cn.edu.ncut.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lh on 2017/4/14.
 */

@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getAuthorDetail() {
        return "/success";
    }


//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String getAuthorDetail() {
//        PubMap<String, Object> result = new HashMap<>();
//        List<User> userList = userService.getUserList();
//        result.put("size", userList.size());
//        return "/searchStatics/index";
//    }

}
