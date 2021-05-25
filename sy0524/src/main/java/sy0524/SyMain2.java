package sy0524;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SyMain2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("appctx.xml");
		
		SYService ss = gxac.getBean(SYService.class);
		ss.doAABB();
	}
}
