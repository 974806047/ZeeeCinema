package com.hzyc.Zee.service;

import java.util.ArrayList;

import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.CmanaRight;
import com.hzyc.Zee.bean.HD;
import com.hzyc.Zee.bean.HY;
import com.hzyc.Zee.bean.HYType;
import com.hzyc.Zee.bean.Hall;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Order;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.SJ;

//一些影院管理员操作接口
public interface CManaService {
	/**
	 * @author Zeeephr
	 * @date   2017年10月1日	
	 */
	public ArrayList<CMana> queryCmana(Page page);
	public CMana queryCmana(int cmanaId);
	public CMana queryCmana(String cmanaName);
	public int deleteCmana(int cmanaId);
	public int deleteCmana(String cmanaIdList);
	public CMana updateCmana(CMana cmana);
	public CMana insertCmana(CMana cmana);
	
	public HYType insertHYType(HYType type);
	public int deleteHYType(int hytypeId);
	public int deleteHYType(String hytypeIdList);
	public HYType updateHYType(HYType type);
	public HYType queryHYtype(int hytypeId);
	public ArrayList<HYType> queryHytype(Page page);
	public HY insertHY(HY hy);
	public int deleteHY(int hyId);
	public int deleteHY(String hyIdList);
	public HY updateHY(HY hy);
	public HY queryHY(int hyId);
	public ArrayList<HY> queryHY(Page page);
	public HD insertHD(HD hd);
	public int deleteHD(int hdId);
	public int deleteHD(String hdIdList);
	public HD updateHD(HD hd);
	public HD queryHD(int hdId);
	public HD queryHD(Page page);
	
	/*销售统计先不做*/
	
	public SJ insertSJ(SJ sj);
	public int deleteSJ(int sjId);
	public int deleteSJ(String sjIdList);
	public SJ updateSJ(SJ sj);
	public SJ querySJ(int sjId);
	public ArrayList<SJ> querySJ(Page page	);
	public Movie insertMovie(Movie movie);
	public int deleteMovie(int movieId);
	public int deleteMovie(String movieIdList);
	public Movie updateMovie(Movie movie);
	public Movie queryMovie(int movieId);
	public ArrayList<Movie> queryMovie(Page page	);
	public ArrayList<Movie> queryZXSY(Page page);//最新上映
	
	public Hall insertHall(Hall hall);
	public int deleteHall(int hallId);
	public int deleteHall(String hallIdList);
	public Hall updateHall(Hall hall);
	public Hall queryHall(int hallId);
	public ArrayList<Hall> queryHall(String hallIdList);
	
	/*座位模板暂时不做*/
	
	public Order buyTicket(Order order);
	public int deleteTicket(int orderId);
	public Order queryTicket(int orderId);
	public ArrayList<Order> queryTicket(String orderIdList);
	
	/*信息中心先不做*/
	
	public CmanaRight insertCmanaRight(CmanaRight right);
	public int deleteCmanaRight(int cmanaRightid);
	public ArrayList<CmanaRight> queryCmanaRight(Page page);
	
	
}
