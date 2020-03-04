package com.mentorOnDemandPhase3.mentorOnDemandPhase3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.Mentor;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.model.User;
import com.mentorOnDemandPhase3.mentorOnDemandPhase3.service.UserService;


public class MentorController{
	
	
	@RequestMapping(value={"/viewProfile/{Id}"}, method = RequestMethod.POST)
    public Mentor ViewProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int Id) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/createMentorProfile/"}, method = RequestMethod.POST)
    public Mentor CerateProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody Mentor mentor) 
    {	
		return null;	
    }
	
	@RequestMapping(value={"/acceptUserApproval/"}, method = RequestMethod.GET)
    public boolean acceptApproval(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody User user) 
    {	
		return false;	
    }
	
}
