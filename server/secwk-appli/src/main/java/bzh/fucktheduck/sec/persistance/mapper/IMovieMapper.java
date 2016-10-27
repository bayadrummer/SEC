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

public interface IMovieMapper {

	final String getAll = "SELECT * FROM movie";
	final String getById = "SELECT * FROM movie WHERE id = #{id}";
	final String deleteById = "DELETE FROM movie WHERE id = #{id}";
	final String insert = "INSERT INTO movie (id, title, year, synopsys) VALUES (#{id}, #{title}, #{year}, #{synopsys})";
	final String update = "UPDATE movie SET title = #{title}, year = #{year}, synopsys = #{synopsys} WHERE id = #{id}";

	@Select(getAll)
	@Result
	@Results(value = {
			@Result(property = "id", column = "id"), 
			@Result(property = "title", column = "title"),
			@Result(property = "year", column = "year"), 
			@Result(property = "synopsys", column = "synopsys") })
	List<Member> getAll();

	@Select(getById)
	@Results(value = { 
			@Result(property = "id", column = "id"), 
			@Result(property = "title", column = "title"),
			@Result(property = "year", column = "year"), 
			@Result(property = "synopsys", column = "synopsys") })
	Member getById(int id);

	@Update(update)
	void update(Movie student);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(Movie student);

}
