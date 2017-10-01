package com.hzyc.Zee.bean;
//会员信息类
public class HY {
	int id;
	int userId;
	String userName;
	String hytypeName;
	int hytypeId;
	int cinemaId;
	String cienmaName;
	String tjjl;
	String xgjl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHytypeName() {
		return hytypeName;
	}
	public void setHytypeName(String hytypeName) {
		this.hytypeName = hytypeName;
	}
	public int getHytypeId() {
		return hytypeId;
	}
	public void setHytypeId(int hytypeId) {
		this.hytypeId = hytypeId;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getCienmaName() {
		return cienmaName;
	}
	public void setCienmaName(String cienmaName) {
		this.cienmaName = cienmaName;
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
		return "HY [id=" + id + ", userId=" + userId + ", userName=" + userName + ", hytypeName=" + hytypeName
				+ ", hytypeId=" + hytypeId + ", cinemaId=" + cinemaId + ", cienmaName=" + cienmaName + ", tjjl=" + tjjl
				+ ", xgjl=" + xgjl + "]";
	}
	
}
