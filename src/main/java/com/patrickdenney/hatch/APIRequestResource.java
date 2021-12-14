package com.patrickdenney.hatch;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class APIRequestResource {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //@Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/posts")
    public String getPosts(){
        String posts = "Posts";
        /*ResponseEntity<Object[]> responseEntity =
                restTemplate.getForEntity("https://api.hatchways.io/assessment/blog/posts?tag=tech", Object[].class);
        Object[] objects = responseEntity.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return Arrays.stream(objects)
                .map(object -> mapper.convertValue(object, Post.class))
                .map(Post::getTitle)
                .collect(Collectors.toList());
        //return "Posts";*/
         /*String posts = restTemplate.getForObject(
                "https://api.hatchways.io/assessment/blog/posts?tag=tech", JSON.class
        );*/
         return posts;
    }




}
