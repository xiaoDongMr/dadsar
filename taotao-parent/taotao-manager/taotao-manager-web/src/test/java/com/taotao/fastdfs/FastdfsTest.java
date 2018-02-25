package com.taotao.fastdfs;

public class FastdfsTest {

/*    @Test
    public void testUpload() throws Exception {
        // 1、把FastDFS提供的jar包添加到工程中
        // 2、初始化全局配置。加载一个配置文件。
        ClientGlobal.init("D:\\workSpace\\java\\taotao\\taotao-parent\\taotao-manager\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("C:\\Users\\mayn\\Pictures\\Camera Roll\\550-395.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
    }*/

   /* @Test
    public void testFastDfsClient(){
        FastDFSClient fastDFSClient = null;
        try {
            fastDFSClient = new FastDFSClient("F:/Java/my-taotao/taotao-manager-web/src/main/resources/resource/fast_dfs.conf");
            String string = fastDFSClient.uploadFile("F:/fastdfs_test/a.jpg");
            // 注意，你再上传一遍，刚才你上传的那个图片就已经丢了，它已经存在服务器上了，你再也访问不到了
            System.out.println(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}
