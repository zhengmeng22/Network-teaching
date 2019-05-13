package com.zm.net.teaching.commons.mapper;

import java.util.List;

import com.zm.net.teaching.domain.CurriculumDetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;


import tk.mybatis.mapper.common.Mapper;

public interface ICurriculumDetailsDao extends Mapper<CurriculumDetails> {

	@Select("select * from Curriculum_Details where curriculum_details_stytem_id = #{id}")
	List<CurriculumDetails> getByIdListDetails(Integer id);

	@Delete("Delete from Curriculum_Details where curriculum_details_stytem_id = #{id}")
	int delByIdDetails(Integer id);

}
