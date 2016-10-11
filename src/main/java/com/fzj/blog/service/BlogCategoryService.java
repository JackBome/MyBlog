package com.fzj.blog.service;

import com.fzj.blog.pojo.BlogCategory;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/10/11.
 */
public interface BlogCategoryService {
    /**
     * 查询所有博客类型 以及对应的博客数量
     * @return
     */
    public List<BlogCategory> countList();

    /**
     * 通过id查询博客类型
     * @param id
     * @return
     */
    public BlogCategory findById(Integer id);

    /**
     * 分页查询博客类别信息
     * @param map
     * @return
     */
    public List<BlogCategory> list(Map<String,Object> map);

    /**
     * 获取总记录数
     * @param map
     * @return
     */
    public Long getTotal(Map<String,Object> map);

    /**
     * 添加博客类别信息
     * @param blogCategory
     * @return
     */
    public Integer add(BlogCategory blogCategory);

    /**
     * 修改博客类别信息
     * @param blogCategory
     * @return
     */
    public Integer update(BlogCategory blogCategory);

    /**
     * 删除博客类别信息
     * @param id
     * @return
     */
    public Integer delete(Integer id);
}
