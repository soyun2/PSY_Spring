package sy0607.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sy0607.cls.Calc;
import sy0607.conf.MyConf;

public class Main {
	/*
	 * MyConf 스프링 객체 담는 통 만드는 클래스
	 * Calc 계산기 클래스
	 * MyAspect aop생성 클래스
	 * main 함수 실행하는 클래스
	 * 
	 * aop 데코레이션
	 * requestMapping("/") -> url 매핑 (함수를 실행하기 전에 들렀다 가는 곳을 설정)
	 */
	
	public static void main(String[] args) {		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConf.class);
		
		Calc cl = acac.getBean(Calc.class);
//		cl.doA();
		cl.doB(10, 20);
		
		acac.close();
	}
}
