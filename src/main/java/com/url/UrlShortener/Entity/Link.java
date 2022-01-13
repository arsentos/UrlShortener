package com.url.UrlShortener.Entity;

import javax.persistence.*;

@Entity
public class Link {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "original")
    String original;

    @Column(name = "short")
    String shortUrl;

    public Link() {

    }

    public Link(String original, String shortUrl) {
        this.original = original;
        this.shortUrl = shortUrl;
    }

    public Link(Long id, String original, String shortUrl) {
        this.id = id;
        this.original = original;
        this.shortUrl = shortUrl;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
