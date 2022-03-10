package com.example.springboot.config;

import com.example.springboot.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepandancyInjectionConfig {
    @Bean("RedCircle")
    RedCircle RedCircleImplementation() {
        return new RedCircle();
    }

    @Bean("RedRectangle")
    RedRectangle RedRectangleImplementation() {
        return new RedRectangle();
    }

    @Bean("RedStar")
    RedStar RedStarImplementation() {
        return new RedStar();
    }

    @Bean("RedTraingle")
    RedTraingle RedTraingleImplementation() { return new RedTraingle();
    }

    @Bean("YellowCircle")
    YellowCircle YellowCircleImplementation() { return new YellowCircle();
    }

    @Bean("YellowRectangle")
    YellowRectangle YellowRectangleImplementation() { return new YellowRectangle();
    }

    @Bean("YellowStar")
    YellowStar YellowStarImplementation() {
        return new YellowStar();
    }

    @Bean("YellowTraingle")
    YellowTraingle YellowTraingleImplementation() {
        return new YellowTraingle();
    }
}
