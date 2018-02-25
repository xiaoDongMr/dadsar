package com.taotao.search.service;

import com.taotao.common.pojo.TaotaoResult;

import java.util.List;

public interface ItemService {

	TaotaoResult importAllItems()  throws Exception;

	TaotaoResult deleteItemById(String id) throws Exception;
	TaotaoResult deleteItemByIds(List<String> ids) throws Exception;
}
