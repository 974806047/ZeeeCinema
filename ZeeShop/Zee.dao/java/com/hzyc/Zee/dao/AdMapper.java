package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Ad;
import com.hzyc.Zee.bean.Page;

public interface AdMapper {
	public void insertAd(Ad ad);
	public void updateAd(Ad ad);
	public void deleteAdById(int adId);
	public ArrayList<Ad> getAdByPage(Page page);
	public Ad getAdById(int adId);
	
}
