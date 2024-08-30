package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean //during context initialization, call this method and add  returned value  to the context
    Parrot parrot() { //method name becomes bean's name
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean("miki")
    @Primary
    Parrot  parrot2() { //bean name
        var p = new Parrot();
        p.setName("Miki"); //parrot name
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
