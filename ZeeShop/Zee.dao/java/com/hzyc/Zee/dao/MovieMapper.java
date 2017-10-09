package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;

public interface MovieMapper {
	public void insertMovie(Movie movie);
	public void deleteMovieById(int movieId);
	public void updateMovie(Movie movie);
	public Movie getMovieById(int movieId);
	public Movie getMovieByName(String movieName);
	public ArrayList<Movie> getMovieByPage(Page page);
	
}
