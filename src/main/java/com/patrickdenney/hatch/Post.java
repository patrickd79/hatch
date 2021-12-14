package com.patrickdenney.hatch;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public @Data
class Post {
    private int id;
    private String author;
    private int authorID;
    private int likes;
    private float popularity;
    private int reads;
    private List<String> tags = new ArrayList<>();

    /*public Post(int id, String author, int authorID, int likes, float popularity, int reads, String[] tags) {
        this.id = id;
        this.author = author;
        this.authorID = authorID;
        this.likes = likes;
        this.popularity = popularity;
        this.reads = reads;
        if(tags.length != 0){
            Collections.addAll(this.tags, tags);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public int getReads() {
        return reads;
    }

    public void setReads(int reads) {
        this.reads = reads;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }*/
}
