package sy0525.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sy0525.beans.AA;
import sy0525.conf.Appctx;

public class SYMain {
	//Component - ComponentScan ����ϱ�
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
		//aa1�� aa2�� ���� ����(Spring Container ��) => aa1 ���� �ٲٸ� aa2�� �ٲ�
		System.out.println("aa2.a = " + aa2.a);
	}
}
