package sy0531.cls;

public class A {
	public void doA() {
		System.out.println("doA");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("A Ŭ���� �����ϰ� ���� ����..");
	}
	public void destroy() throws Exception {
		System.out.println("������ ��ü����� ���ٶ�...");
	}
}
