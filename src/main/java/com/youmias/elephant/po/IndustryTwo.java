package com.youmias.elephant.po;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class IndustryTwo {
    private Integer id;

    private Integer industryFirstId;

    private String name;

    private String code;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndustryFirstId() {
        return industryFirstId;
    }

    public void setIndustryFirstId(Integer industryFirstId) {
        this.industryFirstId = industryFirstId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}