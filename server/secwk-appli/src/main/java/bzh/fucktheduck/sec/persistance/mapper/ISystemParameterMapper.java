package bzh.fucktheduck.sec.persistance.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bzh.fucktheduck.sec.persistance.bean.Member;
import bzh.fucktheduck.sec.persistance.bean.Movie;
import bzh.fucktheduck.sec.persistance.bean.SystemParameter;

public interface ISystemParameterMapper {

	final String getAll = "SELECT * FROM system_parameter";
	final String getById = "SELECT * FROM system_parameter WHERE id = #{id}";
	final String deleteById = "DELETE FROM system_parameter WHERE id = #{id}";
	final String insert = "INSERT INTO system_parameter (id, name, type, value) VALUES (#{id}, #{name}, #{type}, #{value})";
	final String update = "UPDATE system_parameter SET name = #{name}, type = #{type}, value = #{value} WHERE id = #{id}";

	@Select(getAll)
	@Result
	@Results(value = {
			@Result(property = "id", column = "id"), 
			@Result(property = "name", column = "name"),
			@Result(property = "type", column = "type"), 
			@Result(property = "value", column = "value") })
	List<Member> getAll();

	@Select(getById)
	@Results(value = { 
			@Result(property = "id", column = "id"), 
			@Result(property = "name", column = "name"),
			@Result(property = "type", column = "type"), 
			@Result(property = "value", column = "value") })
	Member getById(int id);

	@Update(update)
	void update(SystemParameter student);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(SystemParameter student);

}
