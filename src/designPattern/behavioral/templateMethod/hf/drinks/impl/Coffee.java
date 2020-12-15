package designPattern.behavioral.templateMethod.hf.drinks.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import designPattern.behavioral.templateMethod.hf.drinks.CaffeinBeverage;

public class Coffee extends CaffeinBeverage{
	public void brew() {
		System.out.println("필터를 통해서 커피를 우려내는 중");
		
	}
	public void addCondiments() {
		System.out.println("설탕과 커피를 추가하는 중");
		
	}
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (Y/N)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch(IOException ioe) {
			System.out.println("IO 오류");
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
}
