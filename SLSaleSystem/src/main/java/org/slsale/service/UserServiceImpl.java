package org.slsale.service;

import org.slsale.dao.UserMapper;
import org.slsale.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(User user)  throws Exception{
        return userMapper.getUser(user);
    }
    @Override
    public int updateUser(User user) throws Exception {
        // TODO Auto-generated method stub
        return userMapper.updateUser(user);
    }

}
