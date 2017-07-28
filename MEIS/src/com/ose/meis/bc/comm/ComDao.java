package com.ose.meis.bc.comm;

import javax.annotation.Resource;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.mybatis.spring.SqlSessionTemplate;

public class ComDao extends SqlSessionDaoSupport {
	@Resource(name = "meisResource")
	public void setSqlSession(SqlSessionTemplate SqlSessionTemplate) {
		super.setSqlSessionTemplate(SqlSessionTemplate);
	}
}
