package org.peng.blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(params = "login",method=RequestMethod.GET)
    public String doLogin(ModelMap model) { // 登录验证
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}
