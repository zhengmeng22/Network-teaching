package com.zm.net.teaching.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.zm.net.teaching.commons.mapper.QtTreasureBookDao;
import com.zm.net.teaching.domain.TreasureBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class QtTreasureBookService {
	@Autowired
	private QtTreasureBookDao qtTreasureBookDao;

	public List<Map<String, Object>> getinfo(TreasureBook tb) {
		return qtTreasureBookDao.getinfo(tb);
	}

	public TreasureBook getinfobyid(Integer bookid) {
		return qtTreasureBookDao.getinfobyid(bookid);
	}

	public int updtreabook(TreasureBook tb) {
		return qtTreasureBookDao.updtreabook(tb);
	}
}
