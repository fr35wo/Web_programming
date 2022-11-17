package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

//StudentMapper는 DB의 student 테이블에 대한 SQL 명령들을 구현하기 위한 Java interface 이다.
//클래스가 아니고 Java interface임에 주목하자.
//StudentMapper와 같은 것들을 MyBatis mapper 라고 부른다.
//mybatis mapper에는 @Mapper 어노테이션이 붙어있어야 한다
@Mapper
public interface StudentMapper {
	@Select("SELECT s.*, d.name departmentName " + "FROM student s JOIN department d ON s.departmentId = d.id")
	List<Student> findAll();

//findAll 메소드는, student 테이블의 모든 레코드를 조회해서
//조회 결과 레코드 각각을 Student 객체에 채우고
//그 Student 객체들을 List<Student> 객체에 채워서 리턴한다.

	@Select("SELECT s.*, d.name departmentName " +
			 "FROM student s LEFT JOIN department d ON s.departmentId = d.id " +
			 "WHERE s.name LIKE #{name}")
			 List<Student> findByName(String name);

//	List<Student> findByName(String name); 메소드의 name 파라미터 변수 값이
//	SQL 명령의 #{name} 부분에 채워져서 실행된다.
//	이것은 #{name} 부분을 mybatis 파라미터라고 부른다.

	@Select("SELECT s.*, d.name departmentName " +
			 "FROM student s LEFT JOIN department d ON s.departmentId = d.id " +
			 "WHERE s.id = #{id}")
			 Student findById(int id);

}