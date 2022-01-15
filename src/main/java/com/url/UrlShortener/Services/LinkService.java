package com.url.UrlShortener.Services;

import com.url.UrlShortener.Entity.Link;
import com.url.UrlShortener.Repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinkService {


    LinkRepository linkRepository;

    public String createNewLink(String url) {
        String shortUrl = getRandomString(8);
        Link link = new Link(url, shortUrl);
        linkRepository.save(link);
        return link.getShortUrl();
    }

    public String getOriginalLink(String url) {
        return linkRepository.findByShortUrl(url).get().getOriginal();
    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<length; i++){
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    @Autowired
    public void setLinkRepository(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

}



