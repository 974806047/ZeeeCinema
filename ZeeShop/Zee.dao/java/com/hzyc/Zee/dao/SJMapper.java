package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.SJ;

public interface SJMapper {
	public void insertSJ(SJ sj);
	public void deleteSJById(int sjId);
	public void updateSJ(SJ sj);
	public SJ getSjById(int sjId);
	public ArrayList<SJ> getSJByPage(Page page);
}
