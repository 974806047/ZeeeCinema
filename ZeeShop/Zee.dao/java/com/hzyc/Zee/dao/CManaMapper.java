package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Page;

public interface CManaMapper {
	public void insertCMana(CMana cmana);
	public void deleteCManaById(int cmanaId);
	public void updateCMana(CMana cmana);
	public ArrayList<CMana> getCManaByPage(Page page);
	public CMana getCManaById(int cmanaId);
	public CMana getCManaByName(String cmanaName);
}
