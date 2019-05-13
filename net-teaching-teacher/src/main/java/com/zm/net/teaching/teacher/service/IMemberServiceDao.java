package com.zm.net.teaching.teacher.service;

import java.util.List;


import com.zm.net.teaching.domain.Member;

public interface IMemberServiceDao {

	List<Member> allEntity(int pageNum, int pageSize, Member entity);

	int updEntity(Member entity);

}
