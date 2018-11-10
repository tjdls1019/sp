package com.sp.sp.dao;

import java.util.List;

import com.sp.sp.vo.AwsTestVO;

public interface AwsTestDAO {

	public List<AwsTestVO> selectAwsTestList();
	public AwsTestVO selectAwsTest(int atnum);
	public Integer insertAwsTest(AwsTestVO aws);
	public Integer updattAwsTest(AwsTestVO aws);
	public Integer deleteAwsTest(int atnum);
}
