package mypkg.egmodelattr.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class sessionmang {
//	@RequestMapping("/")
//	String firstpage() {
//		return "first";
//	}
//	
//	@RequestMapping("second")
//	String secondpage(HttpServletResponse res) {
//		System.out.println("ffrom second page...");
//		Cookie c = new Cookie("key","mypersonalkey");
//		res.addCookie(c);
//		try {
//			res.sendRedirect("third");
//		}catch(Exception e) {System.out.println(e);}
//		return "third";
//	}
//	@RequestMapping("third")
//	String thirdpage(HttpServletRequest req, HttpServletResponse res) {
//		Cookie[] c = req.getCookies();
//		if(c[1].getValue().equals("mypersonalkey")) {
//			try {
//				res.sendRedirect("finalpage");
//				return "finalpage";
//			}catch(Exception e) {System.out.println(e);}
//		}
//		else {
//			try {
//				res.sendRedirect("unauthorised");
//				return "unauthorised";
//			}catch(Exception e) {System.out.println(e);}
//		}
//		return "finalpage";
//	}
//	@RequestMapping("finalpage")
//	String correctpage(@CookieValue(value = "key", defaultValue = "DefaultValue")String cookieString) {
//		System.out.println(cookieString);
//		return "finalpage";
//	}
//	@RequestMapping("unauthorised")
//	String incorrectpage() {
//		return "unauthorised";
//	}
//}
/*
 * 17Mar(L)
 * 357
 * 361
 * 362
 * 457
 * 372
 * 493
 * 420
 * 473
 * 510
 * 391
 * 346
 * 309
 * 343
 * 342
 * 332
 * 504
 * 305
 * 424
 * 525
 */

