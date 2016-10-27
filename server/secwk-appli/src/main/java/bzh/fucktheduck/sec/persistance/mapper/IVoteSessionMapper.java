package bzh.fucktheduck.sec.persistance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.bean.VoteSession;

public interface IVoteSessionMapper {

	final String getAll = "SELECT * FROM vote_session";
	final String getById = "SELECT * FROM vote_session WHERE id = #{id}";
	final String deleteById = "DELETE FROM vote_session WHERE id = #{id}";
	final String insert = "INSERT INTO vote_session (id, creationdate, viewingdate) VALUES (#{id}, #{creationdate}, #{viewingdate})";
	final String update = "UPDATE vote_session SET creationdate = #{creationdate}, viewingdate = #{viewingdate} WHERE id = #{id}";

	@Select(getAll)
	@Result
	@Results(value = {
			@Result(property = "id", column = "id"), 
			@Result(property = "creationdate", column = "creationdate"),
			@Result(property = "viewingdate", column = "viewingdate") })
	List<Member> getAll();

	@Select(getById)
	@Results(value = { 
			@Result(property = "id", column = "id"), 
			@Result(property = "creationdate", column = "creationdate"),
			@Result(property = "viewingdate", column = "viewingdate") })
	Member getById(int id);

	@Update(update)
	void update(VoteSession student);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(VoteSession student);

}
