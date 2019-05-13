package com.zm.net.teaching.teacher.service.impl;

import java.util.List;

import com.zm.net.teaching.commons.mapper.ICurriculumTypeDao;
import com.zm.net.teaching.domain.CurriculumType;
import com.zm.net.teaching.teacher.service.ICurriculumTypeServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CurriculumTypeServiceImpl implements ICurriculumTypeServiceDao {

	@Autowired
	private ICurriculumTypeDao icuDao;

	@Override
	public List<CurriculumType> allEntity(CurriculumType entity) {
		if (entity == null) {
			return icuDao.selectAll();
		}
		return icuDao.select(entity);
	}

	@Override
	public int updEntity(CurriculumType entity) {
		return 0;
	}

}
