package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.ArticleDTO;
import com.example.demo.domains.ReplyDTO;

import org.springframework.stereotype.Component;
@Component
public interface ArticleService {
    public void writeArticle(ArticleDTO article);
    public void modifyArticle(ArticleDTO article);
    public void removeArticle(ArticleDTO article);
    public void writeReply(ReplyDTO reply);
    public void removeReply(ReplyDTO reply);
    public ArticleDTO readArticle(int artId);
    public ArticleDTO fetchArticleList();
    public List<ReplyDTO> readReply(int artId);
}
