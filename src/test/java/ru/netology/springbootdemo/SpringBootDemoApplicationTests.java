package ru.netology.springbootdemo;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootDemoApplicationTests {
    @Autowired
    TestRestTemplate restTemplate;

    @Before
    public static void setUp() {

    }

    @Test
    void contextLoads() {
//        ResponseEntity<String> forEntity =
//                restTemplate.getForEntity("http://localhost:" + myapp.getMappedPort(8080), String.class);
//        System.out.println(forEntity.getBody());
    }

}
