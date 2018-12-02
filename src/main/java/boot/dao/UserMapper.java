package boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.pojo.User;


@Mapper
public interface UserMapper {
	List<User> findAll();
}
