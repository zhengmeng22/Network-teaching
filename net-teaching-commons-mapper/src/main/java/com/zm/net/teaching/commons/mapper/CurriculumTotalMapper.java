package com.zm.net.teaching.commons.mapper;

import com.zm.net.teaching.domain.CurriculumTotal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface CurriculumTotalMapper extends MyMapper<CurriculumTotal> {
    @Select("select * from curriculum_total c left join user_login u on c.curriculum_user_id = u.user_login_id LEFT JOIN user us on u.user_login_id = us.user_login_id where curriculum_id = #{curriculumId}")
    List<Map<String,Object>> getOnes(CurriculumTotal curriculumTotal);
}