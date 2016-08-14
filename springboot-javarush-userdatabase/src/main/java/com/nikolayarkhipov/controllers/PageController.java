package com.nikolayarkhipov.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nikolayarkhipov.model.UserUpdate;
import com.nikolayarkhipov.service.UserUpdateService;

@Controller
public class PageController {
	

	@Autowired
	private UserUpdateService userUpdateService;
	
	
	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}
	
	
	@RequestMapping(value="/edituser", method=RequestMethod.GET)
	ModelAndView editStatus(ModelAndView modelAndView, @RequestParam(name="id") Integer id) {
		
		UserUpdate userUpdate = userUpdateService.get(id);
		
		modelAndView.getModel().put("userUpdate", userUpdate);
		
		modelAndView.setViewName("app.editUser");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edituser", method=RequestMethod.POST)
	ModelAndView editStatus(ModelAndView modelAndView, @Valid UserUpdate userUpdate, BindingResult result) {
		
		modelAndView.setViewName("app.editUser");
		
		if(!result.hasErrors()) {
			userUpdateService.save(userUpdate);
			modelAndView.setViewName("redirect:/viewusers");
		}
		
		return modelAndView;
	}

	
	
	@RequestMapping(value ="/deleteuser", method=RequestMethod.GET)
	ModelAndView deleteStatus(ModelAndView modelAndView, @RequestParam(name="id") Integer id) {
		
		userUpdateService.delete(id);
		
		modelAndView.setViewName("redirect:/viewusers");
		
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	ModelAndView search2(ModelAndView modelAndView, @ModelAttribute("userFound") UserUpdate userUpdate) {

		modelAndView.setViewName("app.searchUser");

		
		UserUpdate latestStatusUpdate = userUpdateService.getLatest();

		modelAndView.getModel().put("latestStatusUpdate", latestStatusUpdate);
		modelAndView.setViewName("app.searchUser");

		return modelAndView;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	ModelAndView search(ModelAndView modelAndView, @Valid @ModelAttribute("userFound") UserUpdate userUpdate) {

		modelAndView.setViewName("app.searchUser");
		
		List<UserUpdate> userFound = userUpdateService.findAll(userUpdate.getName());
		
		List<UserUpdate> users = new ArrayList<UserUpdate>();
		users.addAll(userFound);
		modelAndView.getModel().put("users", users);

		return modelAndView;
	}
	
	
	@RequestMapping(value = "/viewusers", method = RequestMethod.GET)
	ModelAndView viewStatus(ModelAndView modelAndView, @RequestParam(name = "p", defaultValue = "1") int pageNumber) {

		Page<UserUpdate> page = userUpdateService.getPage(pageNumber);

		modelAndView.getModel().put("page", page);

		modelAndView.setViewName("app.viewUsers");

		return modelAndView;
	}
	
	
	
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	ModelAndView addStatus(ModelAndView modelAndView) {

		modelAndView.setViewName("app.addUser");

		UserUpdate userUpdate = new UserUpdate();
		
		UserUpdate latestStatusUpdate = userUpdateService.getLatest();

		modelAndView.getModel().put("userUpdate", userUpdate);

		modelAndView.getModel().put("latestStatusUpdate", latestStatusUpdate);

		return modelAndView;
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	ModelAndView addStatus(ModelAndView modelAndView, @Valid UserUpdate userUpdate , BindingResult result) {

		modelAndView.setViewName("app.addUser");
		
		if (!result.hasErrors()) {

		userUpdateService.save(userUpdate);
		modelAndView.getModel().put("userUpdate", new UserUpdate());
		modelAndView.setViewName("redirect:/viewusers");
		}
		
		UserUpdate latestStatusUpdate = userUpdateService.getLatest();
		modelAndView.getModel().put("latestStatusUpdate", latestStatusUpdate);
		

		return modelAndView;
	}
}