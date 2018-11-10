package com.test.sp;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisTest {
	@Autowired
	private SqlSession ss;
	
	@Test
	public void ssTest() {
		assertEquals(3, ss.selectList("com.test.sp.TTINFO.selectTTINFOList").size());
	}
	
	@Test
	public void ssTestone() {
		assertEquals(1, ss.selectOne("com.test.sp.TTINFO.selectTTINFO",1));
	}
}
