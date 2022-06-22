package com.example.kotlinsprintblog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/kotlinsprintblog/ArticleController;", "", "repository", "Lcom/example/kotlinsprintblog/ArticleRepository;", "(Lcom/example/kotlinsprintblog/ArticleRepository;)V", "findAll", "", "Lcom/example/kotlinsprintblog/Article;", "findOne", "slug", "", "kotlin-sprint-blog"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/article"})
@org.springframework.web.bind.annotation.RestController
public class ArticleController {
    private final com.example.kotlinsprintblog.ArticleRepository repository = null;
    
    public ArticleController(@org.jetbrains.annotations.NotNull
    com.example.kotlinsprintblog.ArticleRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    public java.lang.Iterable<com.example.kotlinsprintblog.Article> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{slug}"})
    public com.example.kotlinsprintblog.Article findOne(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String slug) {
        return null;
    }
}