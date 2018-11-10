package com.sp.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sp.sp.dao.AwsTestDAO;
import com.sp.sp.vo.AwsTestVO;

@Repository
public class AwsTestDAOImpl implements AwsTestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AwsTestVO> selectAwsTestList() {
		return ss.selectList("com.sp.sp.AWS_TEST.selectAWSTESTList");
	}

	@Override
	public AwsTestVO selectAwsTest(int atnum) {
		return ss.selectOne("com.sp.sp.AWS_TEST.selectAWSTEST", atnum);
	}

	@Override
	public Integer insertAwsTest(AwsTestVO aws) {
		return ss.insert("com.sp.sp.AWS_TEST.insertAWSTEST",aws);
	}

	@Override
	public Integer updattAwsTest(AwsTestVO aws) {
		return ss.update("com.sp.sp.AWS_TEST.updateAWSTEST",aws);
	}

	@Override
	public Integer deleteAwsTest(int atnum) {
		return ss.delete("com.sp.sp.AWS_TEST.deleteAWSTEST",atnum);
	}

}
