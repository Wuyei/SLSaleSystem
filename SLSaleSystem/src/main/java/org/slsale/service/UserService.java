package org.slsale.service;

import org.slsale.pojo.User;

public interface UserService {
    
    /**
     * 查询单个用户
     * @param user
     * @return
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
