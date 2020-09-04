package com.youmias.elephant.utils;

import com.youmias.elephant.vo.Area;
import com.youmias.elephant.vo.Industry;

import java.util.*;
import java.util.stream.Collectors;

public class ListToTreeUtil{

	/**
	 * list 转 tree
	 */
	public static List<Area> generateTree(List<Area> list) {

		List<Area> trees = new ArrayList<Area>();

		for (Area treeNode : list) {
			if ("0".equals(treeNode.getParentId())) { trees.add(treeNode); }
			for (Area it : list) {
				if (it.getParentId().equals(treeNode.getId()) ) {
					if (treeNode.getChildren() == null) {
						treeNode.setChildren(new ArrayList<Area>());
					}
					treeNode.getChildren().add(it);
				}
			}
		}
		return trees;

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
