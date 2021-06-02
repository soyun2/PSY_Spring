package sy0531.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sy0531.cls.A;

public class SYMain1 {
	/*
	 * 6�����.. spring �⺻... 
	 * 8�����..
	 * JdbcTemplate �⺻ ��ü... -> mybatis��ü�� ����մϴ�.
	 * 
	 * ����Ϸ�
	 * ������̼�... xml....
	 * ������ ��ü ��� ���� ����...
	 * @Bean, <bean>
	 * 
	 * �������ʱ��Լ�... �ʱ�ȭ ���... ���� ���� �ʱ�ȭ ���
	 * �������Լ�... <constructor-arg name="a" value="11"></constructor-arg>
	 * set�Լ�... <property name="a" value"11"></property>
	 * 
	 * @ComponentScan->�⺻ ��Ű�� �����ؼ� bean��ü �˻�
	 * @autowired->������ �����̳ʿ��� �ڵ����� ��ü �������� ��
	 * 
	 * @Component->��ü ���
	 * @Service
	 * @Controller
	 * @Repository
	 * @Aspect
	 * 
	 */
	public static void main(String[] args) {
		AbstractApplicationContext aac = new GenericXmlApplicationContext("myconf1.xml");
		
		A a = aac.getBean(A.class);
		a.doA();
		aac.close();
	}
}
