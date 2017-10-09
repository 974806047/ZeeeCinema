package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Hall;
import com.hzyc.Zee.bean.Page;

public interface HallMapper {
	public void insertHall(Hall hall);
	public void deleteHallById(int hallId);
	public void updateHall(Hall hall);
	public Hall getHallById	(int hallId);
	public ArrayList<Hall> getHallPage(Page page);
	
}
