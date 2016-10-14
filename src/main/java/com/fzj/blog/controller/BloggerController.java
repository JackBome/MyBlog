package com.fzj.blog.controller;

import com.fzj.blog.pojo.*;
import com.fzj.blog.service.BlogCategoryService;
import com.fzj.blog.service.BlogService;
import com.fzj.blog.service.BloggerService;
import com.fzj.blog.service.LinkService;
import com.fzj.blog.util.PageUtil;
import com.fzj.blog.util.StringUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/8.
 */

@Controller
@RequestMapping("blogger")
public class BloggerController {

    @Autowired
    private BloggerService bloggerService;

    @Resource
    private BlogService blogService;

    @Resource
    private LinkService linkService;

    @Resource
    private BlogCategoryService blogCategoryService;

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
    @RequestMapping(value = "BlogManagerUI")
    public String BlogManagerUI(@RequestParam(value = "page",required = false,defaultValue = "1") String page,
                        @RequestParam(value = "blogCategoryId",required = false) String blogCategoryId,
                        @RequestParam(value = "releaseDateStr",required = false)String releaseDateStr,
                        HttpServletRequest request, Model model) throws  Exception {


        if (StringUtil.isEmpty(page)) {
            page = "1";
        }

        PageEntity pageEntity = new PageEntity(Integer.parseInt(page), 10);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageEntity.getStart());
        map.put("size", pageEntity.getPageSize());
        map.put("blogCategoryId", blogCategoryId);
        map.put("releaseDateStr", releaseDateStr);

        //获得博客信息
        List<Blog> blogList = blogService.list(map);
        Blogger blogger = bloggerService.queryBlogger(1);
        List<BlogCategory> blogCategory = blogCategoryService.list(map);

        List<Link> linkList = linkService.queryAllLink(0, 10);
        //获得总数
        Long total = blogService.getTotal(map);
        model.addAttribute("blogList", blogList);
        model.addAttribute("blogCategory", blogCategory);
        model.addAttribute("linkList", linkList);
        model.addAttribute("blogger", blogger);
//        mav.addObject("blogList",blogList);
        StringBuffer param = new StringBuffer();//查询参数

        if (StringUtil.isNotEmpty(blogCategoryId)) {
            param.append("blogCategoryId=" + blogCategoryId + "&");
        }
        String pageHtml = PageUtil.genPagination(request.getContextPath() + "/index", total, Integer.parseInt(page), 10, param.toString());
        model.addAttribute("pageHtml", pageHtml);
        model.addAttribute("pageTitle", "标题");
        return "BlogManagerUI";

    }
}
