package com.techrocking.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	protected Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Setter(AccessLevel.NONE)
	@CreationTimestamp
	protected Timestamp created;

    @OneToOne
    @JoinColumn(name="author_id", nullable=true)
    private Author author;
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "post_tag",
       joinColumns = @JoinColumn(name = "post_id"),
       inverseJoinColumns = @JoinColumn(name = "tag_id"))
     private List<Tag> tags = new ArrayList<>();
    
    public void addTag(Tag tag) {
        tags.add(tag);
    }
 
    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

}
