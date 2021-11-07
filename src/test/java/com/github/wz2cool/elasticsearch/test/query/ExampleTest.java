package com.github.wz2cool.elasticsearch.test.query;

import com.github.wz2cool.elasticearch.service.TestService;
import com.github.wz2cool.elasticsearch.test.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
public class ExampleTest {

    @Resource
    private TestService testService;

    @Test
    public void test() {
        final String s = testService.sayHello();
        System.out.println(s);
    }
}
