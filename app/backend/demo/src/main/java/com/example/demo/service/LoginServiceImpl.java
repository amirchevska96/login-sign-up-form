package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepo;

//	List<Login> logins = new ArrayList<>(Arrays.asList());

	@Override
	public List<Login> getAll() {
//		loginRepo.findAll().forEach(logins::add);

		return loginRepo.findAll();
	}

	@Override
	public Login getById(Integer key) {
		return loginRepo.findById(key).get();
	}

	@Override
	public void add(Login entity) {
		loginRepo.save(entity);
	}

	@Override
	public void delete(Integer key) {
		loginRepo.deleteById(key);
	}

	@Override
	public void update(Login entity) {
		loginRepo.save(entity);
	}

}
