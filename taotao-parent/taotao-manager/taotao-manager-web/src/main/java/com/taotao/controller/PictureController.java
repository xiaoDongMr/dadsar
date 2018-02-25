package com.taotao.controller;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * 图片上传controller
 * <p>Title: PictureController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年8月15日下午3:47:08
 * @version 1.0
 */
@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String upload(MultipartFile uploadFile) {
		PictureResult result = pictureService.uploadPicture(uploadFile);
		return JsonUtils.objectToJson(result);
	}

	@RequestMapping("/picture/upload")
	@ResponseBody
	public String uploadPic(MultipartFile upfile, @RequestParam(value="editorid")String editorid) {
		if(editorid.equals("myEditor")){
			String result = pictureService.uploadFastDFS(upfile);

			Map<String,String> map = new HashMap<String,String >();
			//文件原名称
			map.put("title", upfile.getName());
			//现在文件名称
			map.put("original", upfile.getOriginalFilename());
			//文件大小（字节数）
			map.put("size", Long.toString(upfile.getSize()));
			//是否上传成功
			map.put("state", "SUCCESS");
			//文件类型 .+后缀名
			map.put("type", upfile.getContentType());
			//文件路径
			map.put("url",  result);

			//return map;
			return JsonUtils.objectToJson(map);
		}
		return null;
	}

	
}
