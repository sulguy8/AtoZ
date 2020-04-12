package com.ys.sp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
	private static List<String> strList = new ArrayList<>();
	private static String target= "";
	
	@GetMapping("/init")
	public String init() {
		Random r = new Random();
		target = "";
		while(target.length()<3) {
			int num = r.nextInt(10);
			if(target.indexOf(num+"")==-1) {
				target += num;
			}
		}
		System.out.println(target);
		return "complete";
	}
	@PostMapping("/game")
	public Map<String,String> doGame(@RequestParam Map<String,String> param){
		System.out.println(param.get("source"));
		String source = param.get("source");
		int out = 0;
		int strike = 0;
		int ball = 0;
		
		for(int i=0;i<source.length();i++) {
			int idx = target.indexOf(source.charAt(i));
			if(idx==-1) {
				out++;
			}else {
				if(i==idx) {
					strike++;
				} else {
					ball++;
				}
			}
		}
		Map<String,String> rMap = new HashMap<>();
		rMap.put("out", out+"");
		rMap.put("strike", strike+"");
		rMap.put("ball", ball+"");
		return rMap;
	}
	
	@PostMapping("/msg")
	public List<String> doMsg(@RequestParam Map<String,String> param){
		String id = param.get("id");
		String msg = param.get("msg") + "\n\r";
		strList.add(id + "$:v" + msg);
		return strList;
	}
	@GetMapping("/msg")
	public List<String> getMsg(){
		return strList;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		
		String target = "";
		while(target.length()<3) {
			int num = r.nextInt(10);
			if(target.indexOf(num+"")==-1) {
				target += num;
			}
		}
		System.out.println(target);
	
		String source = "024";
		int out = 0;
		int strike = 0;
		int ball = 0;
		
		for(int i=0;i<source.length();i++) {
			int idx = target.indexOf(source.charAt(i));
			if(idx==-1) {
				out++;
			}else {
				if(i==idx) {
					strike++;
				} else {
					ball++;
				}
			}
		}
		System.out.println("out:" + out + ",strike:" + strike + ",ball:" + ball);
		
		
	}
}
