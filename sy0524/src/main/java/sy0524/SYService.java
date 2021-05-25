package sy0524;

import org.springframework.beans.factory.annotation.Autowired;

public class SYService {

	@Autowired
	AA aa;
	
	@Autowired
	BB bb;
	
	@Autowired
	CC cc;
	
	//스프링 컨테이너 안에 dd가 없더라도 에러 안나오게
	@Autowired(required=false)
	DD dd;	
	
	public void doAABB() {
		aa.doA();
		aa.doAA();
		bb.doB();
		bb.doBB();
		cc.doC();
		cc.doCC();
	}
}
