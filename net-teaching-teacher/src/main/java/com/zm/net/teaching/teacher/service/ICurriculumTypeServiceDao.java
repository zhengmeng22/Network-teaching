package com.zm.net.teaching.teacher.service;

import com.zm.net.teaching.domain.CurriculumType;

import java.util.List;



public interface ICurriculumTypeServiceDao {

	int updEntity(CurriculumType entity);

	List<CurriculumType> allEntity(CurriculumType entity);

}
