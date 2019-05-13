package com.zm.net.teaching.teacher.service.impl;

import java.util.List;

import com.zm.net.teaching.commons.mapper.ICurriculumTotalDao;
import com.zm.net.teaching.domain.CurriculumTotal;
import com.zm.net.teaching.domain.UserLogin;
import com.zm.net.teaching.teacher.service.ICurriculumTotalServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class CurriculumTotalServiceImpl implements ICurriculumTotalServiceDao {

	@Autowired
	private ICurriculumTotalDao totalDao;

	@Override
	public List<CurriculumTotal> allEntity(int pageNum, int pageSize, CurriculumTotal entity) {
		if (entity == null) {
			Page<CurriculumTotal> page = PageHelper.startPage(pageNum, pageSize)
					.doSelectPage(() -> totalDao.selectAll());
			return page;
		}
		Page<CurriculumTotal> page = PageHelper.startPage(pageNum, pageSize)
				.doSelectPage(() -> totalDao.select(entity));
		return page;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addCurriculumTotal(CurriculumTotal curr) {
		int insert = totalDao.insert(curr);
		return insert;
	}

	@Override
	public CurriculumTotal getInfoByBean(CurriculumTotal curr) {

//		List<CurriculumTotal> select = totalDao.select(curr);
//		System.out.println(totalDao.selectOne(curr));

		// System.out.println(totalDao.selectOne(curr).getClass().getName());
		// CurriculumTotal selectOne = totalDao.selectOne(curr);
		return totalDao.selectOne(curr);
	}

	@Override
	public List<CurriculumTotal> getByUserIdList(UserLogin user) {
		return totalDao.getByUserIdList(user.getUserLoginId());
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int updEntity(CurriculumTotal entity) {
		return totalDao.updateByPrimaryKeySelective(entity);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int delEntity(Integer id) {
		return totalDao.delByIdTotal(id);
	}

	@Override
	public List<CurriculumTotal> getById(CurriculumTotal curr) {
		return totalDao.getCurr(curr);
	}

}
