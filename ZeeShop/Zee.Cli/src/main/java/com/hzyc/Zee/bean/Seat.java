package com.hzyc.Zee.bean;

public class Seat {
	int id;
	int hallId;
	String cnName;
	String enName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	@Override
	public String toString() {
		return "Seat [id=" + id + ", hallId=" + hallId + ", cnName=" + cnName + ", enName=" + enName + "]";
	}
	
}
