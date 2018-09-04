package com.uplooking.springboot.mapper;

import com.uplooking.springboot.pojo.Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {
    Long findCount();

    List<Info> findAllArticle(Integer start, Integer limit);

    void delete(Integer id);
}
