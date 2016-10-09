package com.fzj.blog.service;

import com.fzj.blog.pojo.Blogger;

import java.util.Map;

/**
 * Created by j on 2016/10/8.
 */
public interface BloggerService {

    public Blogger login(Map<String,Object> param);

    public int update(Blogger blogger);
}
