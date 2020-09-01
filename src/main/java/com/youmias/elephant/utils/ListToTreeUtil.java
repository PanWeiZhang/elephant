package com.youmias.elephant.utils;

import com.youmias.elephant.vo.Area;
import com.youmias.elephant.vo.Industry;

import java.util.*;
import java.util.stream.Collectors;

public class ListToTreeUtil{

	/**
	 * list 转 tree
	 */
	public static List generateTree(List<Area> list) {

		for (Area l : list) {
			//每次循环找到每个节点的子节点们（f代表符合条件的集合），并挂载到当前节点下
			List<Area> children = list.stream().filter(f -> l.getId().equals(f.getParentId())).collect(Collectors.toList());
			l.setChildren(children);
		}

		List<Area> rootNodes = list.stream()
				.filter(f -> f.getParentId() == 0 || Objects.isNull(f.getParentId())).collect(Collectors.toList());

		return rootNodes;
	}

	/**
	 * list 转 tree
	 */
	public static List generateTree2(List<Industry> list) {

		for (Industry l : list) {
			//每次循环找到每个节点的子节点们（f代表符合条件的集合），并挂载到当前节点下
			List<Industry> children = list.stream().filter(f -> l.getId().equals(f.getParentId())).collect(Collectors.toList());
			l.setChildren(children);
		}

		List<Industry> rootNodes = list.stream()
				.filter(f -> f.getParentId() == 0 || Objects.isNull(f.getParentId())).collect(Collectors.toList());

		return rootNodes;
	}

}
