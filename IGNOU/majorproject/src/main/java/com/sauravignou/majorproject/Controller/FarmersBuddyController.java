package com.sauravignou.majorproject.Controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FarmersBuddyController {

	@RequestMapping("/")
	public ModelAndView myIndex() {
		return new ModelAndView("index");
	}
}