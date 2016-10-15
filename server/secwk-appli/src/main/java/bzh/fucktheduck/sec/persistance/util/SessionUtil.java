package bzh.fucktheduck.sec.persistance.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionUtil {

	private static final Logger logger = LoggerFactory.getLogger(SessionUtil.class);
	
	private static final String resource = "mybatis-sec-config.xml";
	private static SqlSessionFactory sqlSessionFactory;

	static {
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			logger.error(e.getMessage());
			//System.out.println(e);
		} finally {
			IOUtils.closeQuietly(reader);
		}
	}

	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}