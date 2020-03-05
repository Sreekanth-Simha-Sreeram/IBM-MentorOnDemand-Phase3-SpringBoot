package com.mentorOnDemandPhase3.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.service.MentorService;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.service.UserService;

public class Exception {
	 @Test
	    public void testEmptyPasswordException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
	         
	        User user = new User();
	    	user.setUserId(1);
			user.setUserName("meghana");
			user.setPassword(null);
			user.setFirstName("meghana12");	
			user.setLastName("meghana12");
			user.setContactNumber(1234567889);
			user.setRole("user");
			user.setLinkedinURL("meghana12@234");
			user.setExperience(1);
			user.setActive(true);
			user.setConfirmedSignUp(true);
			user.setResetPassword(true);
			
	           UserService userservice = (UserService) context.getBean("userService");
	           //userservice.login(user.getUserName(), user.getUserPassword());
	           Assert.assertEquals("1234",user.getPassword(),"password empty exception");
	    }
	 
	 @Test
	    public void testMentorNotFoundException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mentor-application.xml");
	           
	        Mentor mentor=new Mentor();
			
			mentor.setMentorId(16);
			mentor.setEmail(null);
			mentor.setExperience(5);
			mentor.setFacilities("FSA Complete Notes");
			mentor.setFees(10000);
			mentor.setTechnology("NET");
			mentor.setWorkHours(9);
			MentorService mentorservice=(MentorService) context.getBean("mentorService");
	           Mentor mentordata=mentorservice.viewMyProfile(mentor.getMentorId());
	           //userservice.login(user.getUserName(), user.getUserPassword());
	           Assert.assertNull(mentordata);
	          
	    }
	 


}
