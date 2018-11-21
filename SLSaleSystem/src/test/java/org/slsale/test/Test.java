package org.slsale.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slsale.pojo.Function;

public class Test {

    @org.junit.Test
    public void test() {
        Function fun1 = new Function();
        fun1.setFunctionName("主菜单1");
        Function fun2 = new Function();
        fun2.setFunctionName("主菜单2");
        Function fun3 = new Function();
        fun3.setFunctionName("主菜单3");
        Function fun01 = new Function();
        fun01.setFunctionName("主菜单1子菜单01");
        Function fun02 = new Function();
        fun02.setFunctionName("主菜单1子菜单02");
        Function fun03 = new Function();
        fun03.setFunctionName("主菜单2子菜单01");
        Function fun04 = new Function();
        fun04.setFunctionName("主菜单2子菜单02");
        Map<String,List<Function>> map = new HashMap<String, List<Function>>();
        List<Function> funList = new ArrayList<Function>();
        List<Function> funList1 = new ArrayList<Function>();
        funList.add(fun01);
        funList.add(fun02);
        funList1.add(fun03);
        funList1.add(fun04);
        map.put(fun1.getFunctionName(), funList);
        map.put(fun2.getFunctionName(), funList1);
        Set<String> set = map.keySet();
        System.out.println(set);
    }

}