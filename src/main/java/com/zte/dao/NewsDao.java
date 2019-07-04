package com.zte.dao;

import com.zte.bean.News;

import java.util.List;

public interface NewsDao {
    /**
     * 根据查询条件查询用户列表
     * @param news 查询条件
     * @return 新闻列表
     */
    List<News> select(News news);

    /**
     * 新增新闻
     * @param  news 新闻
     * @return 影响行数
     */
    int insert(News news);
    /**
     * 根据主键获取新闻实体
     * @param id 主键
     * @return 新闻实体
     */
    News selectById(long id);
    /**
     * 对于新闻内容进行修改
     * @param news 修改的新闻
     * @return 影响行数
     */
    int input(News news);
    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    int delete(Long id);
}
