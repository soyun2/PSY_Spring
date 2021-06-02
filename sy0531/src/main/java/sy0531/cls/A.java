package sy0531.cls;

public class A {
	public void doA() {
		System.out.println("doA");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("A 클래스 생성하고 나서 실행..");
	}
	public void destroy() throws Exception {
		System.out.println("스프링 객체담는통 없앨때...");
	}
}
