package com.taotao.search;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import java.io.IOException;

public class SolrSingTest {

/*    @Test
    public void testSingSolr() throws IOException, SolrServerException {
        //创建连接
        SolrServer solrServer = new HttpSolrServer("http://192.168.1.107:8983/solr/singcore");
        //创建一个文档
        SolrInputDocument document = new SolrInputDocument();
        //添加域
        document.addField("id","111");
    *//*    document.addField("item_title","测试商品");
        document.addField("item_sell_point", "卖点");*//*
        //添加到索引库
        solrServer.add(document);
        //提交
        solrServer.commit();

    }

    @Test
    public void testQuery() throws SolrServerException {
        //创建链接
        SolrServer solrServer = new HttpSolrServer("http://192.168.1.107:8983/solr/singcore");
        //创建一个查询对象
        SolrQuery query = new SolrQuery();
        query.setQuery("*:*");
        //执行查询
        QueryResponse response = solrServer.query(query);
        SolrDocumentList solrDocumentList = response.getResults();
        for (SolrDocument solrDocument:solrDocumentList) {
            System.out.println(solrDocument.get("id"));
        }

    }*/
}
