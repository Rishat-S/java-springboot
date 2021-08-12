package ru.netology.springbootdemo;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootDemoApplicationTests {
    @Autowired
    TestRestTemplate restTemplate;

    public static GenericContainer<?> devapp = new GenericContainer<>("devapp:latest");
//    public static GenericContainer<?> prodapp = new GenericContainer<>("prodapp");

    @Before
    public static void setUp() {
        devapp.start();
//        prodapp.start();
    }

    @Test
    void contextLoads() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:" + devapp.getMappedPort(8080), String.class);
//        System.out.println(forEntity.getBody());
    }

}
