package com.hzyc.Zee.bean;

public class Cinema {
	int id;
	String name;
	String ip;
	int cmanaId;
	String cmanaName;
	String cmanaTel;
	String exactAddr;
	String cmanaNum;
	String areaCode;
	String areaName;
	String provinceName;
	String cityName;
	String tjjl;
	String cgjl;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getCmanaId() {
		return cmanaId;
	}
	public void setCmanaId(int cmanaId) {
		this.cmanaId = cmanaId;
	}
	public String getCmanaName() {
		return cmanaName;
	}
	public void setCmanaName(String cmanaName) {
		this.cmanaName = cmanaName;
	}
	public String getCmanaTel() {
		return cmanaTel;
	}
	public void setCmanaTel(String cmanaTel) {
		this.cmanaTel = cmanaTel;
	}
	public String getExactAddr() {
		return exactAddr;
	}
	public void setExactAddr(String exactAddr) {
		this.exactAddr = exactAddr;
	}
	public String getCmanaNum() {
		return cmanaNum;
	}
	public void setCmanaNum(String cmanaNum) {
		this.cmanaNum = cmanaNum;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getTjjl() {
		return tjjl;
	}
	public void setTjjl(String tjjl) {
		this.tjjl = tjjl;
	}
	public String getCgjl() {
		return cgjl;
	}
	public void setCgjl(String cgjl) {
		this.cgjl = cgjl;
	}
	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + ", ip=" + ip + ", cmanaId=" + cmanaId + ", cmanaName="
				+ cmanaName + ", cmanaTel=" + cmanaTel + ", exactAddr=" + exactAddr + ", cmanaNum=" + cmanaNum
				+ ", areaCode=" + areaCode + ", areaName=" + areaName + ", provinceName=" + provinceName + ", cityName="
				+ cityName + ", tjjl=" + tjjl + ", cgjl=" + cgjl + "]";
	}
	
}
