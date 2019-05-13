package com.zm.net.teaching.controller.viewController;

import com.zm.net.teaching.domain.CurriculumTotal;
import com.zm.net.teaching.user.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class CurriculumController {

    @Autowired
    private CurriculumService curriculumService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
        List<CurriculumTotal> curriculumTotals = curriculumService.selectAll();
        model.addAttribute("curr",curriculumTotals);
        return "home";
    }



    @RequestMapping(value = "curr", method = RequestMethod.GET)
    public String curriculum(Model model){
        List<CurriculumTotal> curriculumTotals = curriculumService.selectAll();
        model.addAttribute("curr",curriculumTotals);
        return "curriculum";
    }

    @RequestMapping(value = "culum", method = RequestMethod.GET)
    public String selectOne(CurriculumTotal curriculumTotal,Model model){
        List<Map<String, Object>> maps = curriculumService.getOnes(curriculumTotal);
        model.addAttribute("culum",maps);
        return "coursedetails";
    }
}
