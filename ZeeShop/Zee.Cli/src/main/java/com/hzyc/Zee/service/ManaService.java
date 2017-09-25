package com.hzyc.Zee.service;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Ad;
import com.hzyc.Zee.bean.CMana;
import com.hzyc.Zee.bean.Cinema;
import com.hzyc.Zee.bean.Mana;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.bean.YingPing;

//后台管理员接�?

/**
 * @author Zeeephr
 *
 */
public interface ManaService {

	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 判断该管理院有无权限
	 */
	public boolean haveRight(String userName,String rightName);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 添加�?个管理员
	 */
	public Mana insertMana(Mana mana);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过id删除管理�?
	 */
	public int deleteMana(int  manaId);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�?个以 �? 连接的管理员名字符串来批量删除管理员
	 */
	public int deleteMana(String manaNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过mana的id来更新管理员信息�?
	 */
	public Mana updateMana(Mana mana);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过id寻找后台管理�?
	 */
	public Mana queryMana(int id);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过管理员的用户名查�? 
	 */
	public Mana queryMana(String userName);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 借助Page �? 批量查找后台管理�?
	 */
	public ArrayList<Mana> queryMana(Page page);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 添加电影
	 */
	public Movie insertMovie(Movie movie); 
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过movieId删除电影
	 */
	public int deleteMovie(int movieId);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�? �? 分割的MovieName的字符串
	 */
	public int deleteMovie(String movieNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过movieId来更新电影信�?
	 */
	public Movie updateMovie(Movie movie);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过Page类来查找Movie实现分页
	 */
	public ArrayList<Movie> queryMovie(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 分发电影到各个影�?
	 */
	public int fenFaMovie(Movie movie,String cinemaNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过cinemaId来看影院里面能上映的电影有什�?
	 */
	public ArrayList<String> queryMovieByCinema(int cinemaId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过movieName来查看电影都在哪里上映了
	 */
	public ArrayList<String> queryCinemaByMovie(String movieName);

	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 添加广告
	 */
	public Ad insertAd(Ad ad);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过广告Id删除广告
	 */
	public int deleteAd(int adId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�? �? 分割adName的字符串
	 */
	public int deleteAd(String adNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过Page查找广告来实现分�?
	 */
	public ArrayList<Ad> queryAd(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 添加影院
	 */
	public Cinema insertCinema(Cinema cinema );
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过影院id来删�?
	 */
	public int deleteCinema(int cinemaId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?
	 * 通过 ，分割cinemaName的字符串批量电影�?	
	 */
	public int deleteCinema(String cinemaNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 更改 CInema
	 */
	public Cinema updateCinema(Cinema cinema);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过cinemaId查找影院
	 */
	public Cinema queryCinema(int cinemaId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�? �? 分割cinemaName的字符串
	 */
	public Cinema queryCinema(String cinemaNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过Page类查找cinema 实现分页
	 */
	public ArrayList<Cinema> queryCinema(Page page);
	
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?
	 * 添加CMana	
	 */
	public CMana insertCMana(CMana cMana);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过cmanaId删除影院管理�?
	 */
	public int deleteCMana(int CManaId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�? �? 分割CmanaName的字符串
	 */
	public int deleteCMana(String CManaNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?
	 * 更新系统管理�?	
	 */
	public CMana updateCmana(CMana cmana);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过cManaId来查找系统管理员
	 */
	public CMana queryCMana(int cManaId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过Page 查找系统管理员实现分�?
	 */
	public ArrayList<CMana> queryCMana(Page page);
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 添加会员
	 */
	public User insertUser(User user);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过userId来删除会�?
	 */
	public int deleteUser(int userId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过 �? ，分割userName的字符串来删除会�?
	 */
	
	public int deleteUser(String userNameList);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 更新会员信息
	 */
	public User updateUser(User user);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?
	 * 通过userId查找会员	
	 */
	public User queryUser(int userId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过Page查找User实现分类
	 */
	public ArrayList<User> queryUser(Page page);
	
	//会员分布函数未编�?   权限列表未编�?
	
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?
	 * 通过Page 查找影评实现分类	
	 */
	public ArrayList<YingPing> queryYingPing(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过yingPIngId查找影评
	 */
	public YingPing queryYingPing(int YingPingId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过YingPingId删除影评
	 */
	public int deleteYingPing(int YingPingId);
	/**
	 * @author Zeeephr
	 * @date   2017�?9�?19�?	
	 * 通过�? �? 分割yingPingName的字符串批量删除影评
	 */
	public int deleteYingPing(String YingPingNameList);
	
	
}
	