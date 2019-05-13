package com.zm.net.teaching.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.zm.net.teaching.commons.mapper.HtTreasureBook;
import com.zm.net.teaching.domain.Labels;
import com.zm.net.teaching.domain.TreasureBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TreasureBookService {
	@Autowired
	private HtTreasureBook dao;

	public int addtreasurebook(TreasureBook tb) {

		return dao.insertSelective(tb);
	}

	public List<Map<String, Object>> getinfo(TreasureBook tb) {
		return dao.getinfo(tb);
	}

	public int deltreasurebook(int id) {
		return dao.deltreasurebook(id);
	}

	public List<Labels> getlabel() {
		return dao.getlabel();
	}
}
