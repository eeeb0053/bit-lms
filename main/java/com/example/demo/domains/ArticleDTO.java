package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class ArticleDTO {
    protected int artId;
    protected String writerId, content, writtenDate, updateDate;
}

