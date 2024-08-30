package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean //during context initialization, call this method and add  returned value  to the context
    Parrot parrot() { //method name becomes bean's name
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    String hello() {
        return "Hello";
    }
    @Bean
    Integer ten() {
        return 10;
    }
}
