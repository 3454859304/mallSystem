package com.pjy.mallsystem.product;


import com.pjy.common.utils.R;
import com.pjy.mallsystem.product.entity.BrandEntity;
import com.pjy.mallsystem.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallsystemProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("pjy");
        brandEntity.setDescript("huawei");
        brandService.removeById(brandEntity);
        System.out.println("保存成功");
    }
}
