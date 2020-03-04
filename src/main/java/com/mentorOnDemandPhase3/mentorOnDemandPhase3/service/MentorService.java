package com.mentorOnDemandPhase3.mentorOnDemandPhase3.service;

import java.util.List;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;



public interface MentorService {
	boolean createProfile(Mentor mentor);
	Mentor viewMyProfile(int mentorId);
	boolean updateProfile(int mentorId);
	Mentor deactivateProfile(int mentorId);
	public void viewProposal();
    boolean acceptProposal(User user);

}
