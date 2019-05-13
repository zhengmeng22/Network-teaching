package com.zm.net.teaching.teacher.service.impl;

import java.util.List;

import com.zm.net.teaching.commons.mapper.IMemberDao;
import com.zm.net.teaching.domain.Member;
import com.zm.net.teaching.teacher.service.IMemberServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements IMemberServiceDao {

	@Autowired
	private IMemberDao imeDao;

	@Override
	public List<Member> allEntity(int pageNum, int pageSize, Member entity) {
		if (entity == null) {
			return imeDao.selectAll();
		}
		return imeDao.select(entity);
	}

	@Override
	public int updEntity(Member entity) {
		return 0;
	}

}
