package com.fzj.blog.service;

import com.fzj.blog.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/10.
 */
public interface BlogService {
    public List<Blog> countList();

    public List<Blog> list(Map<String,Object> map);

    public Long getTotal (Map<String,Object> map);

    public Blog findById(Integer id);

    public Integer update(Blog blog);

    public Blog getLastBlog(Integer id);

    public Blog getNextBlog(Integer id);

    public Integer add(Blog blog);

    public Integer delete(Integer id);

    public Integer getBlogByBlogCategoryId(Integer blogCategoryId);
}
