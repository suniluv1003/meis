package com.ose.meis.bc.usr;

import org.springframework.transaction.annotation.Transactional;
import com.ose.meis.bc.usr.User;

@Transactional
public interface UserService {
	User getUserInfo(String id, String pw);
}
