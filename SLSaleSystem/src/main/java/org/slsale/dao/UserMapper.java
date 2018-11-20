package org.slsale.dao;

import org.slsale.pojo.User;

public interface UserMapper {
    /**
     * 查询单个用户
     * @param user
     * @return user
     */
    User getUser(User user) throws Exception;
    
    /**
     * 更新用户
     * @param user
     * @return
     * @throws Exception
     */
    int updateUser(User user)  throws Exception;
}
