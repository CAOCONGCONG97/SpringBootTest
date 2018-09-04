package com.uplooking.springboot.controller;

import com.uplooking.springboot.pojo.Info;
import com.uplooking.springboot.pojo.InfoResponse;
import com.uplooking.springboot.pojo.Response;
import com.uplooking.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/article")
@Controller
public class InfoController {
    @Autowired
    private ArticleService articleService;


    @RequestMapping("/listArticle")
    @ResponseBody
    public InfoResponse listArticle(Integer page, Integer limit) {
        int start = (page - 1) * limit;
        Long count = articleService.getArticleCount();
        List<Info> articles = articleService.getAllArticle(start, limit);
        System.out.println(articles);
        InfoResponse articleResponse = new InfoResponse();
        articleResponse.setCode(0);
        articleResponse.setCount(count);
        articleResponse.setData(articles);
        articleResponse.setMsg("");
        System.out.println("---------------------");
        System.out.println(articles);
        return articleResponse;
    }

    /**
     * 根据id删除文章
     */
    @RequestMapping("/deleteArticle")
    @ResponseBody
    public Response deleteArticle(Integer id) {
        Response response = new Response();
        try {
            articleService.deleteArticle(id);
            System.out.println("删除成功...");
            response = new Response();
            response.setMsg("OK");
            response.setCode(0);
        } catch (Exception e) {
            response = new Response();
            response.setMsg("ERROR");
            response.setCode(1);
        }
        return response;
    }
}
