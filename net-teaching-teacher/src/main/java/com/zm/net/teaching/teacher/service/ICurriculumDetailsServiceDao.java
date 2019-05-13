package com.zm.net.teaching.teacher.service;

import java.util.List;


import com.zm.net.teaching.domain.CurriculumDetails;

public interface ICurriculumDetailsServiceDao extends BeanServiceDao<CurriculumDetails> {
	int addCurriculumDetails(CurriculumDetails details);

	List<CurriculumDetails> getByIdListDetails(Integer id);
}
