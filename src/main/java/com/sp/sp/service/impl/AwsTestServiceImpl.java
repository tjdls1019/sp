package com.sp.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.sp.dao.AwsTestDAO;
import com.sp.sp.service.AwsTestService;
import com.sp.sp.vo.AwsTestVO;

@Service
public class AwsTestServiceImpl implements AwsTestService {

	@Autowired
	private AwsTestDAO atdao;
	
	@Override
	public List<AwsTestVO> selectAwsTestList() {
		return atdao.selectAwsTestList();
	}

	@Override
	public AwsTestVO selectAwsTest(int atnum) {
		return atdao.selectAwsTest(atnum);
	}

	@Override
	public Integer insertAwsTest(AwsTestVO aws) {
		return atdao.insertAwsTest(aws);
	}

	@Override
	public Integer updattAwsTest(AwsTestVO aws) {
		return atdao.updattAwsTest(aws);
	}

	@Override
	public Integer deleteAwsTest(int atnum) {
		return atdao.deleteAwsTest(atnum);
	}

}
