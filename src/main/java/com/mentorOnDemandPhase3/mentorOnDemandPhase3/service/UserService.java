package com.mentorOnDemandPhase3.mentorOnDemandPhase3.service;


import java.util.List;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.TrainingDetails;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;

public interface UserService {
	
	 public boolean createProfile (User user);
	 Mentor viewMentor (int mentorId);
	 List<Mentor> searchMentor(String technology);
	 Mentor selectMentor(int mentorId);
     boolean sendProposal(int userId,int mentorId);
     boolean assignRating(int rating);
     List<TrainingDetails> viewTrainings(String status);

}
