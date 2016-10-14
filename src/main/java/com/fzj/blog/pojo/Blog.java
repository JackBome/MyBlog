package com.fzj.blog.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by j on 2016/10/10.
 */
public class Blog implements Serializable{

    private static  final  long serialVersionUID =1L;

    private Integer id;
    private String title;
    private String summary;
    private Integer clickHit;
    private String content;
    private Integer blogNum;
    private String blogImg;
    private Integer blogOrderNo;
    private BlogCategory blogCategory;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getClickHit() {
        return clickHit;
    }

    public void setClickHit(Integer clickHit) {
        this.clickHit = clickHit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getBlogNum() {
        return blogNum;
    }

    public void setBlogNum(Integer blogNum) {
        this.blogNum = blogNum;
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg;
    }

    public Integer getBlogOrderNo() {
        return blogOrderNo;
    }

    public void setBlogOrderNo(Integer blogOrderNo) {
        this.blogOrderNo = blogOrderNo;
    }

    public BlogCategory getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
