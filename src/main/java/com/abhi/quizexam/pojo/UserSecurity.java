package com.abhi.quizexam.pojo;

import java.io.Serializable;

public class UserSecurity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String securityQuestions;
	private String securityAnswer;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSecurityQuestions() {
		return securityQuestions;
	}
	public void setSecurityQuestions(String securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
}
