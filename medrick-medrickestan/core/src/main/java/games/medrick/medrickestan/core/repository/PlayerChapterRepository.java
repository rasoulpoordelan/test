package games.medrick.medrickestan.core.repository;

import games.medrick.medrickestan.core.entity.Chapter;
import games.medrick.medrickestan.core.entity.Player;
import games.medrick.medrickestan.core.entity.PlayerChapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Repository
public interface PlayerChapterRepository extends JpaRepository<PlayerChapter, Long> {
    Set<PlayerChapter> findAllByPlayer(Player player);

    PlayerChapter findByPlayerAndChapter(Player player, Chapter chapter);
}
