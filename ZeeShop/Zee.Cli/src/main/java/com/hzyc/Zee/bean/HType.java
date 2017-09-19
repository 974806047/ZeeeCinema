package com.hzyc.Zee.bean;

public class HType {	
	int id;
	int cinemaId;
	String cinemaName;
	String name;
	String tjjl;
	String xgjl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "HType [id=" + id + ", cinemaId=" + cinemaId + ", cinemaName=" + cinemaName + ", name=" + name
				+ ", tjjl=" + tjjl + ", xgjl=" + xgjl + "]";
	}
	
}
