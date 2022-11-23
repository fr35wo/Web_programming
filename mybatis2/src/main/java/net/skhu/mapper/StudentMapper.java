package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	@Select("SELECT * FROM student WHERE id = #{id}")
	Student findById(int id);

	@Select("SELECT s.*, d.name departmentName " + "FROM student s LEFT JOIN department d ON s.departmentId = d.id")
	List<Student> findAll();

	@Insert("INSERT student (studentNo, name, departmentId, phone, sex, email) "
			+ "VALUES (#{studentNo}, #{name}, #{departmentId}, #{phone}, #{sex}, #{email})")
//	insert 메소드의 파라미터 변수가 Student 객체이다.
//	이 Java 객체의 속성값이, INSERT SQL 명령의 #{...} 부분에 채워진 후,
//	그 SQL 명령이 DB에서 실행된다.
//	Java 객체의 속성명과, #{...} 부분의 이름이 일치해야 속성값이 채워질 수 있다.
//	#{...} 부분의 이름과 일치하는 Java 객체의 속성이 없을 경우에, 에러가 발생한다.

	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Student student);
//	INSERT할 테이블의 기본키(primary key) 필드 이름이 "id" 이고,
//	이 필드의 값은 자동으로 생성된다는 의미이다. (Auto Increment 필드)

//	student 테이블에 새 레코드를 insert 할 때, auto increment 필드인 id 필드 값은, 자동으로 부여된다.
//	그래서 insert SQL 문에 id 필드값은 지정하지 않았다.

//	 insert SQL 문이 실행되어 새 레코드가 student 테이블에 저장될 때,
//	 그 레코드의 id 필드값은 자동으로 주어진다.
//	 그 id 값이, insert 메소드의 파라미터 Student 객체의 id 속성에 자동으로 채워진다.

//	Auto Increment 필드
//	레코드를 insert할 때, 필드의 값이 자동으로 주어진다.
//	자동으로 주어지는 필드 값은 1부터 시작하는 int 이다. (1, 2, 3, 4...)
}















