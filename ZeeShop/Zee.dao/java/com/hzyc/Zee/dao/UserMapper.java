package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;

public interface UserMapper {
	public User getUserByUserName(String userName);
	public void insertUser(User user);
	public void deleteUserById(int userId);
	public void updateUser(User user);
	public ArrayList<User> getUserByPage(Page page);
	public User getUserByUserId(int userId);
	
	
}
