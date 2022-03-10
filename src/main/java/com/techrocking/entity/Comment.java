package com.techrocking.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "comment")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	protected Long id;

	@Column(name = "description")
	private String description;

	@Setter(AccessLevel.NONE)
	@CreationTimestamp
	protected Timestamp created;

    @OneToOne
    @JoinColumn(name="author_id", nullable=true)
    private Author author;
    
    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

}
