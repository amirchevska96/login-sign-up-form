package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getById(Integer key) {
		// TODO Auto-generated method stub
		return userRepo.findById(key).get();
	}

	@Override
	public void add(User entity) {
		// TODO Auto-generated method stub
		userRepo.save(entity);

	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		userRepo.deleteById(key);

	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		userRepo.save(entity);

	}

}
