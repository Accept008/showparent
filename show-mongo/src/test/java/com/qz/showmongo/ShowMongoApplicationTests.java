package com.qz.showmongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShowMongoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("123 -> "+123);
    }

}
