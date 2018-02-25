package com.taotao.search;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolrCloudTest {

	/*@Test
	public void testSolrCloud() throws SolrServerException, IOException {
		//参数就是zookeeper集群的地址列表。
		*//*List<String> withZkHost = new ArrayList<String>();
		withZkHost.add("192.168.1.107:2181");
		withZkHost.add("192.168.1.107:2182");
		withZkHost.add("192.168.1.107:2183");*//*

		CloudSolrClient.Builder builder = new CloudSolrClient.Builder();
		builder.withZkHost("192.168.1.107:2181,192.168.1.107:2182,192.168.1.107:2183");

		CloudSolrClient cloudSolrClient = builder.build();

		*//*CloudSolrClient cloudSolrClient = new CloudSolrClient();

		CloudSolrClient builder = new CloudSolrClient.Builder().withZkHost(withZkHost).build();
		*//*
		cloudSolrClient.setZkClientTimeout(10000);
		cloudSolrClient.setZkConnectTimeout(10000);
		//设置默认的collection
		cloudSolrClient.setDefaultCollection("coll");
		//查询索引库
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		QueryResponse response = cloudSolrClient.query(query);
		SolrDocumentList solrDocumentList = response.getResults();
		System.out.println("查询结果总数量：" + solrDocumentList.getNumFound());
		
	}

	@Test
	public void testSolrCoult() throws IOException, SolrServerException {
		//创建一个SolrServer对象
		List<String> withZkHost = new ArrayList<String>();
		withZkHost.add("192.168.1.107:2181");
		withZkHost.add("192.168.1.107:2182");
		withZkHost.add("192.168.1.107:2183");
		CloudSolrClient cloudSolrClient = new CloudSolrClient.Builder().withZkHost(withZkHost).build();
		//设置默认的colletion
		cloudSolrClient.setDefaultCollection("coll");
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id","test02");
		document.addField("item_title","title2");
		//添加文档
		cloudSolrClient.add(document);
		cloudSolrClient.commit();
	}*/
}
