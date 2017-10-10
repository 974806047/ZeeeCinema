package com.hzyc.Zee.service.imp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzyc.Zee.bean.Ad;
import com.hzyc.Zee.bean.CAM;
import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.bean.YingPing;
import com.hzyc.Zee.dao.AdMapper;
import com.hzyc.Zee.dao.CAMMapper;
import com.hzyc.Zee.dao.CManaMapper;
import com.hzyc.Zee.dao.CinemaMapper;
import com.hzyc.Zee.dao.ManaMapper;
import com.hzyc.Zee.dao.MovieMapper;
import com.hzyc.Zee.dao.UserMapper;
import com.hzyc.Zee.dao.YingPingMapper;
import com.hzyc.Zee.service.ManaService;

public class ManaServiceImpl implements ManaService{
	
	@Autowired
	ManaMapper manaMapper;
	@Autowired
	CManaMapper cmanaMapper;
	
	@Autowired
	MovieMapper movieMapper;
	@Autowired
	CinemaMapper cinemaMapper;
	@Autowired
	CAMMapper camMapper;
	@Autowired
	AdMapper adMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	YingPingMapper ypMapper;
	
	@Override
	public Mana login(Mana mana,HttpServletRequest request) {
		// TODO Auto-generated method stub
		String userName=mana.getUserName();
		String password=mana.getPassword();
		if("".equals(userName)||"".equals(password)) {
			return null;
		}
		else {
			Mana m1=queryMana(userName);
			if(m1==null) return null;
			else {
				if(m1.getPassword()==password) {
					HttpSession session=request.getSession();
					session.setAttribute("userName", userName);
					return m1;
				}
				else return null;
			}
		}
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean haveRight(String userName, String rightName) {
		// TODO Auto-generated method stub
		boolean bol=false;
		try{
			Mana mana=manaMapper.getManaByUserName(userName);
			String manaRight=mana.getRight();
			if(manaRight.contentEquals(rightName)){//权限包含了就有这个权限
				bol=true;
			}
			if(mana.getHighRight()==1){//有最高权限 也就有这个权限
				bol = true;
			}
			
		}
		catch(Exception e){	
			e.printStackTrace();
		}
		return bol;
	}

	@Override
	public Mana insertMana(Mana mana) {
		// TODO Auto-generated method stub
		try{manaMapper.insertMana(mana);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return mana;
	}

	@Override
	public int deleteMana(int manaId) {
		// TODO Auto-generated method stub
		try{
			manaMapper.deleteManaById(manaId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteMana(String manaIdList) {
		// TODO Auto-generated method stub
		try{
		String manaId[]=manaIdList.split(",");
		for(String id:manaId){
			int idd=Integer.parseInt(id);
			deleteMana(idd);
		}}
		catch (Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Mana updateMana(Mana mana) {
		// TODO Auto-generated method stub
		try{
			manaMapper.updateMana(mana);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return mana;
	}

	@Override
	public Mana queryMana(int id) {
		// TODO Auto-generated method stub
		Mana mana=new Mana();
		try {
			mana=manaMapper.getManaByUserId(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return mana;
	}

	@Override
	public Mana queryMana(String userName) {
		// TODO Auto-generated method stub
		Mana mana=new Mana();
		try {
			mana=manaMapper.getManaByUserName(userName);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return mana;
	}

	@Override
	public ArrayList<Mana> queryMana(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Mana> manaList=new ArrayList<Mana>();
		try {
			manaList=manaMapper.getManaByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return manaList;
	}

	
	@Override
	public Movie insertMovie(Movie movie) {
		// TODO Auto-generated method stub
		try{
			movieMapper.insertMovie(movie);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return movie;
	}

	@Override
	public int deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		try{
			movieMapper.deleteMovieById(movieId);;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteMovie(String movieIdList) {
		// TODO Auto-generated method stub
		try{
			String movieId[]=movieIdList.split(",");
			for(String idd:movieId){
				int id=Integer.parseInt(idd);
				movieMapper.deleteMovieById(id);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		try{
			movieMapper.updateMovie(movie);;;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return movie;
	}

	@Override
	public ArrayList<Movie> queryMovie(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movieList=new ArrayList<Movie>();
		try {
			movieList=movieMapper.getMovieByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return movieList;
	}

	@Override
	public int fenFaMovie(Movie movie, String cinemaIdList) {
		// TODO Auto-generated method stub
		try{
			int movieId=movie.getId();
			String movieName =movie.getMovieName();
			String list[]=cinemaIdList.split(",");
			for(String s:list){
				int cinemaId=Integer.parseInt(s);
				Cinema cinema=cinemaMapper.getCinemaById(cinemaId);
				CAM cam=new CAM();
				cam.setCinemaId(cinemaId);
				cam.setCinemaName(cinema.getName());
				cam.setMovieId(movieId);
				cam.setMovieName(movieName);
				camMapper.insertCAM(cam);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public ArrayList<String> queryMovieByCinema(int cinemaId) {
		// TODO Auto-generated method stub
		
		
		Page page=new Page();
		//page.setWhere("");
		return null;
	}

	@Override
	public ArrayList<String> queryCinemaByMovie(String movieName) {
		// TODO Auto-generated method stub
		//暂时不写
		return null;
	}

	@Override
	public Ad insertAd(Ad ad) {
		// TODO Auto-generated method stub
		try{
			adMapper.insertAd(ad);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return ad;
	}

	@Override
	public int deleteAd(int adId) {
		// TODO Auto-generated method stub
		try{
			adMapper.deleteAdById(adId);
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteAd(String adIdList) {
		// TODO Auto-generated method stub
		try{
		String list[]=adIdList.split(",");
		for(String s:list){
			int adId=Integer.parseInt(s);
			adMapper.deleteAdById(adId);
		}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public ArrayList<Ad> queryAd(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Ad> adList=new ArrayList<Ad>();
		try{
			
			adList=adMapper.getAdByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return adList;
	}

	@Override
	public Cinema insertCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		try{
			cinemaMapper.insertCinema(cinema);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cinema;
	}

	@Override
	public int deleteCinema(int cinemaId) {
		// TODO Auto-generated method stub
		try{
			cinemaMapper.deleteCinemaById(cinemaId);;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteCinema(String cinemaIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=cinemaIdList.split(",");
			for(String s:list){
				int cinemaId=Integer.parseInt(s);
				cinemaMapper.deleteCinemaById(cinemaId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Cinema updateCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		try{
			cinemaMapper.updateCinema(cinema);;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cinema;
	}

	@Override
	public Cinema queryCinema(int cinemaId) {
		// TODO Auto-generated method stub
		Cinema cinema=new Cinema();
		try{
			cinema=cinemaMapper.getCinemaById(cinemaId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cinema;
	}

	@Override
	public ArrayList<Cinema> queryCinema(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Cinema> cinemaList=new ArrayList<Cinema>();
		try{
			cinemaList=cinemaMapper.getCinemaByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cinemaList;
	}

	@Override
	public CMana insertCMana(CMana cMana) {
		// TODO Auto-generated method stub
		try{
			cmanaMapper.insertCMana(cMana);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return cMana;
	}

	@Override
	public int deleteCMana(int CManaId) {
		// TODO Auto-generated method stub
		try{
			cmanaMapper.deleteCManaById(CManaId);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteCMana(String CManaIdList) {
		// TODO Auto-generated method stub
		
		try{
			String list[]=CManaIdList.split(",");
			for(String s:list){
				int cmanaId=Integer.parseInt(s);
				cmanaMapper.deleteCManaById(cmanaId);
			}
		}
		catch(Exception e){
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
	public CMana queryCMana(int cManaId) {
		// TODO Auto-generated method stub
		CMana cmana=new CMana();
		try{
			cmana=cmanaMapper.getCManaById(cManaId);
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
		return cmana;
	}

	@Override
	public ArrayList<CMana> queryCMana(Page page) {
		// TODO Auto-generated method stub
		ArrayList<CMana> cmanaList=new ArrayList<CMana>();
		try{
			cmanaList=cmanaMapper.getCManaByPage(page);
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
		return cmanaList;
	}

	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		try{
			userMapper.insertUser(user);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		try{
			userMapper.deleteUserById(userId);;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteUser(String userIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=userIdList.split(","	);
			for(String s:list){
				int userId=Integer.parseInt(s);
				userMapper.deleteUserById(userId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		try{
			userMapper.updateUser(user);;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	public User queryUser(int userId) {
		// TODO Auto-generated method stub
		User user=new User();
		try{
			user=userMapper.getUserByUserId(userId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return user;
		
	}

	@Override
	public ArrayList<User> queryUser(Page page) {
		// TODO Auto-generated method stub
		ArrayList<User> userList=new ArrayList<User>();
		
		try{
			userList=userMapper.getUserByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return userList;
	}

	@Override
	public ArrayList<YingPing> queryYingPing(Page page) {
		// TODO Auto-generated method stub
		ArrayList<YingPing> ypList=new ArrayList<YingPing>();
		try{
			ypList=ypMapper.getYingPingByPage(page);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return ypList;
	}

	@Override
	public YingPing queryYingPing(int YingPingId) {
		// TODO Auto-generated method stub
		YingPing yp=new YingPing();
		try{
			yp=ypMapper.getYingPingById(YingPingId);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return yp;
	}

	@Override
	public int deleteYingPing(int YingPingId) {
		// TODO Auto-generated method stub
		try{
			ypMapper.deleteYingPingById(YingPingId);;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteYingPing(String YingPingIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=YingPingIdList.split(",");
			for(String s:list){
				int ypId=Integer.parseInt(s);
				ypMapper.deleteYingPingById(ypId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public Ad updateAd(Ad ad) {
		// TODO Auto-generated method stub
		try{
			adMapper.updateAd(ad);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return ad;
	}

}
