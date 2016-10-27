package bzh.fucktheduck.sec.persistance.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.mapper.IMemberMapper;
import bzh.fucktheduck.sec.persistance.util.SessionUtil;

public class MemberDAO extends BaseDAO {

	private static MemberDAO memberDAO = null;
	
	private static Logger logger = LoggerFactory.getLogger(Member.class); 

	public MemberDAO() {
	}

	public static MemberDAO getInstance() {
		if (null == memberDAO) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}

	public List<Member> getAllMembers() {

		SqlSession session = SessionUtil.getSession();
		IMemberMapper mapper = session.getMapper(IMemberMapper.class);

		List<Member> result = mapper.getAll();

		session.close();

		return result;
	}

	public Member findById(int id) {

		SqlSession session = SessionUtil.getSession();
		IMemberMapper mapper = session.getMapper(IMemberMapper.class);

		Member result = mapper.getById(id);

		session.close();

		return result;
	}
	
	public void insertMember(Member member) {
		
		SqlSession session = SessionUtil.getSession();
		IMemberMapper mapper = session.getMapper(IMemberMapper.class);
		
		logger.debug("Insertion member {}", member);
		
		mapper.insert(member);
		
		session.commit();
		
		session.close();
	}
}
