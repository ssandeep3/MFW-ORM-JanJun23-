package springmvcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class modelattr {
	student s=new student();
	@RequestMapping("/")
	String firstPage() {
		return "firstjsp";
	}
	@RequestMapping("inputform")
	String readform(@ModelAttribute("Student") student s1) {
		s.name = s1.name;
		s.branch = s1.branch;
		System.out.println("====>>>"+s1.name);
		return ("inputform");
	}
//	student s1 = new student();
	
	@RequestMapping("/display")
	String displayOut(Model model, HttpServletRequest req) {
		System.out.println(s.name);
		model.addAttribute("Values", s.name);
		
		return "display";
	}
}
class student{
	String name;
	String branch;
}

