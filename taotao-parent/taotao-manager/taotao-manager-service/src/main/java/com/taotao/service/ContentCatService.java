package com.taotao.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.pojo.TreeNode;

import java.util.List;

public interface ContentCatService {

	List<TreeNode> getContentCatList(long parentId);
	TaotaoResult createNode(long parentId, String name);
}
