package ru.netology.springbootdemo.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootdemo.profiles.DevProfile;
import ru.netology.springbootdemo.profiles.ProductionProfile;
import ru.netology.springbootdemo.profiles.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
