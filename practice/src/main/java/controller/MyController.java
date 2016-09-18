package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by robu
 * Date:2016/9/2
 * Time:18:17
 */
@Controller
public class MyController {

    @RequestMapping(value = "/888", method = {RequestMethod.GET, RequestMethod.POST})
    public String initSystem(){
        System.out.println("init Spring system");
        return "initPage";
    }

}
