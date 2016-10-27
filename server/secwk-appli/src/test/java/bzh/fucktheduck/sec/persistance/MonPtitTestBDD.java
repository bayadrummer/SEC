package bzh.fucktheduck.sec.persistance;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.dao.MemberDAO;

public class MonPtitTestBDD {
	
	Logger logger = LoggerFactory.getLogger(MonPtitTestBDD.class);
	
	private static MemberDAO memberDAO = MemberDAO.getInstance();

	@Test
	public void testInsert() {
		
		logger.info("début du test");
		
		Member m = new Member("insertedlogin" + Math.random()*10, "insertedpassword");
		
		memberDAO.insertMember(m);
		
	}
	
    @Test
    public void testSelect() {
    	
    	List<Member> membersList = null;
    	
    	try {
    		membersList = memberDAO.getAllMembers();
    		for (Member m : membersList) {
    			logger.info("id : " + m.getId() + ", login : " + m.getLogin() + ", password : " + m.getPassword());
    		}
    	}
    	catch (Exception e) {
    		logger.error(e.getMessage());
    	}
    	assertEquals(membersList.size(), 2);
    	
    	Member m = null;
    	try {
    		m = memberDAO.findById(2);
    		logger.info("id : " + m.getId() + ", login : " + m.getLogin() + ", password : " + m.getPassword());
    	}
    	catch (Exception e) {
    		logger.error(e.getMessage());
    	}
    	assertEquals(m.getLogin(), "logindeux");
    }
    
}
