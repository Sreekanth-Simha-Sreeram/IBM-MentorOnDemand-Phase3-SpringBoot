package com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;



@Component
public class LoginServiceDaoImpl implements LoginServiceDao {
	
//	private SessionFactory sessionFactory;

	public boolean signUp(User user) {
		return false;
		// TODO Auto-generated method stub
		
	}

	public boolean signIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
