package com.hzyc.Zee.service;
//校验接口
public interface ConfirmService {
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 检测影院管理员中是否有这个用户名 返回一个布尔 1存在0不存在
	 */
	public boolean confCmanaUsername(String cmanaUsername);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 	检测后台管理员中是否有这个用户名
	 */
	public boolean confManaUsername(String manaUsername);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 检测会员中是否有这个用户名
	 */
	public boolean confUserUsername(String userUsername);
	
}
