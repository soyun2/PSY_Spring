package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SYMain {
	public static void main(String[] args) {
		// Spring.. framework
		// JSP + 스프링 객체 컨테이너를 활용해서 객체생성해서
		// 웹 프로그래밍 하는것...
		
		// SyContext안에 있는 AA BB 클래스 사용가능
		AnnotationConfigApplicationContext acac = 
				new AnnotationConfigApplicationContext(SyContext.class);
		
		AA aa1 = acac.getBean("aa",AA.class);
		System.out.println(aa1);
		AA aa2 = acac.getBean("aa",AA.class);
		System.out.println(aa2);
		AA aa3 = new AA();
		System.out.println(aa3);
		System.out.println("===========================");
		// aa1과 aa2의 주소값이 동일함 -> 하나의 객체가 동일한 위치에 상주하고 있음.
		// 객체 관리를 통해 컴퓨터 메모리 관리하고 속도 개선.
		
		BB bb = acac.getBean("bb",BB.class);
		System.out.println(bb);
		System.out.println("===========================");
		
		CC cc1 = CC.getInstance();
		System.out.println(cc1);
		CC cc2 = CC.getInstance();
		System.out.println(cc2);
		CC cc3 = new CC();
		System.out.println(cc3);
	}
}
