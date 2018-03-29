package com.imook.repository;

import com.imook.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Issac
 * @Description:
 * @Date: Created in 18:07 2018/3/29
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    @Transactional
    //在测试方法中 @Transactional 无论成功与否都会完全回滚
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",5);
        ProductCategory result =  repository.save(productCategory);
        //期望不为空-与assertNotEquals(null,result)完全相同
        Assert.assertNotNull(result);
        //不期望是null,实际上是result
        //Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4,5);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }


}