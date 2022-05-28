package com.pjy.mallsystem.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThirdPartyApplicationTests {

    @Resource
    private OSSClient ossClient;

    /*@Autowired
    private OSS ossClient;*/


    @Test
    public void contextLoads() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("F:\\AllMyFile\\Pictures\\嘉然\\1.jpg");
        ossClient.putObject("mallsystem1","jiaran.jpg",fileInputStream);
    }

}
