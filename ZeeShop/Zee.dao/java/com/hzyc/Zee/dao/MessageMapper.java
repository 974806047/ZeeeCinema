package com.hzyc.Zee.dao;

import java.util.ArrayList;

import com.hzyc.Zee.bean.Message;
import com.hzyc.Zee.bean.Page;

public interface MessageMapper {
	public void insertMessage(Message message);
	public void deleteMessageById(int messageId);
	public void updateMessage(Message message);
	public ArrayList<Message> getMessageByPage(Page page);
	public Message getMessageById(int messageId);
	
}
