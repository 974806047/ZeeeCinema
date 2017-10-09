package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Page;

public interface CinemaMapper {
	public void insertCinema(Cinema cinema);
	public void deleteCinemaById(int cinemaId);
	public void updateCinema(Cinema cinema);
	public Cinema getCinemaById(int cinemaId);
	public ArrayList<Cinema> getCinemaByPage(Page page);
	
}
