package com.hzyc.Zee.service.imp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

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
import com.hzyc.Zee.dao.CManaMapper;
import com.hzyc.Zee.dao.CmanaRightMapper;
import com.hzyc.Zee.dao.HDMapper;
import com.hzyc.Zee.dao.HYMapper;
import com.hzyc.Zee.dao.HYTypeMapper;
import com.hzyc.Zee.dao.HallMapper;
import com.hzyc.Zee.dao.OrderMapper;
import com.hzyc.Zee.dao.SJMapper;
import com.hzyc.Zee.service.CManaService;

public class CManaServiceImpl implements CManaService{

	@Autowired
	CManaMapper cmanaMapper;
	@Autowired
	HYTypeMapper hytypeMapper;
	@Autowired
	HYMapper hyMapper;
	@Autowired
	HDMapper hdMapper;
	@Autowired
	SJMapper sjMapper;
	@Autowired
	HallMapper hallMapper;
	@Autowired 
	OrderMapper orderMapper;
	@Autowired
	CmanaRightMapper cmanaRightMapper;
	
	
	@Override
	public CMana login(CMana cmana,HttpServletRequest request) {
		// TODO Auto-generated method stub
		CMana m1=new CMana();
		try{
			String userName=cmana.getUserName();
			String password=cmana.getPassword();
			if("".equals(userName)||"".equals(password)) {
				return null;
			}
			else {
				m1=queryCmana(userName);
				if(m1==null) return null;
				else {
					if(m1.getPassword()==password) {
						HttpSession session=request.getSession();
						session.setAttribute("userName", userName);
						
					}
					else return null;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return m1;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean haveRight(HttpServletRequest request,String cmanaRightName) {
		// TODO Auto-generated method stub
		boolean bol=false;
		String userName;
		try{
			userName=request.getSession().getAttribute("userName").toString().trim();
			CMana cmana=cmanaMapper.getCManaByName(userName);
			String cmanaRight=cmana.getRight();
			if(cmanaRight.contentEquals(cmanaRightName)){//权限包含了就有这个权限
				bol=true;
			}
			if(cmana.getHighRight()==1){//有最高权限 也就有这个权限
				bol = true;
			}
			
		}
		catch(Exception e){	
			e.printStackTrace();
		}
		return bol;
	}

	@Override
	public ArrayList<CMana> queryCmana(Page page) {
		// TODO Auto-generated method stub
		ArrayList<CMana> cmanaList=new ArrayList<CMana>();
		try {
			cmanaList=cmanaMapper.getCManaByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmanaList;
	}

	@Override
	public CMana queryCmana(int cmanaId) {
		// TODO Auto-generated method stub
		CMana cmana=new CMana();
		try {
			cmana=cmanaMapper.getCManaById(cmanaId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmana;
	}

	@Override
	public CMana queryCmana(String cmanaName) {
		// TODO Auto-generated method stub
		CMana cmana=new CMana();
		try {
			cmana=cmanaMapper.getCManaByName(cmanaName);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmana;
	}

	@Override
	public int deleteCmana(int cmanaId) {
		// TODO Auto-generated method stub
		try{
			cmanaMapper.deleteCManaById(cmanaId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteCmana(String cmanaIdList) {
		// TODO Auto-generated method stub
		try{
			String cmanaId[]=cmanaIdList.split(",");
			for(String id:cmanaId){
				int idd=Integer.parseInt(id);
				deleteCmana(idd);
			}}
			catch (Exception e){
				e.printStackTrace();
				return 0;
			}
			return 1;
	}

	@Override
	public CMana updateCmana(CMana cmana) {
		// TODO Auto-generated method stub
		try{
			cmanaMapper.updateCMana(cmana);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmana;
	}

	@Override
	public CMana insertCmana(CMana cmana) {
		// TODO Auto-generated method stub
		try{cmanaMapper.insertCMana(cmana);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmana;
	}

	@Override
	public HYType insertHYType(HYType type) {
		// TODO Auto-generated method stub
		try{hytypeMapper.insertHYType(type);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return type;
	}

	@Override
	public int deleteHYType(int hytypeId) {
		// TODO Auto-generated method stub
		try{hytypeMapper.deleteHYTypeById(hytypeId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteHYType(String hytypeIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=hytypeIdList.split(",");
			for(String s:list){
				int hytypeId=Integer.parseInt(s);
				hytypeMapper.deleteHYTypeById(hytypeId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public HYType updateHYType(HYType type) {
		// TODO Auto-generated method stub
		try{hytypeMapper.updateHYType(type);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return type;
	}

	@Override
	public HYType queryHYtype(int hytypeId) {
		// TODO Auto-generated method stub
		HYType hytype=new HYType();
		try{
			hytype=hytypeMapper.getHYTypeById(hytypeId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hytype;
	}

	@Override
	public ArrayList<HYType> queryHytype(Page page) {
		// TODO Auto-generated method stub
		ArrayList<HYType> hytypeList=new ArrayList<HYType>();
		try{
			hytypeList=hytypeMapper.getHYTypeByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hytypeList;
	}

	@Override
	public HY insertHY(HY hy) {
		// TODO Auto-generated method stub
		try{
			hyMapper.insertHY(hy);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hy;
	}

	@Override
	public int deleteHY(int hyId) {
		// TODO Auto-generated method stub
		try{
			hyMapper.deleteHYById(hyId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteHY(String hyIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=hyIdList.split(",");
			for(String s:list){
				int hyId=Integer.parseInt(s);
				hyMapper.deleteHYById(hyId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public HY updateHY(HY hy) {
		// TODO Auto-generated method stub
		try{
			hyMapper.updateHY(hy);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hy;
	}

	@Override
	public HY queryHY(int hyId) {
		// TODO Auto-generated method stub
		HY hy=new HY();
		try{
			hy=hyMapper.getHyById(hyId);
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hy;
	}

	@Override
	public ArrayList<HY> queryHY(Page page) {
		// TODO Auto-generated method stub
		ArrayList<HY> hyList=new ArrayList<HY>();
		try{
			hyList=hyMapper.getHYByPage(page);
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hyList;
	}

	@Override
	public HD insertHD(HD hd) {
		// TODO Auto-generated method stub
		try{
			hdMapper.insertHD(hd);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hd;
	}

	@Override
	public int deleteHD(int hdId) {
		// TODO Auto-generated method stub
		try{
			hdMapper.deleteHDById(hdId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteHD(String hdIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=hdIdList.split(",");
			for(String s:list){
				int hdId=Integer.parseInt(s);
				hdMapper.deleteHDById(hdId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public HD updateHD(HD hd) {
		// TODO Auto-generated method stub
		try{
			hdMapper.updateHD(hd);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hd;
	}

	@Override
	public HD queryHD(int hdId) {
		// TODO Auto-generated method stub
		HD hd=new HD();
		try{
			hd=hdMapper.getHDById(hdId);
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hd;
	}

	@Override
	public ArrayList<HD> queryHD(Page page) {
		// TODO Auto-generated method stub
		ArrayList<HD> hdList=new ArrayList<HD>();
		try{
			hdList=hdMapper.getHDByPage(page);
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hdList;
	}

	@Override
	public SJ insertSJ(SJ sj) {
		// TODO Auto-generated method stub
		try{
			sjMapper.insertSJ(sj);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return sj;
	}

	@Override
	public int deleteSJ(int sjId) {
		// TODO Auto-generated method stub
		try{
			sjMapper.deleteSJById(sjId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteSJ(String sjIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=sjIdList.split(",");
			for(String s:list){
				int sjId=Integer.parseInt(s);
				sjMapper.deleteSJById(sjId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public SJ updateSJ(SJ sj) {
		// TODO Auto-generated method stub
		try{
			sjMapper.updateSJ(sj);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return sj;
	}

	@Override
	public SJ querySJ(int sjId) {
		// TODO Auto-generated method stub
		SJ sj=new SJ();
		try{
			sj=sjMapper.getSjById(sjId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return sj;
	}

	@Override
	public ArrayList<SJ> querySJ(Page page) {
		// TODO Auto-generated method stub
		ArrayList<SJ> sjList=new ArrayList<SJ>();
		
		try{
			sjList=sjMapper.getSJByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return sjList;
	}

	@Override
	public ArrayList<Movie> queryZXSY(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hall insertHall(Hall hall) {
		// TODO Auto-generated method stub
		try{
			hallMapper.insertHall(hall);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hall;
	}

	@Override
	public int deleteHall(int hallId) {
		// TODO Auto-generated method stub
		try{
			hallMapper.deleteHallById(hallId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteHall(String hallIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=hallIdList.split(",");
			for(String s:list){
				int hallId=Integer.parseInt(s);
				hallMapper.deleteHallById(hallId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Hall updateHall(Hall hall) {
		// TODO Auto-generated method stub
		try{
			hallMapper.updateHall(hall);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hall;
	}

	@Override
	public Hall queryHall(int hallId) {
		// TODO Auto-generated method stub
		Hall hall=new Hall();
		try{
			hall=hallMapper.getHallById(hallId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hall;
	}

	@Override
	public ArrayList<Hall> queryHall(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Hall> hallList=new ArrayList<Hall>();
		
		try{
			hallList=hallMapper.getHallPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return hallList;
	}

	@Override
	public Order buyTicket(Order order) {
		// TODO Auto-generated method stub
		
		try{
			orderMapper.insertOrder(order);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return order;
	}

	@Override
	public int deleteTicket(int orderId) {
		// TODO Auto-generated method stub
		try{
			orderMapper.deleteOrderById(orderId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Order queryTicket(int orderId) {
		// TODO Auto-generated method stub
		Order order= new Order();
		try{
			order=orderMapper.getOrderById(orderId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return order;
	}

	@Override
	public ArrayList<Order> queryTicket(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Order> orderList=new ArrayList<Order>();
		try{
			orderList=orderMapper.getOrderByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return orderList;
	}

	@Override
	public CmanaRight insertCmanaRight(CmanaRight right) {
		// TODO Auto-generated method stub
		try{
			cmanaRightMapper.insertCManaRight(right);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return right;
	}

	@Override
	public int deleteCmanaRight(int cmanaRightid) {
		// TODO Auto-generated method stub
		try{
			cmanaRightMapper.deleteCManaRightById(cmanaRightid);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public ArrayList<CmanaRight> queryCmanaRight() {
		// TODO Auto-generated method stub
		ArrayList<CmanaRight> cmanaRightList=new ArrayList<CmanaRight>();
		try{
			cmanaRightList=cmanaRightMapper.getAllCManaRight();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cmanaRightList;
	}

}
