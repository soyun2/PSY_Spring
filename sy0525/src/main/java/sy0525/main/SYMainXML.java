package sy0525.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import sy0525.beans.UseAABB;

public class SYMainXML {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac
			= new GenericXmlApplicationContext("appctx.xml");
		
		UseAABB uab = gxac.getBean(UseAABB.class);
		uab.doAABB();
	}
}
