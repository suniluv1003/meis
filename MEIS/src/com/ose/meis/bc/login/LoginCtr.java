package com.ose.meis.bc.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import javax.servlet.http.Cookie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.ose.meis.bc.usr.User;
import com.ose.meis.bc.usr.UserService;
import com.ose.meis.bc.com.*;

@Controller
public class LoginCtr extends com.ose.meis.bc.comm.ComCtr {
	@Autowired
	private UserService us;

	@RequestMapping(value = "/login/doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "userId", required = true) String userId,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "isSaveUser", required = false, defaultValue = "false") Boolean isSaveUser) {
		ModelAndView mav = new ModelAndView("jsonView");
		ResObj<User> res = new ResObj<User>();
		String rdir=request.getContextPath() + "/main.mf";
		User usr = us.getUserInfo(userId, password);
		_Block001: {
			if (usr == null) {
				res.setSurc("false");
				res.setErr(Message.e011);
				break _Block001;
			}
			res.setRes(usr);
			res.setSurc("true");;
			res.setErr("Succ");
			mav.addObject("usr",usr);
			mav.addObject("Results",res);
			mav.addObject("rdir",rdir);
			session.setAttribute("mfUSR",usr);
		}
		return mav;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView loginView(HttpSession session)
	{
		ModelAndView mnv = new ModelAndView("/main/index");			
		return mnv;
	}
}
