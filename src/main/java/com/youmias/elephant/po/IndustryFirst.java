package com.youmias.elephant.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class IndustryFirst implements Serializable {

    private Integer id;

    @Column(name = "name")
    private String t_name;

    private String code;

    private Date createdAt;

    private Date updatedAt;

    private List<IndustryTwo> industryTwos;

    public List<IndustryTwo> getIndustryTwos() {
        return industryTwos;
    }

    public void setIndustryTwos(List<IndustryTwo> industryTwos) {
        industryTwos = industryTwos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return t_name;
    }

    public void setName(String name) {
        this.t_name = name == null ? null : name.trim();
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