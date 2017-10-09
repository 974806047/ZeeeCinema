package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.HD;
import com.hzyc.Zee.bean.Page;

public interface HDMapper {
	public void insertHD(HD hd);
	public void deleteHDById(int hdId);
	public void updateHD(HD hd);
	public ArrayList<HD> getHDByPage(Page page);
	public HD getHDById(int hdId);
}
