package sy0531.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import sy0531.cls.A;

public class SYMain {
	/*
	 * ����
	 * spring chap5..
	 * mybatis �����ϰ�.. insert..
	 * ����
	 * opencv���̺귯�� Ȯ��..
	 */
	
	public static void main(String[] args) {
		// ������ �����̳� ����
		AbstractApplicationContext aac = new AnnotationConfigApplicationContext();
		
		A a = aac.getBean(A.class);
		a.doA();
		aac.close();
	}
	
}
