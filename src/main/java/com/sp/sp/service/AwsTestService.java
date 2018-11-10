package com.sp.sp.service;

import java.util.List;

import com.sp.sp.vo.AwsTestVO;

public interface AwsTestService {

	public List<AwsTestVO> selectAwsTestList();
	public AwsTestVO selectAwsTest(int atnum);
	public Integer insertAwsTest(AwsTestVO aws);
	public Integer updattAwsTest(AwsTestVO aws);
	public Integer deleteAwsTest(int atnum);
}
