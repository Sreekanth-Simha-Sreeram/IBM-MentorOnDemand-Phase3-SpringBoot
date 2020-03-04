package com.mentorOnDemandPhase3.mentorOnDemandPhase3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.service.UserService;

@RestController
public class UserController  {

	
	@RequestMapping(value = {"/searchMentor/{technology}"}, method = RequestMethod.POST)
    public List<Mentor> searchMentor(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable String technology) 
    {
		return null;	
    }
	
	
	
	@RequestMapping(value={"/mentoById/{Id}"}, method = RequestMethod.POST)
    public Mentor FindMentorByID(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int Id) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/createUserProfile/save"}, method = RequestMethod.POST)
    public boolean CreateProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody User user) 
    {	
		return false;	
    }
	
	
	
	
	@RequestMapping("/")
    public String getEmployees() 
    {
		return "Welcome to Mentor On Demand Spring Boot Application, Kindly start coding";
    }
}
