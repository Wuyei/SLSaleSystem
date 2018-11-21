package org.slsale.pojo;

import java.util.Date;

public class Function extends Base{
    private String function;    //功能编码
    private String functionName;    //功能名称
    private String funcUrl;         //功能URL
    private Integer parentId;       //父编号 
    private Date creationTime;      //创建时间
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    public String getFunctionName() {
        return functionName;
    }
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    public String getFuncUrl() {
        return funcUrl;
    }
    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }
    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Date getCreationTime() {
        return creationTime;
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
    @Override
    public String toString() {
        return "Function [function=" + function + ", functionName=" + functionName + ", funcUrl=" + funcUrl
                + ", parentId=" + parentId + ", creationTime=" + creationTime + ", getId()=" + getId() + "]";
    }
    
}
