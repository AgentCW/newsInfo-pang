package com.zte.service.impl;

import com.zte.bean.Comment;
import com.zte.bean.News;
import com.zte.dao.CommentDao;
import com.zte.dao.NewsDao;
import com.zte.dto.NewsInfoDto;
import com.zte.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;
    @Autowired
    private CommentDao commentDao;


    @Override
    public void save(News news, List<Comment> items) {
        //储存新闻信息
        news.setTitle(news.getTitle());
        news.setCity(news.getCity());
        news.setCategory(news.getCategory());
        news.setDesc(news.getDesc());
        news.setCommentTotalNum(1);
        news.setImgFileName(news.getImgFileName());

        //储存评论信息
        for (Comment item : items) {
            item.setNewsId(news.getId());
            item.setComment(item.getComment());
            item.setCreateTime(new Date());
            //item.setOrdersId();
            commentDao.insert(item);
        }
        newsDao.insert(news);
    }

    @Override
    public News getNewsById(int id) {
        return newsDao.selectById(id);
    }

    @Override
    public List<Comment> getComment(int oid) {
        return commentDao.select(oid);
    }

    @Override
    public News getNews(News news) {
        return (News) newsDao.select(news);
    }

    @Override
    public List<Comment> getCommentByNews(int nid) {
        return commentDao.selectByNews(nid);
    }
}

