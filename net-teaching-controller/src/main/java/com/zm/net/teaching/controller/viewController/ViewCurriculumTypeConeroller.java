package com.zm.net.teaching.controller.viewController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zm.net.teaching.domain.CurriculumTotal;
import com.zm.net.teaching.domain.CurriculumType;
import com.zm.net.teaching.domain.UserLogin;
import com.zm.net.teaching.teacher.service.ICurriculumTotalServiceDao;
import com.zm.net.teaching.teacher.service.ICurriculumTypeServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewCurriculumTypeConeroller {

	@Autowired
	private ICurriculumTypeServiceDao typeService;

	@Autowired
	private ICurriculumTotalServiceDao currService;

	@RequestMapping("/info")
	public String getInfo(HttpServletRequest res) {
		List<CurriculumType> selectAll = typeService.allEntity(null);
		res.setAttribute("types", selectAll);
		return "addCurriculum";
	}

	@GetMapping("/userCurr")
	public String currs(HttpServletRequest res) {
		CurriculumTotal curr = new CurriculumTotal();
		UserLogin user = (UserLogin) res.getSession().getAttribute("admin");
		curr.setCurriculumUserId(user.getUserLoginId());
		List<CurriculumTotal> byId = currService.getById(curr);
		res.setAttribute("curr", byId);
		List<CurriculumType> selectAll = typeService.allEntity(null);
		res.setAttribute("types", selectAll);
		return "managementcourse";
	}






	@GetMapping("us")
	public String us() {

		return "PersonalCenter";
	}

}
