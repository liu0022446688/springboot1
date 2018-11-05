package cn.tx.ann_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
    @Bean
    public Car getToyo(){
        return new Toyo();
    }
}
