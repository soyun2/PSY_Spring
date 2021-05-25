package sy0525.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sy0525.beans.UseAABB;
import sy0525.conf.Appctx;

public class SYMainAuto {
	//Autowired 사용하기
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = 
				new AnnotationConfigApplicationContext(Appctx.class);
		
		UseAABB uab = acac.getBean(UseAABB.class);
		uab.doAABB();
	}
}
