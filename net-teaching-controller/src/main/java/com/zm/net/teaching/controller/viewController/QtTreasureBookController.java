package com.zm.net.teaching.controller.viewController;

import java.util.List;
import java.util.Map;

import com.zm.net.teaching.domain.Labels;
import com.zm.net.teaching.domain.TreasureBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.net.teaching.admin.service.impl.QtTreasureBookService;
import com.zm.net.teaching.admin.service.impl.TreasureBookService;


@Controller
public class QtTreasureBookController {
	@Autowired
	private QtTreasureBookService service;
	@Autowired
	private TreasureBookService htservice;

	@RequestMapping("qtTreasureBookinfos")
	public String getinfo(Model model, TreasureBook tb) {
		List<Labels> labels = htservice.getlabel();
		model.addAttribute("labels", labels);
		List<Map<String, Object>> books = service.getinfo(tb);
		model.addAttribute("books", books);
		return "luntan";
	}

	@RequestMapping("qtTreasureBookbyid")
	public String getinfobyid(Integer bookid, Model model) {
		TreasureBook book = service.getinfobyid(bookid);
		model.addAttribute("book", book);
		return "luntandetails";
	}
}
