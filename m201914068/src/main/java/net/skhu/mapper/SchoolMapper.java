package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.School;

@Mapper
public interface SchoolMapper {
	@Select("SELECT r.* , b.buildingName buildingName FROM room r JOIN building b ON r.buildingId = b.id")
	List<School> findAll();

	@Select("SELECT r.* , b.buildingName buildingName FROM room r JOIN building b ON r.buildingId = b.id WHERE r.id = #{id}")
	School findById(int id);

	@Insert("INSERT school (id, roomName, buildingId, capacity, roomType) " +
			 "VALUES (#{id}, #{roomName}, #{buildingId}, #{capacity}, #{roomType})")

	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(School school);

	@Update("UPDATE school SET id=#{id}, roomName=#{roomName}, buildingId=#{buildingId}, " +
			 " capacity=#{capacity}, roomType=#{roomType} WHERE id=#{id}")
			 void update(School school);
	@Delete("DELETE FROM school WHERE id=#{id}")
	 void delete(int id);


}
