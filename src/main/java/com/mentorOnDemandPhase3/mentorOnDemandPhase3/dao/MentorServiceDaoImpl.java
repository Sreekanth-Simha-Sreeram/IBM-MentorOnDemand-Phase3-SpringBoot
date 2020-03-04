package com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Component
public class MentorServiceDaoImpl implements MentorServiceDao {
	
	public com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor createProfile(
			com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor mentor) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor viewMyProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	public com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor deactivateProfile(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void viewProposal() {
		// TODO Auto-generated method stub
		
	}

	public boolean acceptProposal(com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
