package com.uplooking.springboot.service;

import com.uplooking.springboot.mapper.ArticleMapper;
import com.uplooking.springboot.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Info> getAllArticle(Integer start, Integer limit) {
        List<Info> articles = articleMapper.findAllArticle(start, limit);
        return articles;
    }

    public Long getArticleCount() {
        return articleMapper.findCount();
    }

    public void deleteArticle(Integer aid) {
        articleMapper.delete(aid);
    }
}
