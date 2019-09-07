package com.hibernate.classes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="f_name")
	private String f_name;
	
	
	@Column(name="l_name")
	private String l_name;
	
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructordetailId")
	private InstructorDetail instructorDetail;

	public Instructor(String f_name, String l_name, String email) {
		
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}
	
	public Instructor() {
		
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + "]";
	}
	
	

	
	
}
