package sy0531.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sy0531.cls.A;
import sy0531.cls.B;

@Configuration
public class MyConf1 {
	@Bean
	public A a() {
		A a = new A();
		return a;
	}
	@Bean(initMethod="init",destroyMethod="des")
	public B b() {
		B b = new B();
		return b;
	}
}
