package com.hzyc.Zee.bean;
//影院影片上架情况
public class SJ {
	int id;
	int movieId;
	int cinemaId;
	String movieName;
	String cinemaName;
	String tjjl;
	String xgjl;
	int now;//当前情况 1上架 0下架
	int creatManaId;
	int updateManaId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
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
	public int getNow() {
		return now;
	}
	public void setNow(int now) {
		this.now = now;
	}
	public int getCreatManaId() {
		return creatManaId;
	}
	public void setCreatManaId(int creatManaId) {
		this.creatManaId = creatManaId;
	}
	public int getUpdateManaId() {
		return updateManaId;
	}
	public void setUpdateManaId(int updateManaId) {
		this.updateManaId = updateManaId;
	}
	@Override
	public String toString() {
		return "SJ [id=" + id + ", movieId=" + movieId + ", cinemaId=" + cinemaId + ", movieName=" + movieName
				+ ", cinemaName=" + cinemaName + ", tjjl=" + tjjl + ", xgjl=" + xgjl + ", now=" + now + ", creatManaId="
				+ creatManaId + ", updateManaId=" + updateManaId + "]";
	}
	
}
