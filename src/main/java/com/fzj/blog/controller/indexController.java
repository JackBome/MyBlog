package com.fzj.blog.controller;

import com.fzj.blog.pojo.*;
import com.fzj.blog.service.BlogCategoryService;
import com.fzj.blog.service.BlogService;
import com.fzj.blog.service.BloggerService;
import com.fzj.blog.service.LinkService;
import com.fzj.blog.util.PageUtil;
import com.fzj.blog.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/10.
 */
@Controller
@RequestMapping("/")
public class indexController {
    @Resource
    private BlogService blogService;

    @Resource
    private BloggerService bloggerService;

    @Resource
    private LinkService linkService;

    @Resource
    private BlogCategoryService blogCategoryService;
    /**
     * 主页
     * @param page
     * @param blogCategoryId
     * @param releaseDateStr
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/main")
    public String index(@RequestParam(value = "page",required = false,defaultValue = "1") String page,
                              @RequestParam(value = "blogCategoryId",required = false) String blogCategoryId,
                              @RequestParam(value = "releaseDateStr",required = false)String releaseDateStr,
                              HttpServletRequest request, Model model) throws  Exception{

//        ModelAndView mav=new ModelAndView();

        if(StringUtil.isEmpty(page)){
            page="1";
        }

        PageEntity pageEntity =new PageEntity(Integer.parseInt(page),10);
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("start",pageEntity.getStart());
        map.put("size",pageEntity.getPageSize());
        map.put("blogCategoryId",blogCategoryId);
        map.put("releaseDateStr",releaseDateStr);

        //获得博客信息
        List<Blog> blogList =blogService.list(map);
        Blogger blogger =bloggerService.queryBlogger(1);
        List<BlogCategory> blogCategory =blogCategoryService.list(map);

        List<Link> linkList =linkService.queryAllLink(0,10);
        //获得总数
        Long total =blogService.getTotal(map);
        model.addAttribute("blogList",blogList);
        model.addAttribute("blogCategory",blogCategory);
        model.addAttribute("linkList",linkList);
        model.addAttribute("blogger",blogger);
//        mav.addObject("blogList",blogList);
        StringBuffer param =new StringBuffer();//查询参数

        if(StringUtil.isNotEmpty(blogCategoryId)){
            param.append("blogCategoryId="+blogCategoryId+"&");
        }
        String pageHtml = PageUtil.genPagination(request.getContextPath()+"/index",total,Integer.parseInt(page),10,param.toString());
        model.addAttribute("pageHtml",pageHtml);
        model.addAttribute("pageTitle","标题");
        return "main";
//        mav.addObject("pageHtml",pageHtml);
//        mav.addObject("mainPage", "foreground/blog/list.jsp");
//        mav.addObject("pageTitle","Java开源博客系统");
//        mav.setViewName("mainTemp");
//        return mav;
    }
}
