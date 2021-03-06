package com.fzj.blog.dao;

import com.fzj.blog.pojo.Link;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by j on 2016/9/29.
 */
public interface LinkDao {

    public int addLink(Link link);

    public int delLink(Integer id);

    public int updateLink(Link link);

    public Link getLinkById(Integer id);

    /**
     *
     * @param offset 偏移量
     * @param limit 查询个数
     * @return
     */
    public List<Link> queryAllLink(@Param("offset")int offset,@Param("limit") int limit);
}
