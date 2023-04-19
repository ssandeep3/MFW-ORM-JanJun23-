package dbproject.springmvcjdbc.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@Autowired
	private studentDaoImp studentdaoimp;// = new studentDaoImp(); 

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	} 
	@RequestMapping(value="/processForm")
	public void processForm(HttpServletRequest req) {
		student s = new student();
		s.uname = req.getParameter("uname");
		s.pwd = req.getParameter("pwd");
		System.out.println(s);
		studentdaoimp.insertData(s);
	}
	@RequestMapping("/show")
	public  String showTable(Model model){
		List<Map<String,Object>> students1= studentdaoimp.displayData();
		model.addAttribute("students",students1);
		return "showTable"; 
	}
}
