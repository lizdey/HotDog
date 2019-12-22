package com.hotdog.entities;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "pst")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    private String postName;
    private String postText;
    @CreationTimestamp
    private LocalDateTime timeStamp;

    protected Posts() {}

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

}
