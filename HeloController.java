package com.kaneko.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

			mav.addObject("msg","フォームを送信してください");
			mav.setViewName("index");
			return mav;
			}

	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(
			@RequestParam(value="check1",required=false)Boolean check1,
			@RequestParam(value="radio1",required=false)String radio1,
			@RequestParam(value="select1",required=false)String select1,
			@RequestParam(value="select2",required=false)String[] select2,
			ModelAndView mav) {

		String res="";

		try {
			res = "check" + check1

					+ "radio:" + radio1 + "select;" + select1 + "\nselect2:";
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

		try {
			res+=", "+select2[0];
			for(int i=1;i<select2.length;i++) {
				res +=", "+select2[i];
			}


		} catch (NullPointerException e) {
			res+="null";
		}

		mav.addObject("msg",res);
		mav.setViewName("index");
		return mav;
	}





	}



