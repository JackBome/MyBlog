package com.fzj.blog.controller;

import com.fzj.blog.pojo.Blog;
import com.fzj.blog.pojo.BlogCategory;
import com.fzj.blog.pojo.Link;
import com.fzj.blog.service.BlogCategoryService;
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
 * Created by j on 2016/10/17.
 */
@Controller
@RequestMapping("BlogCategory")
public class BlogCategoryController {

    @Autowired
    private BlogCategoryService blogCategoryService;

    @RequestMapping(value = "list" ,method = RequestMethod.GET)
    public String list(Model model){

        Map<String,Object> map = new HashMap<String, Object>();
        List<BlogCategory> blogCategoryList =blogCategoryService.list(map);
        model.addAttribute("blogCategoryList",blogCategoryList);
        return "BlogCategoryList";
    }

    //    删除
    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        blogCategoryService.delete(id);
        return "redirect:/blogcategory/BlogManagerUI";
    }

    //    修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(BlogCategory blogCategory){
        System.out.print(blogCategory);
        blogCategoryService.update(blogCategory);
        return "redirect:/blogcategory/list";
    }
    //    添加
    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    public String add(BlogCategory blogCategory){
        blogCategoryService.add(blogCategory);
        return "redirect:/blogcategory/list";
    }
    //    修改页面
    @RequestMapping("updateUI/{id}")
    public String updateUI(@PathVariable("id") Integer id, HttpServletRequest request){
        request.setAttribute("id",id);
        return "updateUI";
    }
    //    添加页面
    @RequestMapping("addUI")
    public String addUI(){
        return "addBlogCategoryUI";
    }

}
