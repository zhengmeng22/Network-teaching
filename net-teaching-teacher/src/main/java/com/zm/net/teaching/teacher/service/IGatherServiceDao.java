package com.zm.net.teaching.teacher.service;



import com.zm.net.teaching.domain.CurriculumTotal;




/**
 * 主要负责涉及到多个service进行同时操作
 * 
 * @author Administrator
 *
 */

public interface IGatherServiceDao {

	int addCourse(CurriculumTotal total);

	int delCourse(CurriculumTotal total);

	boolean updCourse(CurriculumTotal total);

}
