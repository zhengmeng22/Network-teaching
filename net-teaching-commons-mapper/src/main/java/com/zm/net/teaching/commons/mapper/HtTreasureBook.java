package com.zm.net.teaching.commons.mapper;

import java.util.List;
import java.util.Map;


import com.zm.net.teaching.domain.Labels;

import com.zm.net.teaching.domain.TreasureBook;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface HtTreasureBook extends Mapper<TreasureBook> {
	 int deltreasurebook(Integer id);

	 List<Map<String, Object>> getinfo(TreasureBook tb);

	 List<Labels> getlabel();
}
