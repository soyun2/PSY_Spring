package sy0607.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sy0607.cls.Calc;
import sy0607.cls.MyAspect;

@Configuration
@EnableAspectJAutoProxy
public class MyConf {
	
	@Bean
	public MyAspect myAspect() {
		MyAspect ma = new MyAspect();
		return ma;
	}
	
	@Bean
	public Calc calc() {
		Calc cl = new Calc();
		return cl; 
	}
	
}
