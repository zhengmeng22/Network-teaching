package com.zm.net.teaching.commons.mapper;



import com.zm.net.teaching.domain.CurriculumType;
import tk.mybatis.mapper.common.Mapper;

/**
 * 课程类型表
 * 
 * @author Administrator
 *
 */

public interface ICurriculumTypeDao extends Mapper<CurriculumType> {
	// 需要有一个查询直接查询全部这里使用mapper通用接口进行查询
}
