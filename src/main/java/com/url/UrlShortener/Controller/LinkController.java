package com.url.UrlShortener.Controller;

import com.url.UrlShortener.Entity.LinkRequest;
import com.url.UrlShortener.Services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LinkController {

    LinkService linkService;

    @PostMapping("/generate")
    public String generate(@RequestBody LinkRequest linkRequest) {
        return linkService.createNewLink(linkRequest.getUrl());
    }

    @GetMapping("/get/{url}")
    public String getLink(@PathVariable String url) {
        return linkService.getOriginalLink(url);
    }

    @Autowired
    public void setLinkService(LinkService linkService) {
        this.linkService = linkService;
    }
}
