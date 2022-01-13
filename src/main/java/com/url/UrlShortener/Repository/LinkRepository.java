package com.url.UrlShortener.Repository;

import com.url.UrlShortener.Entity.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

    Optional<Link> findByShortUrl(String shortUrl);
}
