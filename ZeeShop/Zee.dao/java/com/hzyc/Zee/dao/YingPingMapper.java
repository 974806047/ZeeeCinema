package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.YingPing;

public interface YingPingMapper {
	public void insertYingPing(YingPing yp);
	public void deleteYingPingById(int yingPingId);
	public ArrayList<YingPing> getYingPingByPage(Page page);
	public YingPing getYingPingById(int yingPingId);
	public YingPing updateYingPing(YingPing yp);
}
