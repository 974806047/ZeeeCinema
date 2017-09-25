package com.hzyc.Zee.bean;

public class Order {
	int id;
	int userId;
	String user_Name;
	String userName;
	int movieId;
	String movieName;
	String movieEditor;
	String movieyymd;//演员名单
	String ppid;//排片id
	String seatId;
	String seatCnName;//座位中文名
	String seatEnName;//座位英文名
	String hallName;
	int hallId;
	int cinemaId;
	String cinemaName;
	String ppTime;//排片时间
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
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieEditor() {
		return movieEditor;
	}
	public void setMovieEditor(String movieEditor) {
		this.movieEditor = movieEditor;
	}
	public String getMovieyymd() {
		return movieyymd;
	}
	public void setMovieyymd(String movieyymd) {
		this.movieyymd = movieyymd;
	}
	public String getPpid() {
		return ppid;
	}
	public void setPpid(String ppid) {
		this.ppid = ppid;
	}
	public String getSeatId() {
		return seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}
	public String getSeatCnName() {
		return seatCnName;
	}
	public void setSeatCnName(String seatCnName) {
		this.seatCnName = seatCnName;
	}
	public String getSeatEnName() {
		return seatEnName;
	}
	public void setSeatEnName(String seatEnName) {
		this.seatEnName = seatEnName;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
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
	public String getPpTime() {
		return ppTime;
	}
	public void setPpTime(String ppTime) {
		this.ppTime = ppTime;
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
		return "Order [id=" + id + ", userId=" + userId + ", user_Name=" + user_Name + ", userName=" + userName
				+ ", movieId=" + movieId + ", movieName=" + movieName + ", movieEditor=" + movieEditor + ", movieyymd="
				+ movieyymd + ", ppid=" + ppid + ", seatId=" + seatId + ", seatCnName=" + seatCnName + ", seatEnName="
				+ seatEnName + ", hallName=" + hallName + ", hallId=" + hallId + ", cinemaId=" + cinemaId
				+ ", cinemaName=" + cinemaName + ", ppTime=" + ppTime + ", tjjl=" + tjjl + ", xgjl=" + xgjl + "]";
	}
	
}
