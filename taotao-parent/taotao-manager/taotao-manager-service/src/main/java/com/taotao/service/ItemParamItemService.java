package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

public interface ItemParamItemService {

	String getItemParemById(long itemId);

	EasyUIDataGridResult getItemParamItemList(Integer page,Integer rows);
}
