package com.taotao.ftl;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


public class FreeMarkerTest {

    @Test
    public void testFreeMarker() throws IOException, TemplateException {
        //创建一个Configuration对象
        Configuration configuration = new Configuration(Configuration.getVersion());
        //告诉config对象模板文件存放路径
        configuration.setDirectoryForTemplateLoading(new
                File("D:\\workSpace\\java\\taotao\\taotao-parent\\taotao-portal\\src\\main\\webapp\\WEB-INF\\ftl"));
        //设置config的默认字符集
        configuration.setDefaultEncoding("utf-8");
        //从config对象中获取模板对象，需要制定一个模板文件的名字
        Template template = configuration.getTemplate("first.ftl");
        //创建模板需要的数据集。可以是一个map对象也可以一个pojo,把模板需要的数据都放入数据集
        Map root = new HashMap<>();
        root.put("title","hello");
        root.put("body","hello freemarker");
        //创建一个Writer对象，指定生成文件保存的路径及文件名
        Writer out = new FileWriter(new File("D:\\workSpace\\java\\ftl\\first.html"));
        //调用模板对象的process方法生成静态文件，需要两个参数数据集和writer对象
        template.process(root,out);
        //关闭writer对象
        out.flush();
        out.close();
    }


}
