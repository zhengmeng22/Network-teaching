package com.zm.net.teaching.commons.mapper;

import java.util.List;

import com.zm.net.teaching.domain.CurriculumStytem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;


import tk.mybatis.mapper.common.Mapper;

public interface ICurriculumStytemDao extends Mapper<CurriculumStytem> {

	@Select("select * from Curriculum_Stytem where corriculum_stytem_total_id = #{id}")
	@Results({ @Result(id = true, column = "curriculum_system_id", property = "curriculumSystemId"),
			@Result(column = "curriculum_system_id", property = "setDeta", many = @Many(fetchType = FetchType.LAZY, select = "com.zm.net.teaching.commons.mapper.ICurriculumDetailsDao.getByIdListDetails")) })
	List<CurriculumStytem> getByIdListStytem(Integer id);

	@Delete("delete from Curriculum_Stytem where corriculum_stytem_total_id = #{id}")
	int delByIdStytem(Integer id);
}
