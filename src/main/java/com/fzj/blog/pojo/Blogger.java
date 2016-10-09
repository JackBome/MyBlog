package com.fzj.blog.pojo;

/**
 * Created by j on 2016/10/8.
 */
public class Blogger {
    private Integer id;
    private String userName;
    private String passWord;
    private String nickName;
    private String proFile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProFile() {
        return proFile;
    }

    public void setProFile(String proFile) {
        this.proFile = proFile;
    }
}