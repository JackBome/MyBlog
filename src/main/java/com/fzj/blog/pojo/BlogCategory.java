package com.fzj.blog.pojo;

import java.io.Serializable;

/**
 * Created by j on 2016/10/10.
 */
public class BlogCategory implements Serializable{


    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  categoryName;
    private Integer categoryNum;
    private Integer categoryOrderNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(Integer categoryNum) {
        this.categoryNum = categoryNum;
    }

    public Integer getCategoryOrderNo() {
        return categoryOrderNo;
    }

    public void setCategoryOrderNo(Integer categoryOrderNo) {
        this.categoryOrderNo = categoryOrderNo;
    }
}
