package com.zm.net.teaching.user.service;

import com.zm.net.teaching.commons.mapper.CurriculumTotalMapper;
import com.zm.net.teaching.domain.CurriculumTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CurriculumService {
    @Autowired
    private CurriculumTotalMapper curriculumTotalMapper;

    public List<CurriculumTotal> selectAll(){
        List<CurriculumTotal> curriculumTotals = curriculumTotalMapper.selectAll();
        return curriculumTotals;
    }

    public List<Map<String,Object>> getOnes(CurriculumTotal curriculumTotal){
        List<Map<String, Object>> one = curriculumTotalMapper.getOnes(curriculumTotal);
        return one;
    }
}
