package com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.TrainingDetails;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;


@Component
public class UserServiceDaoImpl implements UserServiceDao {
//	private SessionFactory sessionFactory;

	public boolean createProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public Mentor viewMentor(int mentorId) {
		// TODO Auto-generated method stub
		Mentor mentor = new Mentor();
		mentor.setEmail("abc@gmail.com");
		mentor.setExperience(0);
		mentor.setFees(0);
		 
		return mentor;
	}

	public List<Mentor> searchMentor(String technology) {
		// TODO Auto-generated method stub
	
	 
		return null;
	}

	public Mentor selectMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean sendProposal(int userId, int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean assignRating(int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<TrainingDetails> viewTrainings(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
