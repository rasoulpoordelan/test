package games.medrick.medrickestan.core.repository;

import games.medrick.medrickestan.core.entity.Player;
import games.medrick.medrickestan.core.repository.extend.PlayerRepositoryExtend;
import org.springframework.stereotype.Repository;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Repository
public interface PlayerRepository extends BaseRepository<Player, Long>, PlayerRepositoryExtend {
}
