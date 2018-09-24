package com.kaneko.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Takuya Kaneko
 *
 *
 */

@Controller
public class HeloController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){


			mav.setViewName("index");
			mav.addObject("msg", "年齢を選んでください");
		//	mav.addObject("msg2", "昨年の年収を選んでください");
			return mav;
			}
//
//	@RequestMapping(value="/",method=RequestMethod.POST)
//	public ModelAndView send(@RequestParam("text1")String str,ModelAndView mav) {
//		mav.addObject("msg","こんにちは,"+str+"さん!");
//		mav.addObject("value",str);
//		mav.setViewName("index");
//		return mav;
//	}



	@RequestMapping("/other")
	public String other() {
		return "redirect;/";
				}

	@RequestMapping("/home")
	public String home() {
		return "forward:/";
	}
	}


//		String res="";
//
//		try {
//			res = "check" + check1
//
//					+ "radio:" + radio1 + "select;" + select1 + "\nselect2:";
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//		}
//
//		try {
//			res+=", "+select2[0];
//			for(int i=1;i<select2.length;i++) {
//				res +=", "+select2[i];
//			}
//
//
//		} catch (NullPointerException e) {
//			res+="null";
//		}
//
//		mav.addObject("msg",res);
//		mav.setViewName("index");
//		return mav;
//	}









