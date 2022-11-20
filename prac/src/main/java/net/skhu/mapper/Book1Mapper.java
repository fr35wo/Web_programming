package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Book1;

@Mapper
public interface Book1Mapper {
	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id")
	List<Book1> findAll();
	//SQL 명령의 조회 결과 레코드 한 개당 Student 객체 한 개가 생성되고,
	//조회 결과 레코드의 컬럼들이 Student 객체의 속성에 채워진다.
	//이때 컬럼명과 객체의 속성명이 일치하는 것만 채워지고, 일치하지 않는 것은 무시된다.
	//이렇게 생성된 Student 객체들이 List<Student> 타입의 객체에 채워져 리턴된다.


	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id WHERE b.title LIKE #{title}")
	List<Book1> findByTitle(String title);

	@Select("SELECT b.*, c.categoryName categoryName FROM book b JOIN category c ON b.categoryId = c.id WHERE b.id = #{id}")
	Book1 findById(int id);

}
