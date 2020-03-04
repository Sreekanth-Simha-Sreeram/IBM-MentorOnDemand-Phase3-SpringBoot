package com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;

public interface LoginServiceDao {

	 public boolean signUp(User user);
     public boolean signIn(String username,String password);

  
}
