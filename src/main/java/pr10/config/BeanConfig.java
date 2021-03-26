package pr10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pr10.HarryPotter.HarryPotter;
import pr10.HarryPotter.RonWeesly;
import pr10.HarryPotter.Voldemort;

@Configuration
public class BeanConfig {
    @Bean
    public HarryPotter harrypotter() {
        return new HarryPotter();
    }

    @Bean
    public RonWeesly ronweesly() {
        return new RonWeesly();
    }

    @Bean
    public Voldemort voldemort() {
        return new Voldemort();
    }
}
