package com.hodorcorporation.dummyproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = DummyProjectApplicationTests.class)
class DummyProjectApplicationTests {


    @Test
    void contextLoads() {
        assertTrue(true);
    }

}
