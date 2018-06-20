package com.abhi.quizexam.pojo;

import java.io.Serializable;

/**
 * 
 * @author Abhijit.Jadhav
 *
 */

public class Courses implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String courseName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
