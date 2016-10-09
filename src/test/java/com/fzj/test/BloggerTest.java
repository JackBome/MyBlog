package com.fzj.test;

import com.fzj.blog.pojo.Blogger;
import com.fzj.blog.service.BloggerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

/**
 * Created by j on 2016/10/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})

public class BloggerTest {
    @Autowired
    private BloggerService bloggerService;

    @Test
    public void test1(){
        HashMap<String,Object> blogger =new HashMap<String, Object>();
        blogger.put("username","fan");
        blogger.put("password","123456");
        Blogger b =bloggerService.login(blogger);
        System.out.print("1111111"+b);
    }

    @Test
    public void test2(){
        Blogger blogger =new Blogger();
        blogger.setUserName("00");
        blogger.setPassWord("00");
        blogger.setNickName("00");
        blogger.setId(2);
        blogger.setProFile("00");
        bloggerService.update(blogger);
    }
}
