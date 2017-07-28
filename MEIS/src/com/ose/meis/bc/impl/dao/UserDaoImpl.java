package com.ose.meis.bc.impl.dao;

import org.springframework.stereotype.Repository;
import com.ose.meis.bc.usr.User;
import com.ose.meis.bc.usr.UserDao;
import com.ose.meis.bc.usr.UserSearch;
import com.ose.meis.bc.comm.ComDao;

@Repository(value="userDao")
public class UserDaoImpl extends ComDao implements UserDao{
	@Override
	public User getUserInfo(String id, String pw) {
		try {
			UserSearch us=new UserSearch();
			us.setId(id); us.setPw(pw); 
			return super.getSqlSession().selectOne("user.getUsrInfo",us);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
