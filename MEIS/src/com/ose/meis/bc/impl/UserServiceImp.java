package com.ose.meis.bc.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ose.meis.bc.usr.User;
import com.ose.meis.bc.usr.UserDao;
import com.ose.meis.bc.usr.UserService;
import org.springframework.transaction.support.TransactionTemplate;

@Service(value="UserService")
public class UserServiceImp implements UserService  {
	@Autowired
	private UserDao usrDao;
	
	//@Autowired
	//private TransactionTemplate tr;
	
	@Override
	public User getUserInfo(String id, String pw) {
		return usrDao.getUserInfo(id, pw);
	}
}
