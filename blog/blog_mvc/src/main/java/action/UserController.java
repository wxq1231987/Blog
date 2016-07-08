package com.wxq.blog.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxq.blog.entity.User;
import com.wxq.blog.service.UserService;

@Controller
@RequestMapping("/user.do")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping(params="method=reg")
	public String reg(User user) {
		return "login";
	}
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}
	
}
