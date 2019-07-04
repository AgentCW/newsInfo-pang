package com.zte.dto;

import com.zte.bean.Comment;
import com.zte.bean.News;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class NewsInfoDto {
    private News news;
    private MultipartFile imgFile;

    public MultipartFile getImgFile() {
        return imgFile;
    }

    public void setImgFile(MultipartFile imgFile) {
        this.imgFile = imgFile;
    }

    public NewsInfoDto(){

    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
