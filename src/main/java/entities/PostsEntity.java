package entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "posts", schema = "hotdog", catalog = "")
public class PostsEntity {
    private int idPost;
    private String titel;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String content;
    private int postLikeCount;
    private int postCommentCount;
    private UsersEntity usersByUsersId;

    @Id
    @Column(name = "id_post")
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Basic
    @Column(name = "titel")
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "post_like_count")
    public int getPostLikeCount() {
        return postLikeCount;
    }

    public void setPostLikeCount(int postLikeCount) {
        this.postLikeCount = postLikeCount;
    }

    @Basic
    @Column(name = "post_comment_count")
    public int getPostCommentCount() {
        return postCommentCount;
    }

    public void setPostCommentCount(int postCommentCount) {
        this.postCommentCount = postCommentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostsEntity that = (PostsEntity) o;

        if (idPost != that.idPost) return false;
        if (postLikeCount != that.postLikeCount) return false;
        if (postCommentCount != that.postCommentCount) return false;
        if (titel != null ? !titel.equals(that.titel) : that.titel != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPost;
        result = 31 * result + (titel != null ? titel.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + postLikeCount;
        result = 31 * result + postCommentCount;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public UsersEntity getUsersByUsersId() {
        return usersByUsersId;
    }

    public void setUsersByUsersId(UsersEntity usersByUsersId) {
        this.usersByUsersId = usersByUsersId;
    }
}
