package com.ubaidsample.SBMongoDBRESTAPI.service;

import java.util.List;

import com.ubaidsample.SBMongoDBRESTAPI.model.User;

public interface UserService {
	public void createUser(User user);
	public List<User> getUser();
	public User findById(String id);
	public User update(User user, String l);
	public void deleteUserById(String id);
	public User updatePartially(User user, String id);
}
