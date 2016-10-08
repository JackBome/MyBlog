package com.fzj.test;

import com.fzj.blog.pojo.Link;
import com.fzj.blog.service.LinkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by j on 2016/10/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class test {
    @Resource
    private LinkService linkService;

    @Test
    public void test1(){
        int i =linkService.delLink(5);
    }

    @Test
    public void test2(){
        Link link =new Link();
        link.setId(10);
        link.setLinkUrl("10");
        link.setLinkName("10");
        link.setOrderNo(10);
        linkService.addLink(link);

    }
    @Test
    public void test3(){
        Link link =new Link();
        link.setId(10);
        link.setLinkName("10");
        link.setLinkUrl("100");
        link.setOrderNo(10);
        linkService.updateLink(link);
    }
}
