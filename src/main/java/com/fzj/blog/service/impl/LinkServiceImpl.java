package com.fzj.blog.service.impl;

import com.fzj.blog.dao.LinkDao;
import com.fzj.blog.pojo.Link;
import com.fzj.blog.service.LinkService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by j on 2016/9/29.
 */
@Service
public class LinkServiceImpl implements LinkService {

    //自动注入linkDao
    @Autowired
    private LinkDao linkDao;

    @Override
    public int addLink(Link link) {
        if(link !=null){
            int i =linkDao.addLink(link);
            if(i ==1){
                return 1;
            }
        }

        return 0;
    }

    @Override
    public int delLink(Integer id) {
        int i =linkDao.delLink(id);
        if(i==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int updateLink(Link link) {
        if(link !=null){
            int i =linkDao.updateLink(link);
            if(i ==1){
                return  1;
            }
        }
        return 0;
    }

    @Override
    public Link getLinkById(Integer id) {
        Link link =linkDao.getLinkById(id);
        if(link !=null){
            return link;
        }
        return null;
    }

    @Override
    public List<Link> queryAllLink(@Param("offset") int offset, @Param("limit") int limit) {
        List<Link> links =linkDao.queryAllLink(offset,limit);
        if(links !=null){
            return links;
        }
        return null;
    }
}
