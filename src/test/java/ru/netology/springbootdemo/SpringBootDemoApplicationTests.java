package ru.netology.springbootdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootDemoApplicationTests {
    public static final String LOCALHOST = "http://localhost:";
    @Autowired
    TestRestTemplate restTemplate;

    public static GenericContainer<?> devapp = new GenericContainer<>("devapp:latest")
            .withExposedPorts(8080);
    public static GenericContainer<?> prodapp = new GenericContainer<>("prodapp")
            .withExposedPorts(8081);

    @BeforeAll
    public static void setUp() {
        devapp.start();
        prodapp.start();
    }

    @Test
    void contextLoads() {

        ResponseEntity<String> forDevEntity = restTemplate.getForEntity(LOCALHOST + devapp.getMappedPort(8080) + "/profile", String.class);
        assertEquals("Current profile is dev", forDevEntity.getBody());

        ResponseEntity<String> forProdEntity = restTemplate.getForEntity(LOCALHOST + prodapp.getMappedPort(8081) + "/profile", String.class);
        assertEquals("Current profile is production", forProdEntity.getBody());

    }

}
