package com.wxq.blog.testcase;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.wxq.blog.entity.User;
import com.wxq.blog.util.MybatisUtil;

public class TestUser {
	@Test
	public void testAdd() throws IOException {
		SqlSessionFactory factory=MybatisUtil.getFactory();
		SqlSession session=factory.openSession();
		String statement="com.wxq.blog.entity.userMapper.addUser";
		int insert=session.insert(statement, new User(-1,"wxq1231987","83f46m"));
		System.out.println(insert);
	}
}
