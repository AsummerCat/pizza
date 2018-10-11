package top.linjingc.vo;

import java.io.Serializable;
import java.util.Date;

public class freezer implements Serializable{
    private Long id;
    private String name;//品名
    private String thawingTime; //解冻时间
    private Date createTime;
    private  Date updateTime;
    private String endTime;   //储存时间
    private Long type; //存储类型
    private String thawingMaxCount;//最大解冻数量
    private String thawingQuick; //快速解冻时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getThawingMaxCount() {
        return thawingMaxCount;
    }

    public void setThawingMaxCount(String thawingMaxCount) {
        this.thawingMaxCount = thawingMaxCount;
    }

    public String getThawingQuick() {
        return thawingQuick;
    }

    public void setThawingQuick(String thawingQuick) {
        this.thawingQuick = thawingQuick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThawingTime() {
        return thawingTime;
    }

    public void setThawingTime(String thawingTime) {
        this.thawingTime = thawingTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
