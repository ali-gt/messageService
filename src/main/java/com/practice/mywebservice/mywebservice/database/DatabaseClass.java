package com.practice.mywebservice.mywebservice.database;

import java.util.HashMap;
import java.util.Map;
import com.practice.mywebservice.mywebservice.model.Message;
import com.practice.mywebservice.mywebservice.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
