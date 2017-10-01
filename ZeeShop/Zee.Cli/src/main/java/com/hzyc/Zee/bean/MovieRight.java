package com.hzyc.Zee.bean;
//电影授权情况类
public class MovieRight {
	int id;
	int cinemaId;
	int movieId;
	String cienmaName;
	String movieName;
	int now;
	int creatManaId;
	int updateManaId;
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
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getCienmaName() {
		return cienmaName;
	}
	public void setCienmaName(String cienmaName) {
		this.cienmaName = cienmaName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
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
		return "MovieRight [id=" + id + ", cinemaId=" + cinemaId + ", movieId=" + movieId + ", cienmaName=" + cienmaName
				+ ", movieName=" + movieName + ", now=" + now + ", creatManaId=" + creatManaId + ", updateManaId="
				+ updateManaId + ", tjjl=" + tjjl + ", xgjl=" + xgjl + "]";
	}
	
}
