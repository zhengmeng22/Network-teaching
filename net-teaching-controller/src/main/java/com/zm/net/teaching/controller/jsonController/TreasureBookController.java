package com.zm.net.teaching.controller.jsonController;

import java.util.List;
import java.util.Map;

import com.zm.net.teaching.domain.Labels;
import com.zm.net.teaching.domain.TreasureBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zm.net.teaching.admin.service.impl.TreasureBookService;

@Controller
public class TreasureBookController {
	@Autowired
	private TreasureBookService service;

	@RequestMapping("tbookinfo")
	@ResponseBody
	public List<Map<String, Object>> getinfo(TreasureBook tb) {
		List<Map<String, Object>> tbooks = service.getinfo(tb);
		return tbooks;
	}

	@RequestMapping("Treasureinfos")
	public String info() {
		return "Treasure";
	}

	@RequestMapping("addinfos")
	public String addinfo(Model model) {
		List<Labels> label = service.getlabel();
		model.addAttribute("label", label);
		return "addtreasure";
	}

	@RequestMapping("addtreasure")
	public String addtreasure(TreasureBook tb) {

		int count = service.addtreasurebook(tb);
		if (count > 0) {
			return "Treasure";
		}
		return "null";
	}

	@RequestMapping("deltreasure")
	@ResponseBody
	public String deltreasure(Integer id) {
		int count = service.deltreasurebook(id);
		if (count > 0) {
			return "1";
		} else {
			return "0";
		}
	}
}
