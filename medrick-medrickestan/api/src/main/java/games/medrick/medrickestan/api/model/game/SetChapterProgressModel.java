package games.medrick.medrickestan.api.model.game;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class SetChapterProgressModel {
    private long playerId;
    private long chapterId;
    private short progress;

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

    public short getProgress() {
        return progress;
    }

    public void setProgress(short progress) {
        this.progress = progress;
    }
}
