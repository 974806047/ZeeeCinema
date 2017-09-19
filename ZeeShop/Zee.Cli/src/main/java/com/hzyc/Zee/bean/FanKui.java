package com.hzyc.Zee.bean;

public class FanKui {
	int id;
	int userId;
	String userName;
	String text;
	String tjjl;
	String xgjl;
	String manaName;
	int manaId;
	String reback;
	String rebackTime;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public String getManaName() {
		return manaName;
	}
	public void setManaName(String manaName) {
		this.manaName = manaName;
	}
	public int getManaId() {
		return manaId;
	}
	public void setManaId(int manaId) {
		this.manaId = manaId;
	}
	public String getReback() {
		return reback;
	}
	public void setReback(String reback) {
		this.reback = reback;
	}
	public String getRebackTime() {
		return rebackTime;
	}
	public void setRebackTime(String rebackTime) {
		this.rebackTime = rebackTime;
	}
	@Override
	public String toString() {
		return "FanKui [id=" + id + ", userId=" + userId + ", userName=" + userName + ", text=" + text + ", tjjl="
				+ tjjl + ", xgjl=" + xgjl + ", manaName=" + manaName + ", manaId=" + manaId + ", reback=" + reback
				+ ", rebackTime=" + rebackTime + "]";
	}
	
}
