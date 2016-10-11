package com.fzj.blog.controller;

import com.fzj.blog.pojo.Blog;
import com.fzj.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/10.
 */
@Controller
@RequestMapping("Blog")
public class BlogController {
    @Autowired
    private BlogService blogService;


    @RequestMapping("/articles/{id}")
    public String details(@PathVariable("id") Integer id, HttpServletRequest request) throws Exception{

        Blog blog =blogService.findById(id);

        request.setAttribute("blog",blog);
        //点击次数+1
        blog.setClickHit(blog.getClickHit()+1);
        //更新博客
        blogService.update(blog);
        //
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("blogId",blog.getId());
        map.put("title",blog.getTitle()+"博客");
        return "articles";
    }

    @RequestMapping(value = "articles" ,method = RequestMethod.GET)
    public String allArticles(Model model){
        Map<String,Object> map = new HashMap<String, Object>();
        List<Blog> blogList =blogService.list(map);
        model.addAttribute("blogList",blogList);
        return "articles";
    }
}
