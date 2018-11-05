package cn.tx.ann_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {
    @Bean
    public Car getBmw(){
        return new Bmw();
    }
}
