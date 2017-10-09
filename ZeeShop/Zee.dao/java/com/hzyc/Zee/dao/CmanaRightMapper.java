package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.CmanaRight;

public interface CmanaRightMapper {
	public void insertCManaRight(CmanaRight cmanaRight);
	public void deleteCManaRightById(int cmanaRightId);
	public ArrayList<CmanaRight> getAllCManaRight();
}
