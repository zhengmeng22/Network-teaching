package com.zm.net.teaching.teacher.service;

import java.util.List;


import com.zm.net.teaching.domain.CurriculumStytem;

public interface ICurriculumStytemServiceDao extends BeanServiceDao<CurriculumStytem> {

	int addCurriculumStytem(CurriculumStytem stylem);

	CurriculumStytem getInfoByBean(CurriculumStytem stylem);

	List<CurriculumStytem> getByIdListStytem(Integer id);
}
