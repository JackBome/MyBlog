package com.fzj.blog.dao;

import com.fzj.blog.pojo.Blogger;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by j on 2016/10/8.
 */
public interface BloggerDao {

    public Blogger login(Map<String,Object> param);

    public int update(Blogger blogger);

    public Blogger queryBlogger(Integer id);
}
