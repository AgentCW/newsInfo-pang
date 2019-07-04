package com.zte.service;

import com.zte.bean.Comment;
import com.zte.bean.News;
import com.zte.dto.NewsInfoDto;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface NewsService {
    void save(News news, List<Comment> items);

    News getNewsById(int id);
    List<Comment> getComment(int oid);
    News getNews(News news);
    List<Comment> getCommentByNews(int nid);




}
