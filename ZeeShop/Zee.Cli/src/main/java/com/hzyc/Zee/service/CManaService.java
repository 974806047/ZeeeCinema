package com.hzyc.Zee.service;

import java.util.ArrayList;

import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.CmanaRight;
import com.hzyc.Zee.bean.HD;
import com.hzyc.Zee.bean.HY;
import com.hzyc.Zee.bean.HYType;
import com.hzyc.Zee.bean.Hall;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Order;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.SJ;

//一些影院管理员操作接口
public interface CManaService {
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 登陆
	 */
	public Mana login(Mana mana);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 注销
	 */
	public void logout();
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 判断该管理员有无cmanaRight权限
	 */
	public boolean haveRight(String cmanaRightName);
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过Page查找影院管理员实现分类
	 */
	public ArrayList<CMana> queryCmana(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过cmanaId 查找影院管理员
	 */
	public CMana queryCmana(int cmanaId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过cmanaName 查找影院管理员
	 */
	public CMana queryCmana(String cmanaName);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过cmanaId 删除影院管理员
	 */
	public int deleteCmana(int cmanaId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过用 ， 分割的cmanaId 练成的字符串批量删除影院管理员	
	 */
	public int deleteCmana(String cmanaIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新影院管理员
	 */
	public CMana updateCmana(CMana cmana);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加影院管理员
	 */
	public CMana insertCmana(CMana cmana);
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加会员类型
	 */
	public HYType insertHYType(HYType type);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过hytypeId删除会员类型
	 */
	public int deleteHYType(int hytypeId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过用 ， 连接的hytypeId而成的字符串批量删除会员类型
	 */
	public int deleteHYType(String hytypeIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新会员类型
	 */
	public HYType updateHYType(HYType type);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过hytypeid查找会员类型	
	 */
	public HYType queryHYtype(int hytypeId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过Page类查找会员类型实现分类	
	 */
	public ArrayList<HYType> queryHytype(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加会员
	 */
	public HY insertHY(HY hy);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过hyId删除会员	
	 */
	public int deleteHY(int hyId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过用 ， 连接hyId的字符串批量删除会员	
	 */
	public int deleteHY(String hyIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新会员信息
	 */
	public HY updateHY(HY hy);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过hyId 查找会员
	 */
	public HY queryHY(int hyId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过Page查找会员实现分页	
	 */
	public ArrayList<HY> queryHY(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 添加活动	
	 */
	public HD insertHD(HD hd);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过hdId 删除活动	
	 */
	public int deleteHD(int hdId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过用 ， 连接hdId 的字符串批量删除活动	
	 */
	public int deleteHD(String hdIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新活动信息
	 */
	public HD updateHD(HD hd);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过hdId查找活动	
	 */
	public HD queryHD(int hdId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过Page查找活动实现分页
	 */
	public HD queryHD(Page page);
	
	/*销售统计先不做*/
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加上架信息
	 */
	public SJ insertSJ(SJ sj);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过sjId 删除上架信息
	 */
	public int deleteSJ(int sjId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过用 ， 连接sjId而成的字符串批量删除上架信息
	 */
	public int deleteSJ(String sjIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新上架信息
	 */
	public SJ updateSJ(SJ sj);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过sjId查找上架信息
	 */
	public SJ querySJ(int sjId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过Page 查找上架信息实现分页	
	 */
	public ArrayList<SJ> querySJ(Page page	);

	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过Page查找最新上映的影片  实现分页
	 */
	public ArrayList<Movie> queryZXSY(Page page);//最新上映
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加放映厅
	 */
	public Hall insertHall(Hall hall);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过hallId 删除放映厅信息
	 */
	public int deleteHall(int hallId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过用， 连接hallId的字符串批量删除放映厅信息
	 */
	public int deleteHall(String hallIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 更新放映厅信息
	 */
	public Hall updateHall(Hall hall);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过hallId查找放映厅信息
	 */
	public Hall queryHall(int hallId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 通过	Page查找放映厅信息实现分页
	 */
	public ArrayList<Hall> queryHall(Page page);
	
	/*座位模板暂时不做*/
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 购买票务操作
	 */
	public Order buyTicket(Order order);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 退票操作
	 */
	public int deleteTicket(int orderId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过orderId查找票务信息
	 */
	public Order queryTicket(int orderId);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日
	 * 	通过Page查找票务信息实现分页
	 */
	public ArrayList<Order> queryTicket(Page page);
	
	/*信息中心先不做*/
	
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 添加影院管理员权限
	 */
	public CmanaRight insertCmanaRight(CmanaRight right);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 通过cmanaRightId删除管理员权限
	 */
	public int deleteCmanaRight(int cmanaRightid);
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 * 查找全部影院管理员权限
	 */
	public ArrayList<CmanaRight> queryCmanaRight();
	
	
}
