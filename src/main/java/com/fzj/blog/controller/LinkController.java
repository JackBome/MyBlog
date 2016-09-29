package com.fzj.blog.controller;

import com.fzj.blog.pojo.Link;
import com.fzj.blog.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by j on 2016/9/29.
 */
@Controller
@RequestMapping("link")
public class LinkController {

//    自动注入LinkService
    @Autowired
    private LinkService linkService;

    @RequestMapping(value = "list" ,method = RequestMethod.GET)
    public String list(Model model){
        List<Link> linkList =linkService.queryAllLink(0,10);
        model.addAttribute("linkList",linkList);
        return "list";
    }

//    删除
    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        linkService.delLink(id);
        return "redirect:/link/list";
    }

//    修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Link link){
        linkService.updateLink(link);
        return "redirect:/link/list";
    }
//    添加
    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    public String add(Link link){
        linkService.addLink(link);
        return "redirect:/link/list";
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
        return "addUI";
    }
}

