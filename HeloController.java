package com.kaneko.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Takuya Kaneko
 *ブラウザからURLの末尾に0-4の整数値をつけてアクセスすると
 *その番号のデータがJSON形式で出力される
 */

@Controller
public class HeloController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){

			mav.addObject("msg","お名前を書いて送信してください");
			mav.setViewName("index");
			return mav;
			}

	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str,ModelAndView mav) {
		mav.addObject("msg","こんにちは"+str+"さん");
		mav.addObject("value",str);
		mav.setViewName("index");
		return mav;
	}





	}



