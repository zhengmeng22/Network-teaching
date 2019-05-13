package com.zm.net.teaching.teacher.service.impl;

import java.util.List;

import com.zm.net.teaching.commons.mapper.ICurriculumStytemDao;
import com.zm.net.teaching.domain.CurriculumStytem;
import com.zm.net.teaching.teacher.service.ICurriculumStytemServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class CurriculumStytemServiceImpl implements ICurriculumStytemServiceDao {

	@Autowired
	private ICurriculumStytemDao styDao;

	@Override
	public List<CurriculumStytem> allEntity(int pageNum, int pageSize, CurriculumStytem entity) {

		if (entity == null) {
			Page<CurriculumStytem> page = PageHelper.startPage(pageNum, pageSize)
					.doSelectPage(() -> styDao.selectAll());
			return page;
		}
		Page<CurriculumStytem> page = PageHelper.startPage(pageNum, pageSize).doSelectPage(() -> styDao.select(entity));
		return page;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addCurriculumStytem(CurriculumStytem stylem) {
		return styDao.insert(stylem);
	}

	@Override
	public CurriculumStytem getInfoByBean(CurriculumStytem stylem) {
		return styDao.selectOne(stylem);
	}

	@Override
	public List<CurriculumStytem> getByIdListStytem(Integer id) {
		return styDao.getByIdListStytem(id);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int updEntity(CurriculumStytem entity) {
		return styDao.updateByPrimaryKeySelective(entity);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int delEntity(Integer id) {
		return styDao.delByIdStytem(id);
	}

}
