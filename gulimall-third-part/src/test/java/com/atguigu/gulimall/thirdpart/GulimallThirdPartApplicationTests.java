package com.atguigu.gulimall.thirdpart;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallThirdPartApplicationTests {

    @Autowired
    OSS ossClient;

    @Test
    void contextLoads() {
    }


    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
       /* String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5tKrrx19UTQ5PKuGfR1V";
        String accessKeySecret = "u0CzCIWlKyds0GuJsvw6RMQrHaqUzt";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);*/
        // 上传文件。
        InputStream inputStream = new FileInputStream("F:\\杂项\\壁纸\\IMG_1498.jpeg");
        ossClient.putObject("gulimall-run","IMG_1498.jpeg",inputStream);
        ossClient.shutdown();

        System.out.println("上传成功！！！！");
    }

}
