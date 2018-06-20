package com.abhi.quizexam.pojo;

import java.io.Serializable;

public class CourseInterested implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Courses course;
	private Integer userId;
	private Integer CourseInterested;
	
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCourseInterested() {
		return CourseInterested;
	}
	public void setCourseInterested(Integer courseInterested) {
		CourseInterested = courseInterested;
	}
	
	

}
