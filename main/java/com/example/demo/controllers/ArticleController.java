package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;
import com.example.demo.impls.ArticleServiceImpl;
import com.example.demo.services.ArticleService;

import org.springframework.stereotype.Controller;
@Controller
public class ArticleController {
    private ArticleService articleService;
    public ArticleController(){
        articleService = new ArticleServiceImpl();
    }
    public void postArticle(ArticleDTO article){
        articleService.writeArticle(article);
    }
    public void putArticle(ArticleDTO article){
        articleService.modifyArticle(article);
    }
    public void deleteArticle(ArticleDTO article){
        articleService.removeArticle(article);
    }
    public void postReply(ReplyDTO reply){
        articleService.writeReply(reply);
    }
    public void deleteReply(ReplyDTO reply){
        articleService.removeReply(reply);
    }
    public ArticleDTO getArticle(int artId){
        return articleService.readArticle(artId);
    }
    public ArticleDTO getArticleList(){
        return articleService.fetchArticleList();
    }
    public List<ReplyDTO> getReply(int artId){
        return articleService.readReply(artId);
    }
}
