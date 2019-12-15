package com.ys.sp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController2 {
	public static String name = "우길동";
	
	@GetMapping("test")
	public String doTest(Model m) {			// 서버단에서 받아서 애초부터 나오게하겠다.
		m.addAttribute("name", TestController2.name );
		return "test/test";
	}
	
	@PostMapping("name")
	public @ResponseBody Map<String,String> changeName(@RequestParam Map<String,String> param){
		Map<String,String> rMap = new HashMap<>();
		rMap.put("msg","이름 변경 성공!");
		TestController2.name = param.get("name");
		return rMap;
		
	}
		
	
	/*
	 * @GetMapping(value="ajax", produces="application/text;charset=utf-8")
	 * public @ResponseBody String doTest() { // 브라우저 단에서 리턴에서 브라우저에서 처리 받겠다. return
	 * "홍길동"; }
	 */
}