package com.zm.net.teaching.controller.jsonController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.zm.net.teaching.domain.CurriculumTotal;
import com.zm.net.teaching.domain.UserLogin;
import com.zm.net.teaching.teacher.service.ICurriculumTotalServiceDao;
import com.zm.net.teaching.teacher.service.IGatherServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class JsonCurriculumTotalController {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonCurriculumTotalController.class);
	@Autowired
	private IGatherServiceDao gathService;

	@Autowired
	private ICurriculumTotalServiceDao currService;

	@PostMapping("/sts")
	private String getInfo(@RequestParam("file") MultipartFile file, CurriculumTotal curr, HttpSession session)
			throws FileNotFoundException {
		if (file.isEmpty()) {
			return "请选择上传的图片";
		}
		String fileName = file.getOriginalFilename();
		String sname = fileName.substring(fileName.lastIndexOf("."));
		File path = new File(ResourceUtils.getURL("classpath").getPath());
		if (!path.exists())
			path = new File("");
		System.out.println("path:" + path.getAbsolutePath());
		File upload = new File(path.getAbsolutePath(), "net-teaching-controller/src/main/resources/static/images/upload/curriculum");
		if (!upload.exists())
			upload.mkdirs();
		Date date = new Date();
		long time = date.getTime();
		File dest = new File(upload.getAbsolutePath() + "\\" + time + sname);

		try {
			curr.setCurriculumImg(time + sname);
			curr.setCurriculumBrowse(0);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			curr.setCurriculumTime(sdf.format(new Date()));
			UserLogin user = (UserLogin) session.getAttribute("admin");
			curr.setCurriculumUserId(user.getUserLoginId());
			int addCourse = gathService.addCourse(curr);
			if (addCourse > 0) {
				file.transferTo(dest);
				LOGGER.info("上传成功");
				return "redirect:userCurr";
			}
		} catch (IOException e) {
			LOGGER.error(e.toString(), e);
		}
		return "0";

	}

	@GetMapping("user")
	public List<CurriculumTotal> getTotal() {
		CurriculumTotal curr = new CurriculumTotal();
		curr.setCurriculumUserId(1);
		List<CurriculumTotal> byId = currService.getById(curr);
		return byId;
	}

}
