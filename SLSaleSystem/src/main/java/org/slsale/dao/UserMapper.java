package org.slsale.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slsale.pojo.Function;
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
    
    /**
     * 根据roleId查询出所有主菜单
     * @param roleId
     * @return
     * @throws Exception
     */
    List<Function> getMainMenuByRoleId(Integer roleId) throws Exception;
    
    /**
     * 根据Function Id与 roleId查询出子菜单
     * @param function
     * @return
     * @throws Exception
     */
    List<Function> getSubMenuByParentIdAndRoleId(
            @Param("parentId")Integer parentId,@Param("roleId")Integer roleId) 
                    throws Exception;
}
