package games.medrick.medrickestan.core.memoryRepository.impl;

import games.medrick.medrickestan.core.memoryRepository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

@Repository
public class AuthenticationRepositoryImpl implements AuthenticationRepository {

    @Autowired
    private Jedis jedis;

    @Override
    public void save(Long id, String token) {
        String oldToken = jedis.hget("USER_TOKEN", id.toString());

        if (!StringUtils.isEmpty(oldToken)) {
            jedis.hdel("TOKEN_USER", oldToken);
        }

        jedis.hset("USER_TOKEN", id.toString(), token);
        jedis.hset("TOKEN_USER", token, id.toString());
    }

    @Override
    public long getUser(String token) {
        String sid = jedis.hget("TOKEN_USER", token);

        if (StringUtils.isEmpty(sid))
            return 0;

        return Long.parseLong(sid);
    }
}
