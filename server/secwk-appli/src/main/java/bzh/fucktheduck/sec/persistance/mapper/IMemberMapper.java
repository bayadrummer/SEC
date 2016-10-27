package bzh.fucktheduck.sec.persistance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bzh.fucktheduck.sec.persistance.bean.Member;

public interface IMemberMapper {

	final String getAll = "SELECT * FROM member";
	final String getById = "SELECT * FROM member WHERE id = #{id}";
	final String deleteById = "DELETE FROM member WHERE id = #{id}";
	final String insert = "INSERT INTO member (id, login, password) VALUES (#{id}, #{login}, #{password})";
	final String update = "UPDATE member SET password = #{password} WHERE id = #{id}";

	@Select(getAll)
	@Result
	@Results(value = { 
			@Result(property = "id", column = "id"), 
			@Result(property = "login", column = "login"),
			@Result(property = "password", column = "password") })
	List<Member> getAll();

	@Select(getById)
	@Results(value = { 
			@Result(property = "id", column = "id"), 
			@Result(property = "login", column = "login"),
			@Result(property = "password", column = "password") })
	Member getById(int id);

	@Update(update)
	void update(Member student);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(Member student);

}
