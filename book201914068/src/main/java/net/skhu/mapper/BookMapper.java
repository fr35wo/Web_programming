package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Book;

@Mapper
public interface BookMapper {
	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id")
			 List<Book> findAll();

	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id WHERE b.title LIKE #{title}")
	 List<Book> findByTitle(String title);

	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id " +
			 "WHERE b.id = #{id}")
			 Book findById(int id);
//	배열 객체로 안받고 반복 안해도됨(뷰) 그래서 Book 객체로만 받는다  조회 조건과 반환조건이 다르다.
}
