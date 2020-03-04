package com.mentorOnDemandPhase3.mentorOnDemandPhase3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao.LoginServiceDao;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;

@Component
@Service ("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginServiceDao loginServiceDao;
	@Transactional
	public boolean signUp(User user) {
		return false;
		// TODO Auto-generated method stub

	}
	@Transactional
	public boolean signIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
