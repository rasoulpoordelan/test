package games.medrick.medrickestan.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"games.medrick.medrickestan"}
        , basePackageClasses = {Application.class, Jsr310JpaConverters.class})
@ComponentScan("games.medrick.medrickestan")
@EnableJpaRepositories("games.medrick.medrickestan.core.repository.")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
