package springmvcdemo;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class anncontroller {
	student s1;
	anncontroller() {
		System.out.println("From anncontroller constructor..");
	}
	@RequestMapping("/")
	String annTest() {
		System.out.println("from anncontroller test func...");
		
		return "firstjsp";
	}
	@RequestMapping("/display")
	String formread(@RequestParam("t1")String nm, @RequestParam("t2")String br, Model m) {
		System.out.println(nm+" "+br);
		s1 = new student();
		s1.name = nm;
		s1.branch = br;
		 
		m.addAttribute("msg",s1.name + " " + s1.branch);
		return "display";
	}
}

