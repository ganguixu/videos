package cn.ggx.service;

import cn.ggx.dao.UserDao;
import cn.ggx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao ;

    public List<User> findUserAll(){
        List<User> userAll = userDao.findUserAll();
        if (userAll.size()>0 && userAll!=null){
            return userAll ;
        }else {
            return null ;
        }
    }

    public List<User> findUserByEmail(String email){
        Map<String,String> emailMap = new HashMap<>();
        emailMap.put("email",email);
        List<User> userByEmail = userDao.findUserByEmail(emailMap);
        if (userByEmail.size()>0 && userByEmail!=null){
            return userByEmail ;
        }else{
            return null ;
        }
    }

    public List<User> findUserByids(Integer... ids){
        List<Integer> idList = new ArrayList<>();
        for (int i=0;i<ids.length;i++){
            idList.add(ids[i]);
        }
        List<User> userByEmail = userDao.findUserByIds(idList);
        if (userByEmail.size()>0 && userByEmail!=null){
            return userByEmail ;
        }else{
            return null ;
        }
    }
}
