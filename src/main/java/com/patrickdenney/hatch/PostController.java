package com.patrickdenney.hatch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//this is demo code for testing the lomboc add in

@RestController
public class PostController {
    @RequestMapping("/")
    public String index(){
        Post post = new Post();
        post.setAuthor("me");
        return post.getAuthor();
    }

    @GetMapping("/posts")
    public ResponseEntity fetchAllPosts(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/post/id/")
    public ResponseEntity fetchPostByID(@PathVariable("id") String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value="/post", consumes="application/json", produces="application/json")
    public Post createPost(@RequestBody Post post){
        return post;
    }

    //just delete template
    @DeleteMapping("/post/id/")
    public ResponseEntity deletePost(@PathVariable("id") String id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
