package com.fzj.blog.service.impl;

import com.fzj.blog.dao.BlogCategoryDao;
import com.fzj.blog.pojo.BlogCategory;
import com.fzj.blog.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/11.
 */

@Service
public class BlogCategoryServiceImpl implements BlogCategoryService {

    @Autowired
    private BlogCategoryDao blogCategoryDao;
    @Override
    public List<BlogCategory> countList() {
        return blogCategoryDao.countList();
    }

    @Override
    public BlogCategory findById(Integer id) {
        return blogCategoryDao.findById(id);
    }

    @Override
    public List<BlogCategory> list(Map<String, Object> map) {
        return blogCategoryDao.list(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return blogCategoryDao.getTotal(map);
    }

    @Override
    public Integer add(BlogCategory blogCategory) {
        return blogCategoryDao.add(blogCategory);
    }

    @Override
    public Integer update(BlogCategory blogCategory) {
        return blogCategoryDao.update(blogCategory);
    }

    @Override
    public Integer delete(Integer id) {
        return blogCategoryDao.delete(id);
    }
}
