package com.youmias.elephant.vo;


import java.util.List;

public class Area{

	private Integer id;

	private Integer nativeId; //未处理数据前的id

	private Integer value;

	private String label;

	private Integer parentId;

	private List children;

	public Integer getNativeId() {
		return nativeId;
	}

	public void setNativeId(Integer nativeId) {
		this.nativeId = nativeId;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
