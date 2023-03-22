package mypkg.egmodelattr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("obj")
class sessionattribute1 {
	@RequestMapping("session1")
	String sessiononecall(@ModelAttribute("obj")product p) {
		p.productname = "Changed Name...";
		return "sessionone";
	}
	@ModelAttribute("obj")
	product prod() {
		return new product();
	}
}

@Controller
@SessionAttributes("obj")
class sessionattribute2{
	@RequestMapping("session2")
	String sessiontwocall(@ModelAttribute("obj")product p) {
		return "sessiontwo";
	}
}


class product{
	String productname="DefaultName";
	@Override
	public String toString() {
		return "product [productname=" + productname + "]";
	}
}