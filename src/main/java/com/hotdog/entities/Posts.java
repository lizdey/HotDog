package com.hotdog.entities;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "pst")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
    @NotNull
    private String postName;
    @NotNull
    private String postText;

    @NotNull
    private String imgName;
    @CreationTimestamp
    private LocalDateTime timeStamp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Posts() {}

    public User getAuthor() {
        return author;
    }

    public String getAuthorName(){
        return author != null ? author.getUsername() : "<none>";
    }

    public void setAuthor(User author) {
        this.author = author;
    }

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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

}

