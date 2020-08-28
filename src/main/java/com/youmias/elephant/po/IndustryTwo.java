package com.youmias.elephant.po;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

public class IndustryTwo  implements Serializable {

    private Integer id;

    private Integer industryFirstId;

    private String name;

    private String code;

    private Date createdAt;

    private Date updatedAt;

    private IndustryFirst industryFirst;

    public IndustryFirst getIndustryFirst() {
        return industryFirst;
    }

    public void setIndustryFirst(IndustryFirst industryFirst) {
        this.industryFirst = industryFirst;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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