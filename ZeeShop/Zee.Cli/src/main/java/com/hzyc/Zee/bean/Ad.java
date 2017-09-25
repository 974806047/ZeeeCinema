package com.hzyc.Zee.bean;

public class Ad {
	int aa;
	int ad;
	String name;
	String title;
	String title1;
	String title2;
	String photo;
	String url;
	String tjjl;
	String xgjl;
	public int getAd() {
		return ad;
	}
	public void setAd(int ad) {
		this.ad = ad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
		return "Ad [ad=" + ad + ", name=" + name + ", title=" + title + ", title1=" + title1 + ", title2=" + title2
				+ ", photo=" + photo + ", url=" + url + ", tjjl=" + tjjl + ", xgjl=" + xgjl + "]";
	}
	
}
