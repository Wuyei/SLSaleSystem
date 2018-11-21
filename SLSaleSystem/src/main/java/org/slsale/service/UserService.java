package org.slsale.service;

import java.util.List;

import org.slsale.pojo.Function;
import org.slsale.pojo.Menu;
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
    
    /**
     * 根据roleId获得主子菜单
     * @param roleId
     * @return
     * @throws Exception
     */
    List<Menu> getMenuListByRoleId(Integer roleId) throws Exception;
}
