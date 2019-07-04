package com.zte.controller.system;


import com.zte.constant.PageCodeEnum;
import com.zte.constant.SessionKeyConst;
import com.zte.dto.UserDto;
import com.zte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * 登录相关
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	/**
	 * 登录页面
	 */
	@RequestMapping
	public String index() {
		return "/system/login";
	}
	/**
	 * session超时
	 */
	@RequestMapping("/sessionTimeout")
	public String sessionTimeout(RedirectAttributes attr){
		attr.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.SESSION_TIMEOUT);
		return "redirect:/login";
	}
	/**
	 * 验证用户名/密码是否正确 验证通过跳转至后台管理首页，验证失败，返回至登录页。
	 */
	@RequestMapping("/validate")
	public String validate(UserDto userDto, RedirectAttributes attr,HttpSession session) {
		if (userService.validate(userDto)) {
			session.setAttribute(SessionKeyConst.USER_INFO,userDto);
			return "redirect:/index";
		}
		attr.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.LOGIN_FAIL);
		return "redirect:/login";
	}
}