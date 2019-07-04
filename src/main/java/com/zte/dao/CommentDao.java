package com.zte.dao;

import com.zte.bean.Comment;

import java.util.List;

public interface CommentDao {
    /**
     * 新增
     * @param comment
     * @return 影响行数：如果评论已存在，影响行数为0，新增成功，影响行数为1
     */
    int insert(Comment comment);
    /**
     * 根据主键删除
     * @param id 主键
     * @return 影响行数
     */
    int delete(int id);
    /**
     * 根据查询条件查询用户的评论列表
     * @param oId 查询条件
     * @return 评论列表
     */
    List<Comment> select(int oId);
    /**
     * 根据查询条件查询新闻的评论列表
     * @param nId 查询条件
     * @return 评论列表
     */
    List<Comment> selectByNews(int nId);

}
