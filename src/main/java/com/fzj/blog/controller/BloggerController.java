package com.fzj.blog.controller;

import com.fzj.blog.pojo.Blogger;
import com.fzj.blog.service.BloggerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by j on 2016/10/8.
 */

@Controller
@RequestMapping("blogger")
public class BloggerController {

    @Autowired
    private BloggerService bloggerService;

    @RequestMapping(value = "login")
    public String loginUI(Blogger blogger){
        return "login";
    }


    @RequestMapping(value = "denglu")
    public String login(@Param("username") String username ,@Param("password") String password ,
                        HttpServletRequest request,Model model)
    {
        HttpSession session =request.getSession();
        session.setAttribute("username",username);
        session.setAttribute("password",password);
        if(username==null||username.equals("")){
            model.addAttribute("error","用户名不能为空");
            return "login";
        }
        else if(password==null||password.equals("")){
            model.addAttribute("error","密码不能为空");
            return "login";
        }

        HashMap<String,Object> b =new HashMap<String,Object>();
        b.put("username",username);
        b.put("password",password);
        System.out.print("0000"+username);

        Blogger blogger =bloggerService.login(b);
        System.out.print("11111"+blogger);
        session.setAttribute("blogger",blogger);
        if(blogger==null){
            model.addAttribute("error","账户密码错误");
            return "error";
        }
        else{
            return "show";
        }

    }


    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Blogger blogger ){
        bloggerService.update(blogger);
        System.out.print("_____________________________________________________________________________________");
        return "ok";
    }


    @RequestMapping(value ="updateUI/{username}")
    public String updateUI(@PathVariable("username") String username ,HttpServletRequest request){
        request.setAttribute("username",username);
        return "loggerUpdate";
    }
}
