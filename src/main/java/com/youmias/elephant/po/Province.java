package com.youmias.elephant.po;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Province {
    private Integer id;

    private Integer code;

    private String name;

    private List<City> citys;

    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
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

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", citys=" + citys +
                '}';
    }
}