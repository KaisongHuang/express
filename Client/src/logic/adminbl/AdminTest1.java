package logic.adminbl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;
import vo.AdminVO;

public class AdminTest1 {

	@Test
	public void test() {
		AdminVO vo1 = new AdminVO("1234567890", "无名氏1", "123321", "快递员");
		ResultMessage admin1 = new Admin().manageCount(null, null );
		AdminVO admin2 = new Admin().find("1412500540");
		boolean a=false;

		assertEquals(admin1,ResultMessage.Correct);
		if(admin2.getId().equals("1412500540")&&admin2.getName().equals("黄铠松")&&
				admin2.getPassword().equals("1412500540")&&admin2.getRole().equals("仓库管理员"))
			a=true;
		assertEquals(a,true);
	}

}
