package com.youmias.elephant.po;

import java.util.Date;
import java.util.List;

public class IndustryFirst {
    private Integer id;

    private String name;

    private String code;

    private Date createdAt;

    private Date updatedAt;

    private List<IndustryTwo> secInd;

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

    public List<IndustryTwo> getSecInd() {return secInd;}

    public void setSecInd(List<IndustryTwo> secInd) {this.secInd = secInd;}
}