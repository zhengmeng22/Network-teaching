package com.zm.net.teaching.user.service;

import com.zm.net.teaching.commons.mapper.CurriculumTypeMapper;
import com.zm.net.teaching.domain.CurriculumType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CurrTypeService {
    @Autowired
    private CurriculumTypeMapper curriculumTypeMapper;

    public List<CurriculumType> selectAll(){
        List<CurriculumType> curriculumTypes = curriculumTypeMapper.selectAll();
        return curriculumTypes;
    }
}
