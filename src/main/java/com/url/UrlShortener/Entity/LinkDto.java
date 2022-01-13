package com.url.UrlShortener.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LinkDto {

    String original;

    String shortUrl;

    public LinkDto() {

    }

    public LinkDto(String original, String shortUrl) {
        this.original = original;
        this.shortUrl = shortUrl;
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
