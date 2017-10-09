package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Ad;
import com.hzyc.Zee.bean.CAM;
import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;

public interface ManaMapper {
	public ArrayList<Mana> getAllMana();
	public Mana getManaByUserName(String userName);
	public Mana getManaByUserId(int id);
	public ArrayList<Mana> getManaByPage(Page page);
	public void deleteManaById(int id);
	public void insertMana(Mana mana);
	public void updateMana(Mana mana);
	
 
}
