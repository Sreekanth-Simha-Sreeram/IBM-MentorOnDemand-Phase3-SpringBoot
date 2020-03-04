package com.mentorOnDemandPhase3.mentorOnDemandPhase3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.dao.UserServiceDao;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.TrainingDetails;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;



@Component
@Service ("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceDao userServiceDao;
	@Transactional

	public boolean createProfile(User user) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Mentor viewMentor(int mentorId) {
		// TODO Auto-generated method stub
		return userServiceDao.viewMentor(mentorId);
	}

	@Transactional
	public List<Mentor> searchMentor(String technology) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Mentor selectMentor(int mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean sendProposal(int userId, int mentorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean assignRating(int rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<TrainingDetails> viewTrainings(String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
