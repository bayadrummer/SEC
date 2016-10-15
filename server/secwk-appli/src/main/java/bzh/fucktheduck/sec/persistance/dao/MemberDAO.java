package bzh.fucktheduck.sec.persistance.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.util.SessionUtil;

public class MemberDAO {

	private SqlSession session;
	
	private static MemberDAO memberDAO = null;
	
	public MemberDAO() {
	}
	
	public static MemberDAO getInstance() {
		if (null == memberDAO) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}
	
	private void beginSession() {
		session = SessionUtil.getSession();
	}
	
	private void closeSession() {
		session.close();
	}
	
	public List<Member> getAllMembers() {
		
		beginSession();
		
		List<Member> result = session.selectList("selectAllMembers");
		
		closeSession();
		
		return result;
	}
}
