package com.hzyc.Zee.bean;
//活动信息类
public class HD {
	int id;
	String name;
	String bgTime;
	String endTime;
	int cinemaId;
	int hyTypeId;
	String hyTypeName;
	int movieId;
	double price;
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
	public String getBgTime() {
		return bgTime;
	}
	public void setBgTime(String bgTime) {
		this.bgTime = bgTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public int getHyTypeId() {
		return hyTypeId;
	}
	public void setHyTypeId(int hyTypeId) {
		this.hyTypeId = hyTypeId;
	}
	public String getHyTypeName() {
		return hyTypeName;
	}
	public void setHyTypeName(String hyTypeName) {
		this.hyTypeName = hyTypeName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HD [id=" + id + ", name=" + name + ", bgTime=" + bgTime + ", endTime=" + endTime + ", cinemaId="
				+ cinemaId + ", hyTypeId=" + hyTypeId + ", hyTypeName=" + hyTypeName + ", movieId=" + movieId
				+ ", price=" + price + "]";
	}
	
}
