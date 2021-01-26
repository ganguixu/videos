package cn.ggx.dao;

import cn.ggx.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    int addUser(User user);

    List<User> findUserAll();

    List<User> findUserByEmail(Map<String, String> map);

    List<User> findUserByIds(List<Integer> ids);

    int addUsers(List<User> list);

    int updateUsers(List<User> list);

}
