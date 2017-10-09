package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.HY;
import com.hzyc.Zee.bean.Page;

public interface HYMapper {
	public void insertHY(HY hy);
	public void deleteHYById(int hyId);
	public void updateHY(HY hy);
	public HY getHyById(int hyId);
	public ArrayList<HY> getHYByPage(Page page);
	
	
	
}
