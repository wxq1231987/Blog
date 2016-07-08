package com.wxq.blog.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisUtil {
	public static SqlSessionFactory getFactory() throws IOException {
		String resource="conf.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		//构建sqlSession工厂
		SqlSessionFactory fac=new SqlSessionFactoryBuilder().build(reader);
		return fac;
	}
}
