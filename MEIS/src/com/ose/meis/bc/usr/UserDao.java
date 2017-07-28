package com.ose.meis.bc.usr;
import com.ose.meis.bc.usr.User;

public interface UserDao {
	User getUserInfo(String id, String pw);
}
