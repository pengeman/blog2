package org.peng.blog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
    private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

    @RequestMapping(value = "login")
    public ModelAndView doLogin(ModelMap model, String username, String pwd) { // 登录验证
        System.out.println("come to loginController");
        LOGGER.info("logger info");
        LOGGER.error("logger error");
        LOGGER.debug("logger debug");
        model.addAttribute("message", "Spring 3 MVC Hello World");
        model.addAttribute("username",username);
        model.addAttribute("pwd",pwd);
        //return "views/hello";
        ModelAndView mv = new ModelAndView("hello");
        System.out.println("username : " + username + " " + pwd);
        return mv;
    }
}
