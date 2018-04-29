package games.medrick.medrickestan.service;

import games.medrick.medrickestan.core.model.game.BaseData;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public interface GameService {
    BaseData baseData(int clientVersion, short market);

    void buyChapter(long playerId, long chapterId);

    short setProgress(long playerId, long chapterId, short progress);
}
