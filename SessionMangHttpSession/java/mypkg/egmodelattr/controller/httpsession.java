package mypkg.egmodelattr.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class httpsession {
	HttpSession sess;
	@RequestMapping("/")
	String httpnewsession(HttpServletRequest req) {
		sess = req.getSession(true);
		System.out.println("httpsession...");
		return "httpreqfirst";
	}
	@RequestMapping("mainpage")
	String sameSession(HttpServletRequest req) {
		HttpSession hs = req.getSession(false);
		if(hs.getId() == sess.getId()) {
			return "finalpage";
		}
		else {
			return "unauthorised";
		}
	}
	@RequestMapping("finalpage")
	String gotofinal() {
		return "finalpage";
	}	
	@RequestMapping("unauthorised")
	String unauthorisedaccess() {
		return "unauthorised";
	}
}
/* 22Mar(L)
 * 390
 * 457
 * 362
 * 360
 * 473
 * 392
 * 420
 * 559
 * 566
 * 572
 * 510
 * 584
 * 550
 * 391
 * 492
 * 520
 * 518
 * 487
 * 525
 * 504
*/