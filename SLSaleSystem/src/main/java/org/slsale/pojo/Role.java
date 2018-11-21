package org.slsale.pojo;

import java.util.Date;

public class Role extends Base{
    private String roleCode;        //角色编码
    private String roleName;        //角色名称
    private Date create;        //创建日期
    private Integer isStart;    //是否启用（0、未启用1、启用）
    private String createdBy;   //创建者
    public String getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Date getCreate() {
        return create;
    }
    public void setCreate(Date create) {
        this.create = create;
    }
    public Integer getIsStart() {
        return isStart;
    }
    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    @Override
    public String toString() {
        return "Role [roleCode=" + roleCode + ", roleName=" + roleName + ", create=" + create + ", isStart=" + isStart
                + ", createdBy=" + createdBy + ", getId()=" + getId() + "]";
    }
    
}
