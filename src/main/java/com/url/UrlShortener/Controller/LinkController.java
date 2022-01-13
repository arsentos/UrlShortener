package com.url.UrlShortener.Controller;

import com.url.UrlShortener.Entity.Link;
import com.url.UrlShortener.Entity.LinkDto;
import com.url.UrlShortener.Services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LinkController {

    LinkService linkService;

    @PostMapping("/generate")
    public String generate(@RequestBody String url) {
        return linkService.createNewLink(url);
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
