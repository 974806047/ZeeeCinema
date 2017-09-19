package com.hzyc.Zee.bean;

public class YingPing {
	int id;
	int userId;
	String userName;
	String movieName;
	int movieId;
	String text;
	int level;
	int zang;//赞数
	String xgjl;
	String tjjl;
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
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getZang() {
		return zang;
	}
	public void setZang(int zang) {
		this.zang = zang;
	}
	public String getXgjl() {
		return xgjl;
	}
	public void setXgjl(String xgjl) {
		this.xgjl = xgjl;
	}
	public String getTjjl() {
		return tjjl;
	}
	public void setTjjl(String tjjl) {
		this.tjjl = tjjl;
	}
	@Override
	public String toString() {
		return "YingPing [id=" + id + ", userId=" + userId + ", userName=" + userName + ", movieName=" + movieName
				+ ", movieId=" + movieId + ", text=" + text + ", level=" + level + ", zang=" + zang + ", xgjl=" + xgjl
				+ ", tjjl=" + tjjl + "]";
	}
	
}
