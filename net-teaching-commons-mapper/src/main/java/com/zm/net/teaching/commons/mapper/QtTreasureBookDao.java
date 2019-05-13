package com.zm.net.teaching.commons.mapper;

import java.util.List;
import java.util.Map;


import com.zm.net.teaching.domain.TreasureBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QtTreasureBookDao {
	public List<Map<String, Object>> getinfo(TreasureBook tb);

	public TreasureBook getinfobyid(Integer bookid);

	public int updtreabook(TreasureBook tb);

}
