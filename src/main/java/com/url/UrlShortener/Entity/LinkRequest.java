package com.url.UrlShortener.Entity;

import org.springframework.stereotype.Component;

@Component
public class LinkRequest {
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LinkRequest(String url) {
        this.url = url;
    }

    public LinkRequest() {
    }

    private String url;

}
