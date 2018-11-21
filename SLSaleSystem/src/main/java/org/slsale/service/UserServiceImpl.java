package org.slsale.service;

import java.util.ArrayList;
import java.util.List;

import org.slsale.dao.UserMapper;
import org.slsale.pojo.Function;
import org.slsale.pojo.Menu;
import org.slsale.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(User user) throws Exception {
        return userMapper.getUser(user);
    }

    @Override
    public int updateUser(User user) throws Exception {
        // TODO Auto-generated method stub
        return userMapper.updateUser(user);
    }

    @Override
    public List<Menu> getMenuListByRoleId(Integer roleId) throws Exception {
        // 主菜单集合
        List<Function> mainFunList = new ArrayList<Function>();
        //所有菜单集合
        List<Menu> menuList = new ArrayList<Menu>();
        mainFunList = userMapper.getMainMenuByRoleId(roleId);
        for (Function function : mainFunList) {
            Menu menu = new Menu();
            menu.setMainMenu(function);
            //根据Function Id与 roleId查询出子菜单
            menu.setSubMenu(userMapper.getSubMenuByParentIdAndRoleId
                    (function.getId(), roleId));
            menuList.add(menu);
        }
        return menuList;
    }

}
