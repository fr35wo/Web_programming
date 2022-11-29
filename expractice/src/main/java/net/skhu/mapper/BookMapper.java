package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Book;

@Mapper
public interface BookMapper {

	@Select("SELECT * FROM book WHERE id = #{id}")
	 Book findById(int id);

	 @Select("SELECT b.*, c.categoryName categoryName FROM book b LEFT JOIN category c ON b.categoryId = c.id")
	 List<Book> findAll();

	 @Insert("INSERT book (title, author, categoryId, price) VALUES (#{title}, #{author}, #{categoryId}, #{price})")

	 @Options(useGeneratedKeys=true, keyProperty="id")
	 void insert(Book book);
}
