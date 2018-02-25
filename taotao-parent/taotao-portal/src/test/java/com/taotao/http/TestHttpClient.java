package com.taotao.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class TestHttpClient {

	/*@Test
	public void doGet() throws Exception {
		//创建一个httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建一个httpGet对象,指定要访问的url
		HttpGet httpGet = new HttpGet("http://www.jd.com");
		//执行请求
		CloseableHttpResponse response = httpClient.execute(httpGet);
		//取出相应的内容
		HttpEntity entity = response.getEntity();
		//默认的编码是ISO8859-1
		String responseStr = EntityUtils.toString(entity, "gb2312");
		System.out.println(responseStr);
		//关闭httpclient
		response.close();
		httpClient.close();
	}
	
	@Test
	public void doGetWithParam() throws Exception{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建一个URI
		URIBuilder uriBuilder = new URIBuilder("http://www.sogou.com/web")
				.addParameter("query", "谢霆锋被骑脖子");
		System.out.println(uriBuilder.build());
		//创建一个GET对象
		HttpGet httpGet = new HttpGet(uriBuilder.build());
		//执行请求
		CloseableHttpResponse response = httpClient.execute(httpGet);
		//取出相应的内容
		HttpEntity entity = response.getEntity();
		//默认的编码是ISO8859-1
		String responseStr = EntityUtils.toString(entity, "gb2312");
		System.out.println(responseStr);
		//关闭httpclient
		response.close();
		httpClient.close();
	}
	
	@Test
	public void doPost() throws Exception {
		//创建一个Httpclient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		//创建一post对象
		HttpPost httpPost = new HttpPost("http://www.baidu.com");
		//创建一个模拟表单
		List<NameValuePair> param = new ArrayList<>();
		param.add(new BasicNameValuePair("name", "admin"));
		param.add(new BasicNameValuePair("password", "123"));
		StringEntity entity = new UrlEncodedFormEntity(param);
		//把表单内容放入httpPost对象
		httpPost.setEntity(entity);
		//执行请求
		CloseableHttpResponse response = httpClient.execute(httpPost);
		String result = EntityUtils.toString(response.getEntity());
		System.out.println(result);
		response.close();
		httpClient.close();
	}*/

	/*@Test
	public void testHttpPost() throws Exception {
		// 第一步：创建一个httpClient对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		// 第二步：创建一个HttpPost对象。需要指定一个url
		HttpPost post = new HttpPost("http://localhost:8082/posttest.html");
		// 第三步：创建一个list模拟表单，list中每个元素是一个NameValuePair对象
		List<NameValuePair> formList = new ArrayList<>();
		formList.add(new BasicNameValuePair("name","xiaodong"));
		formList.add(new BasicNameValuePair("pass","123456"));
		// 第四步：需要把表单包装到Entity对象中。StringEntity
		StringEntity entity = new UrlEncodedFormEntity(formList,"utf-8");
		post.setEntity(entity);
		// 第五步：执行请求。
		CloseableHttpResponse response = httpClient.execute(post);
		// 第六步：接收返回结果
		HttpEntity httpEntity = response.getEntity();
		String result = EntityUtils.toString(httpEntity);
		System.out.println(result);
		// 第七步：关闭流。
		response.close();
		httpClient.close();
	}*/

}
