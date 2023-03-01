package springmvcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller {
	student s1 = new student();
	mycontroller(){
		System.out.println("Constructor...");
	}
	@RequestMapping("/")
	public String myFunction(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Request Receivd...");
		s1.name = req.getParameter("t1");
		s1.branch = req.getParameter("t2");
		System.out.println(s1.name + " "+ s1.branch);
		
		if(s1.name == null) {
			return "firstjsp";
		}
		else {
			try {
				res.sendRedirect("display");
			}catch(Exception e) {System.out.println(e);}
			return "display";
		} 
	}
	
	@RequestMapping("/display")
	public ModelAndView displayvalue() {
		ModelAndView m = new ModelAndView();
		m.addObject("myobj",s1.name);
		m.setViewName("display");
		
		return m;
	}
}

class student{
	String name;
	String branch;
}

/*
 
1Mar(L)
393
361
376
377
357
457
360
392
372
510
572
473
420
332
342
346
410
391
424
170
520
518
492
525
459
487
415
414
*/