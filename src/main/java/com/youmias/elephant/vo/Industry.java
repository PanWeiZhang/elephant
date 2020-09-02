package com.youmias.elephant.vo;

import java.util.Date;
import java.util.List;

public class Industry{

	private Integer id;

	private Integer parentId;

	private Integer nativeId; //未处理数据前的id

	private String label;

	private String value;

	private List children;

	private Date createdAt;

	private Date updatedAt;

	public Integer getNativeId() {
		return nativeId;
	}

	public void setNativeId(Integer nativeId) {
		this.nativeId = nativeId;
	}

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
