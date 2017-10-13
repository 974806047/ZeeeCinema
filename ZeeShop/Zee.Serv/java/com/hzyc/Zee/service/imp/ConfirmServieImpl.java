package com.hzyc.Zee.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.dao.CManaMapper;
import com.hzyc.Zee.dao.ManaMapper;
import com.hzyc.Zee.dao.UserMapper;
import com.hzyc.Zee.service.ConfirmService;

public class ConfirmServieImpl implements ConfirmService{

	@Autowired
	CManaMapper cmanaMapper;
	@Autowired
	ManaMapper manaMapper;
	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public boolean confCmanaUsername(String cmanaUsername) {
		// TODO Auto-generated method stub
		CMana cmana=cmanaMapper.getCManaByName(cmanaUsername);
		if(cmana.equals("")||cmana==null){
			return false;
		}
		return true;
	}

	@Override
	public boolean confManaUsername(String manaUsername) {
		// TODO Auto-generated method stub
		Mana mana=manaMapper.getManaByUserName(manaUsername);
		if(mana.equals("")||mana==null){
			return false;
		}
		return true;
	}

	@Override
	public boolean confUserUsername(String userUsername) {
		// TODO Auto-generated method stub
		User user=userMapper.getUserByUserName(userUsername);
		if(user.equals("")||user==null){
			return false;
		}
		return true;
	}

}
