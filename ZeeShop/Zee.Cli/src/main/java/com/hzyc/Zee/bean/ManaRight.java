package com.hzyc.Zee.bean;

public class ManaRight {
	int id;
	String name;
	String fatherId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherId() {
		return fatherId;
	}
	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}
	@Override
	public String toString() {
		return "ManaRight [id=" + id + ", name=" + name + ", fatherId=" + fatherId + "]";
	}
	
}
