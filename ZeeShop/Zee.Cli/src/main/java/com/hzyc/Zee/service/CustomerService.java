package com.hzyc.Zee.service;

import java.util.ArrayList;

import com.hzyc.Zee.bean.FanKui;
import com.hzyc.Zee.bean.Message;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Order;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.bean.YingPing;

//顾客行为接口
/**
 * @author Zeeephr
 *
 */
public interface CustomerService {

	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 注册新用户
	 * 向邮箱发送邮件   向手机发送信息
	 */
	public User register(User user);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过用户名密码登陆
	 */
	public User login(String userName,String password);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过手机号登陆
	 */
	public User login(String tel);
	
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 改变密码  这里未设置成密文  后期会修改
	 */
	public User changePassword(String password,User user);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	\
	 * 改变邮箱
	 * 会向原邮箱发送信息
	 */
	public User changeMail(String mail ,User user);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 修改电话号 会向原电话号发送信息确认
	 */
	public User changeTel(String tel,User user);	
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 更新会员信息
	 */
	public User changeMess(User user);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 发送影评
	 */
	public YingPing sendYingPing(YingPing yp);	
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 查看自己的影评
	 */
	public ArrayList<YingPing> LookYingPing(Page  page);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 批量删除影评
	 */
	public int deleteYingPing(String yingPingIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 更新影评
	 */
	public YingPing updateYingPing(YingPing yingPing);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 通过YingPingId 查找影评
	 */
	public YingPing queryYingPing(int YingPingId);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 通过MessageId查找发送给用户的信息
	 */
	public Message queryMessage(int MessageId);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 通过Page查找信息实现分类
	 */
	public ArrayList<Message> queryMessage(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 标记已读
	 */
	public int haveRead(String MessageIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年9月20日	
	 * 批量删除信息
	 */
	public int deleteMessage(String MessageIdList);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 提交反馈
	 */
	public FanKui sendFanKui(FanKui fanKui);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 删除反馈
	 */
	public int deleteFanKui(int fanKuiId);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 查到自己发送的反馈
	 */
	public FanKui queryFanKui();
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 添加订单
	 */
	public Order addOrder(Order order);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过Page查找订单实现分页
	 */
	public ArrayList<Order> queryOrder(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过orderId查找订单  查看详情
	 */
	public Order queryOrder(int orderId);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 显示首页时  加载movie
	 */
	public ArrayList<Movie> queryMovie(Page page);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过movieId查找movie 查看详情
	 */
	public Movie queryMovie(int movieId	);
	/**
	 * @author Zeeephr
	 * @date   2017年9月21日	
	 * 通过一些关键字查找电影
	 */
	public Movie queryMovie(String likeStr,Page page);

}
