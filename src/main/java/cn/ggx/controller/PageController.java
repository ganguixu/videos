package cn.ggx.controller;

import cn.ggx.entity.User;
import cn.ggx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PageController {
    @Autowired
    UserService userService ;

    @RequestMapping("/")
    public String page(){
        System.out.println("=============================");
        return "index";
    }

    @RequestMapping("/user")
    public String findUserAll(){
        List<User> userAll = userService.findUserAll();
        if (userAll!=null){
            System.out.println(userAll);
        }
        return "index";
    }

    @RequestMapping("/userByEmail")
    public String findUserByEmail(){
////        String email = request.getParameter("email");
//        List<User> userByEmail = userService.findUserByEmail(email);
//        if (userByEmail.size()>0){
//            System.out.println(userByEmail);
//        }
        System.out.println("你好userByEmail");
        return "index";
    }

    @RequestMapping("/userById")
    public String findUserByIds(HttpServletRequest request){
        String id = request.getParameter("id");
        Integer[] ids = new Integer[]{Integer.valueOf(id)};
        List<User> userByEmail = userService.findUserByids(ids);
        if (userByEmail.size()>0){
            System.out.println(userByEmail);
        }
        return "index";
    }
}
