package com.hzyc.Zee.service.imp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzyc.Zee.bean.FanKui;
import com.hzyc.Zee.bean.Message;
import com.hzyc.Zee.bean.Movie;
import com.hzyc.Zee.bean.Order;
import com.hzyc.Zee.bean.Page;
import com.hzyc.Zee.bean.User;
import com.hzyc.Zee.bean.YingPing;
import com.hzyc.Zee.dao.MessageMapper;
import com.hzyc.Zee.dao.MovieMapper;
import com.hzyc.Zee.dao.OrderMapper;
import com.hzyc.Zee.dao.UserMapper;
import com.hzyc.Zee.dao.YingPingMapper;
import com.hzyc.Zee.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	MovieMapper movieMapper;
	@Autowired
	OrderMapper orderMapper;
	@Autowired
	MessageMapper messageMapper;
	@Autowired
	YingPingMapper ypMapper;
	
	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		User user1=new User();
		try{
			String userName=user.getUserName();
			user1=userMapper.getUserByUserName(userName);
			if(user1!=null||!("").equals(user1))return null;
			else userMapper.insertUser(user);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		User user=new User();
		try{
			User user1=userMapper.getUserByUserName(userName);
			if(user1!=null||!("").equals(user1))return null;
			else {
				user.setUserName(userName);
				user.setPassword(password);
				userMapper.insertUser(user);
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return user;
	}

	@Override
	public User login(String tel) {
		// TODO Auto-generated method stub
		
		return null;
	}

	

	@Override
	public YingPing sendYingPing(YingPing yp) {
		// TODO Auto-generated method stub
		try{
			ypMapper.insertYingPing(yp);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return yp;
	}

	@Override
	public ArrayList<YingPing> LookYingPing(Page page) {
		// TODO Auto-generated method stub
		ArrayList<YingPing> ypList=new ArrayList<YingPing>();
		
		try{
			ypList=ypMapper.getYingPingByPage(page	);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return ypList;
	}

	@Override
	public int deleteYingPing(String yingPingIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=yingPingIdList.split(",");
			for(String s:list){
				int yingPingId=Integer.parseInt(s);
				ypMapper.deleteYingPingById(yingPingId);
			
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public YingPing updateYingPing(YingPing yingPing) {
		// TODO Auto-generated method stub
		try{
			ypMapper.updateYingPing(yingPing);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return yingPing;
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
	public Message queryMessage(int MessageId) {
		// TODO Auto-generated method stub
		Message message=new Message();
		try{
			message=messageMapper.getMessageById(MessageId);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return message;
	}

	@Override
	public ArrayList<Message> queryMessage(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Message> messageList=new ArrayList<Message>();
		try{
			messageList=messageMapper.getMessageByPage(page);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return messageList;
	}

	@Override
	public int haveRead(String MessageIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=MessageIdList.split(",");
			
			for(String s:list){
				int messageId=Integer.parseInt(s);
				Message message=messageMapper.getMessageById(messageId);
				message.setHaveLook(1);
				messageMapper.updateMessage(message);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public int deleteMessage(String MessageIdList) {
		// TODO Auto-generated method stub
		try{
			String list[]=MessageIdList.split(",");
			for(String s:list){
				int messageId=Integer.parseInt(s);
				messageMapper.deleteMessageById(messageId);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	@Override
	public FanKui sendFanKui(FanKui fanKui) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteFanKui(int fanKuiId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FanKui queryFanKui() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		try{
			orderMapper.insertOrder(order);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return order;
	}

	@Override
	public ArrayList<Order> queryOrder(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Order> orderList	=new ArrayList<Order>();
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
	public Order queryOrder(int orderId) {
		// TODO Auto-generated method stub
		Order order=new Order();
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
	public ArrayList<Movie> queryMovie(Page page) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movieList=new ArrayList<Movie>();
		try{
			movieList=movieMapper.getMovieByPage(page);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return movieList;
	}

	@Override
	public Movie queryMovie(int movieId) {
		// TODO Auto-generated method stub
		Movie movie=new Movie();
		try{
			movie=movieMapper.getMovieById(movieId);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return movie;
	}

	@Override
	public User changePassword(String oldpassword, String newpassword, HttpServletRequest req) {
		// TODO Auto-generated method stub
		User user=new User();
		try{
			String userName=req.getSession().getAttribute("userName").toString();
			user=userMapper.getUserByUserName(userName);
			if(user.equals("")||user==null){
				return null;
			}
			String password=user.getPassword();
			if(!password.equals(oldpassword)){
				return null;
			}
			user.setPassword(newpassword);
			userMapper.updateUser(user);
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return user;
	}

	@Override
	public User changeMail(String mail, HttpServletRequest req) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User changeTel(String oldtel, String newtel, HttpServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User changeMess(User user) {
		// TODO Auto-generated method stub
		try{
			userMapper.updateUser(user);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return user;
	}


}
