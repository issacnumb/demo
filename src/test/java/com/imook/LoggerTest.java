package com.imook;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Issac on 2018/3/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j注解 需要maven依赖-lombok插件-还有配置complier-Annotation Processors-enable打勾
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "imook";
        String password = "123456";

        log.info("name : {}, password : {}",name,password);

        log.info("info...");
        log.debug("debug...");
        log.error("error...");
    }
}
