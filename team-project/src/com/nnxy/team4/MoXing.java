package com.nnxy.team4;

import java.util.List;

public class MoXing {
	private String studentId;
	private String name;
	private String gender;
	private Integer age;
	private List<String> hobby;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "MoXing [studentId=" + studentId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", hobby="
				+ hobby + "]";
	}
	
}
