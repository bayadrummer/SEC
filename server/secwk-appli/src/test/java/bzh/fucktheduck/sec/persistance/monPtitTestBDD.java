package bzh.fucktheduck.sec.persistance;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.dao.MemberDAO;
import bzh.fucktheduck.sec.persistance.util.SessionUtil;

public class monPtitTestBDD {
	
	Logger logger = LoggerFactory.getLogger(monPtitTestBDD.class);
	
	private static MemberDAO memberDAO = MemberDAO.getInstance();

    @Test
    public void testage() {
    	
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
    }
}
