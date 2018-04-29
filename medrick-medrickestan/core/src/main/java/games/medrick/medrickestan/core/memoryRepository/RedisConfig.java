package games.medrick.medrickestan.core.memoryRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/

@Configuration
public class RedisConfig {

    //    @Value("${core.jedis_host}")
    private String jedisHost;

    //    @Value("${core.jedis_port}")
    private int jedisPort;

    @Bean
    Jedis Jedis() {
        return new Jedis("localhost", 6380);
    }
}
