package com.youmias.elephant.po;

import java.util.List;

public class City {
    private Integer id;

    private Integer code;

    private String name;

    private Integer parentId;

    private List<County> countys;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<County> getCountys() {
        return countys;
    }

    public void setCountys(List<County> countys) {
        this.countys = countys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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