import com.codegeekgao.FastDFSClient;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author DonnieGao
 * @version Id: TestFDFS.java, v 0.1 2018/8/23 上午11:41 DonnieGao Exp $$
 */
public class TestFDFS {

    @Test
    public void testUpload() {
        File file = new File("/Users/DonnieGao/Desktop/4.jpg");
        Map<String, String> metaList = new HashMap<String, String>();
        metaList.put("width", "1024");
        metaList.put("height", "768");
        metaList.put("author", "codegeekgao");
        metaList.put("date", "20180823");
        String fid = FastDFSClient.uploadFile(file, file.getName(), metaList);
        System.out.println("upload local file " + file.getPath() + " ok, fileid=" + fid);
    }

    /**
     * 文件下载测试
     */
    @Test
    public void testDownload() {
        int r = FastDFSClient.downloadFile("group1/M00/00/00/wKgBFVt-LfeACNB8AADZBbEFl88209.jpg", new File("/Users/DonnieGao/Desktop/2.jpg"));
        System.out.println(r == 0 ? "下载成功" : "下载失败");
    }


    /**
     * 获取文件元数据测试
     */
    @Test
    public void testGetFileMetadata() {
        Map<String, String> metaList = FastDFSClient.getFileMetadata("group1/M00/00/00/wKgBFVt-MfeASvoDAADZBbEFl88381.jpg");
        for (Iterator<Map.Entry<String, String>> iterator = metaList.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            String name = entry.getKey();
            String value = entry.getValue();
            System.out.println(name + " = " + value);
        }
    }

    /**
     * 文件删除测试
     */
    @Test
    public void testDelete() {
        int r = FastDFSClient.deleteFile("group1/M00/00/00/wKgBFVt-LfeACNB8AADZBbEFl88209.jpg");
        System.out.println(r == 0 ? "删除成功" : "删除失败");
    }

}
