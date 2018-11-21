package org.slsale.pojo;

import java.util.Date;

public class Authority extends Base{
    
    private Integer roleId;     //角色ID
    private Integer functionIdb;    //功能ID
    private Integer userTypeId;     //用户类型ID
    private Date creationTime;      //创建时间
    private String createdBy;       //创建者
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public Integer getFunctionIdb() {
        return functionIdb;
    }
    public void setFunctionIdb(Integer functionIdb) {
        this.functionIdb = functionIdb;
    }
    public Integer getUserTypeId() {
        return userTypeId;
    }
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }
    public Date getCreationTime() {
        return creationTime;
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Override
    public String toString() {
        return "Authority [roleId=" + roleId + ", functionIdb=" + functionIdb + ", userTypeId=" + userTypeId
                + ", creationTime=" + creationTime + ", createdBy=" + createdBy + ", getId()=" + getId() + "]";
    }
    
    
}
