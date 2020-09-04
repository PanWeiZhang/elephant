package com.youmias.elephant.po;

import java.util.List;

public class City {
    private String id;

    private Integer code;

    private String name;

    private String parentId;

    private List<County> countys;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<County> getCountys() {
        return countys;
    }

    public void setCountys(List<County> countys) {
        this.countys = countys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}