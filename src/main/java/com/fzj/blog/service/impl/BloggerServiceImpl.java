package com.fzj.blog.service.impl;

import com.fzj.blog.dao.BloggerDao;
import com.fzj.blog.pojo.Blogger;
import com.fzj.blog.service.BloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by j on 2016/10/8.
 */
@Service
public class BloggerServiceImpl implements BloggerService {

    @Autowired
    private BloggerDao bloggerDao;


    @Override
    public Blogger login(Map<String, Object> param) {
        return bloggerDao.login(param);
    }

    @Override
    public int update(Blogger blogger) {

        if(blogger!=null){
            int i =bloggerDao.update(blogger);
            if(i==1)
                return 1;
        }
        return 0;
    }

    @Override
    public Blogger queryBlogger(Integer id) {
        return bloggerDao.queryBlogger(id);
    }
}
