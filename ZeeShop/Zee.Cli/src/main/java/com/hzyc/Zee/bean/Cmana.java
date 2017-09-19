package com.hzyc.Zee.bean;

public class Cmana {
	int id;
	String userName;
	String password;
	String right;
	int highRight;
	int age;
	String tel;
	String mail;
	String sex;
	int cinemaId;
	String cinemaName;
	String name;
	String tjjl;
	String xgjl;
	String giveRight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	public int getHighRight() {
		return highRight;
	}
	public void setHighRight(int highRight) {
		this.highRight = highRight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTjjl() {
		return tjjl;
	}
	public void setTjjl(String tjjl) {
		this.tjjl = tjjl;
	}
	public String getXgjl() {
		return xgjl;
	}
	public void setXgjl(String xgjl) {
		this.xgjl = xgjl;
	}
	public String getGiveRight() {
		return giveRight;
	}
	public void setGiveRight(String giveRight) {
		this.giveRight = giveRight;
	}
	@Override
	public String toString() {
		return "Cmana [id=" + id + ", userName=" + userName + ", password=" + password + ", right=" + right
				+ ", highRight=" + highRight + ", age=" + age + ", tel=" + tel + ", mail=" + mail + ", sex=" + sex
				+ ", cinemaId=" + cinemaId + ", cinemaName=" + cinemaName + ", name=" + name + ", tjjl=" + tjjl
				+ ", xgjl=" + xgjl + ", giveRight=" + giveRight + "]";
	}
	
}
