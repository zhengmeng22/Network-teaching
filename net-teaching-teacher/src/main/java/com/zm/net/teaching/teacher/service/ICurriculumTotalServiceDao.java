package com.zm.net.teaching.teacher.service;

import com.zm.net.teaching.domain.CurriculumTotal;
import com.zm.net.teaching.domain.UserLogin;

import java.util.List;



public interface ICurriculumTotalServiceDao extends BeanServiceDao<CurriculumTotal> {
	int addCurriculumTotal(CurriculumTotal curr);

	CurriculumTotal getInfoByBean(CurriculumTotal curr);

	List<CurriculumTotal> getByUserIdList(UserLogin user);

	List<CurriculumTotal> getById(CurriculumTotal curr);

}
