package com.hzyc.Zee.bean;

public class User {
	int id;
	String userName;
	String password;
	String name;
	int age;
	String tel;
	String mail;
	String ip;
	String addr;
	String sex;
	String tjjl;
	String cgjl;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTjjl() {
		return tjjl;
	}
	public void setTjjl(String tjjl) {
		this.tjjl = tjjl;
	}
	public String getCgjl() {
		return cgjl;
	}
	public void setCgjl(String cgjl) {
		this.cgjl = cgjl;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name + ", age="
				+ age + ", tel=" + tel + ", mail=" + mail + ", ip=" + ip + ", addr=" + addr + ", sex=" + sex + ", tjjl="
				+ tjjl + ", cgjl=" + cgjl + "]";
	}
	
}
