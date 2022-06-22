package com.example.kotlinsprintblog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kotlinsprintblog/HtmlController;", "", "repository", "Lcom/example/kotlinsprintblog/ArticleRepository;", "properties", "Lcom/example/kotlinsprintblog/BlogProperties;", "(Lcom/example/kotlinsprintblog/ArticleRepository;Lcom/example/kotlinsprintblog/BlogProperties;)V", "article", "", "slug", "model", "Lorg/springframework/ui/Model;", "blog", "render", "Lcom/example/kotlinsprintblog/HtmlController$RenderedArticle;", "Lcom/example/kotlinsprintblog/Article;", "RenderedArticle", "kotlin-sprint-blog"})
@org.springframework.stereotype.Controller
public class HtmlController {
    private final com.example.kotlinsprintblog.ArticleRepository repository = null;
    private final com.example.kotlinsprintblog.BlogProperties properties = null;
    
    public HtmlController(@org.jetbrains.annotations.NotNull
    com.example.kotlinsprintblog.ArticleRepository repository, @org.jetbrains.annotations.NotNull
    com.example.kotlinsprintblog.BlogProperties properties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    public java.lang.String blog(@org.jetbrains.annotations.NotNull
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/article/{slug}"})
    public java.lang.String article(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.example.kotlinsprintblog.HtmlController.RenderedArticle render(@org.jetbrains.annotations.NotNull
    com.example.kotlinsprintblog.Article $this$render) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/example/kotlinsprintblog/HtmlController$RenderedArticle;", "", "slug", "", "title", "headline", "content", "author", "Lcom/example/kotlinsprintblog/User;", "addedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/kotlinsprintblog/User;Ljava/lang/String;)V", "getAddedAt", "()Ljava/lang/String;", "getAuthor", "()Lcom/example/kotlinsprintblog/User;", "getContent", "getHeadline", "getSlug", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-sprint-blog"})
    public static final class RenderedArticle {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String slug = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String headline = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String content = null;
        @org.jetbrains.annotations.NotNull
        private final com.example.kotlinsprintblog.User author = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String addedAt = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinsprintblog.HtmlController.RenderedArticle copy(@org.jetbrains.annotations.NotNull
        java.lang.String slug, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String headline, @org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        com.example.kotlinsprintblog.User author, @org.jetbrains.annotations.NotNull
        java.lang.String addedAt) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RenderedArticle(@org.jetbrains.annotations.NotNull
        java.lang.String slug, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String headline, @org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        com.example.kotlinsprintblog.User author, @org.jetbrains.annotations.NotNull
        java.lang.String addedAt) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSlug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHeadline() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinsprintblog.User component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.kotlinsprintblog.User getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAddedAt() {
            return null;
        }
    }
}