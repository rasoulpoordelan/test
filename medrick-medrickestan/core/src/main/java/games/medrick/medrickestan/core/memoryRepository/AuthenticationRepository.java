package games.medrick.medrickestan.core.memoryRepository;

public interface AuthenticationRepository {

    void save(Long id, String token);

    long getUser(String token);
}
