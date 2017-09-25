package com.hzyc.Zee.bean;
//系统向会员发送的消息
public class Message {
	int id;
	int uom;//用户或者管理员  1为用户
	int userId;
	String userName;
	int haveLook;
	String text;
	String tjjl;
	String xgjl;
	public int getUom() {
		return uom;
	}
	public void setUom(int uom) {
		this.uom = uom;
	}
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
	public int getHaveLook() {
		return haveLook;
	}
	public void setHaveLook(int haveLook) {
		this.haveLook = haveLook;
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
	@Override
	public String toString() {
		return "Message [id=" + id + ", uom=" + uom + ", userId=" + userId + ", userName=" + userName + ", haveLook="
				+ haveLook + ", text=" + text + ", tjjl=" + tjjl + ", xgjl=" + xgjl + "]";
	}
	
}
