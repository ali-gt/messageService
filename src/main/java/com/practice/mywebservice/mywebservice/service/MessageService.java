package com.practice.mywebservice.mywebservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.mywebservice.mywebservice.database.DatabaseClass;
import com.practice.mywebservice.mywebservice.model.Message;
import com.practice.mywebservice.mywebservice.model.Profile;

public class MessageService {
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	static {
		messages.put(1L, new Message(1, "Hello World", "Stone Cold"));
		messages.put(2L, new Message(2, "Yo", "The Rock!"));
	}
	
	public MessageService() {		
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
