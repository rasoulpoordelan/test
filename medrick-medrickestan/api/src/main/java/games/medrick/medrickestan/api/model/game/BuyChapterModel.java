package games.medrick.medrickestan.api.model.game;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class BuyChapterModel {
    private long playerId;
    private long chapterId;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public long getChapterId() {
        return chapterId;
    }

    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }
}
