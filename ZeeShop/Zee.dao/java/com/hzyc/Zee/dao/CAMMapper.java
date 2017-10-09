package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.CAM;
import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;

public interface CAMMapper {
	public void insertCAM(CAM cam);
	public void deleteCAMById(int camId	);
	public ArrayList<Cinema> queryCAMByMovieName(Page page);
	public ArrayList<Movie> queryCAMByCinemaId(Page page);
	
}
