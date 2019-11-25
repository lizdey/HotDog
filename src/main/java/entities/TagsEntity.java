package entities;

import javax.persistence.*;

@Entity
@Table(name = "tags", schema = "hotdog", catalog = "")
public class TagsEntity {
    private int idtags;
    private String tags;

    @Id
    @Column(name = "idtags")
    public int getIdtags() {
        return idtags;
    }

    public void setIdtags(int idtags) {
        this.idtags = idtags;
    }

    @Basic
    @Column(name = "tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagsEntity that = (TagsEntity) o;

        if (idtags != that.idtags) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtags;
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }
}
