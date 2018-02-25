package com.taotao.portal.controller;

import com.taotao.common.pojo.TaotaoResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoresController {

	@RequestMapping(value = "/posttest",method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult posttest(String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
		return TaotaoResult.ok();
	}
	
}
