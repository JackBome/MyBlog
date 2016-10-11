package com.fzj.blog.pojo;

/**
 * Created by j on 2016/10/10.
 */
public class PageEntity {
    //第几页
    private int page;

    //起始页
    private int start;

    //每页记录
    private int pageSize;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public PageEntity(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }
}
