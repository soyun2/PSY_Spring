package sy0524;

import org.springframework.beans.factory.annotation.Autowired;

public class SYService {

	@Autowired
	AA aa;
	
	@Autowired
	BB bb;
	
	@Autowired
	CC cc;
	
	//������ �����̳� �ȿ� dd�� ������ ���� �ȳ�����
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
