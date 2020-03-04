package com.mentorOnDemandPhase3.mentorOnDemandPhase3.service;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;

public interface LoginService {
	
	 public boolean signUp(User user);
     public boolean signIn(String username,String password);

}
