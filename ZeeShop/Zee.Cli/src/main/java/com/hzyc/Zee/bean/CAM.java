package com.hzyc.Zee.bean;

public class CAM {
	int id;
	int cinemaId;
	int movieId;
	String cinemaName;
	String movieName;
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
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "CAM [id=" + id + ", cinemaId=" + cinemaId + ", movieId=" + movieId + ", cinemaName=" + cinemaName
				+ ", movieName=" + movieName + "]";
	}
	
}
