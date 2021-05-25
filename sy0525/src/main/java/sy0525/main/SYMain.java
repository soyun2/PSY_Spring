package sy0525.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sy0525.beans.AA;
import sy0525.conf.Appctx;

public class SYMain {
	//Component - ComponentScan 사용하기
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Appctx.class);
		
		AA aa1 = acac.getBean(AA.class);
		aa1.doA();
		aa1.doAA();
		AA aa2 = acac.getBean(AA.class);
		System.out.println(aa1);
		System.out.println(aa2);
		
		System.out.println("aa1.a = " + aa1.a);
		aa1.a=20;
		//aa1과 aa2가 같은 공간(Spring Container 내) => aa1 값을 바꾸면 aa2도 바뀜
		System.out.println("aa2.a = " + aa2.a);
	}
}
