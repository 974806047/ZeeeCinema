package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.HYType;
import com.hzyc.Zee.bean.Page;

public interface HYTypeMapper {
	public void insertHYType(HYType hyType);
	public void deleteHYTypeById(int hyTypeId);
	public void updateHYType(HYType hyType);
	public ArrayList<HYType> getHYTypeByPage(Page page);
	public HYType getHYTypeById(int hyTypeId);
}
