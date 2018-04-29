package games.medrick.medrickestan.core.repository;

import games.medrick.medrickestan.core.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
