package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sp.sp.dao.AwsTestDAO;
import com.sp.sp.service.AwsTestService;

import lombok.extern.slf4j.Slf4j;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Slf4j
//public class DBTest {
////
////	@Autowired
////	private AwsTestService ats;
////	
////	@Test
////	public void test() throws SQLException {
////		assertEquals(1, ats.selectAwsTestList().size());
////	}
//
//}
