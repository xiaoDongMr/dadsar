package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.ItemParamItemService;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItemParamItemController {

	@Autowired
	private ItemParamItemService itemParamItemService;
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/showParam/{itemId}")
	public String showParam(@PathVariable Long itemId, Model model) {
		String string = itemParamItemService.getItemParemById(itemId);
		model.addAttribute("html", string);
		return "item-param";
	}

	@RequestMapping("/item/param/list")
	@ResponseBody
	public EasyUIDataGridResult getItemParamList(@RequestParam (defaultValue = "1") Integer page,
	@RequestParam (defaultValue = "30") Integer rows) {
		EasyUIDataGridResult result = itemParamItemService.getItemParamItemList(page, rows);
		return result;
	}

}
