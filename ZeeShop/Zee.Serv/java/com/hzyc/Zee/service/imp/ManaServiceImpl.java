package com.hzyc.Zee.service.imp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hzyc.Zee.bean.Ad;
import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.bean.YingPing;
import com.hzyc.Zee.service.ManaService;

public class ManaServiceImpl implements ManaService{

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
		return false;
	}

	@Override
	public Mana insertMana(Mana mana) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteMana(int manaId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMana(String manaIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mana updateMana(Mana mana) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mana queryMana(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mana queryMana(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Mana> queryMana(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie insertMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMovie(String movieIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Movie> queryMovie(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int fenFaMovie(Movie movie, String cinemaNameList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<String> queryMovieByCinema(int cinemaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> queryCinemaByMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ad insertAd(Ad ad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAd(int adId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAd(String adIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Ad> queryAd(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cinema insertCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCinema(int cinemaId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCinema(String cinemaIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cinema updateCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cinema queryCinema(int cinemaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cinema> queryCinema(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CMana insertCMana(CMana cMana) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCMana(int CManaId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCMana(String CManaIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CMana updateCmana(CMana cmana) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CMana queryCMana(int cManaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CMana> queryCMana(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String userIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> queryUser(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<YingPing> queryYingPing(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public YingPing queryYingPing(int YingPingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteYingPing(int YingPingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteYingPing(String YingPingIdList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
