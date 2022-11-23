package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.School;

@Mapper
public interface SchoolMapper {
	@Select("SELECT r.* , b.buildingName buildingName FROM room r JOIN building b ON r.buildingId = b.id")
	List<School> findAll();

	@Select("SELECT r.* , b.buildingName buildingName FROM room r JOIN building b ON r.buildingId = b.id WHERE r.id = #{id}")
	School findById(int id);
}
