package com.youmias.elephant.po;

import java.util.Date;

public class Problem {
    private String id;

    private Integer rank;

    private String title;

    private String description;

    private Integer status;

    private Integer industryOneId;

    private Integer industryTwoId;

    private Integer sponsorId;

    private Integer handlerId;

    private String problemConcatId;

    private Integer cost;

    private Integer costGold;

    private Date createTime;

    private Date updateTime;

    private byte[] file;

    private byte[] caption;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIndustryOneId() {
        return industryOneId;
    }

    public void setIndustryOneId(Integer industryOneId) {
        this.industryOneId = industryOneId;
    }

    public Integer getIndustryTwoId() {
        return industryTwoId;
    }

    public void setIndustryTwoId(Integer industryTwoId) {
        this.industryTwoId = industryTwoId;
    }

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Integer getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    public String getProblemConcatId() {
        return problemConcatId;
    }

    public void setProblemConcatId(String problemConcatId) {
        this.problemConcatId = problemConcatId == null ? null : problemConcatId.trim();
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCostGold() {
        return costGold;
    }

    public void setCostGold(Integer costGold) {
        this.costGold = costGold;
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

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public byte[] getCaption() {
        return caption;
    }

    public void setCaption(byte[] caption) {
        this.caption = caption;
    }
}