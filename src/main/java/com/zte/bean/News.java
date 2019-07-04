package com.zte.bean;

public class News {
    //新闻编号
    private long id;
    //新闻图片路径
    private String imgFileName;
    //新闻标题
    private String title;
    //新闻详情
    private String desc;
    //新闻发生城市
    private String city;
    //类别
    private String category;
    //评论总数
    private long commentTotalNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getCommentTotalNum() {
        return commentTotalNum;
    }

    public void setCommentTotalNum(long commentTotalNum) {
        this.commentTotalNum = commentTotalNum;
    }
}
