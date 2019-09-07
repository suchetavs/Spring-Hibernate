package com.hibernate.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="instructor_detail")
	private String youtube_channel;
	
	@Column(name="hobby")
	private String hobby;

	public InstructorDetail(String youtube_channel, String hobby) {
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}
	
	public InstructorDetail() {
	
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtube_channel=" + youtube_channel + ", hobby=" + hobby + "]";
	}
	

	
	
}
