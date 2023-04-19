//package springmvcdemo;
//
//import java.io.IOException;
//import java.lang.ProcessBuilder.Redirect;
//import java.net.http.HttpRequest;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController {
//	MyName mn = new MyName();
//	@RequestMapping("/")
//	public String test(HttpServletRequest req, HttpServletResponse res){
//		System.out.println("From Test Function....");	
//		mn.name = req.getParameter("namebox");
//		System.out.println("Name received==="+mn.name);
//		if(mn.name==null) {
//			return "index";
//		}
//		else {
//			try {
//				res.sendRedirect("out");
//			}catch(Exception e) {System.out.println(e);}
//			
//			return "out";
//		}
//		
//	}
//	@RequestMapping("/out")
//	public ModelAndView testOut() {
//		System.out.println("From output Function....");	
//		System.out.println("Output function==="+mn.name);
//		ModelAndView mymodel = new ModelAndView();
//		mymodel.setViewName("out");
//		mymodel.addObject("LabelOut", mn.name);
//		return mymodel;	
//	}
//}
//class MyName{
//	String name;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//}
///*
//520
//518
//372
//377
//390
//362
//357
//457
//383
//392
//360
//550
//572
//566
//410
//473
//420
//493
//512
//559
//305
//391
//342
//332
//343
//309
//584
//494
//411
//586
//459
//492
//170
//515
//487
//525
//504
//*/
//
//
//
