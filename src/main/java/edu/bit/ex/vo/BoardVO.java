package edu.bit.ex.vo;

import java.sql.Timestamp;

public class BoardVO {
	int userno;
	String email;
	String pw;
	String name;
	String id;
	String birth;
	String phonenumber;
	String gender;
	
	public BoardVO() {
		
	}
	
	
	public BoardVO(int userno, String email, String pw, String name, String id, String birth, String phonenumber,
			String gender) {
		super();
		this.userno = userno;
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.id = id;
		this.birth = birth;
		this.phonenumber = phonenumber;
		this.gender = gender;
	}
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}