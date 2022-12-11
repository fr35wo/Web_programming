package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Building;


@Mapper
public interface BuildingMapper {
	@Select("SELECT * FROM building")
	 List<Building> findAll();

}
