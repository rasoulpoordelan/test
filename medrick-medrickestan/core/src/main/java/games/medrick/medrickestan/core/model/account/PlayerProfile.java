package games.medrick.medrickestan.core.model.account;

import java.util.List;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class PlayerProfile {

    private long id;

    private String nickName;

    private String token;

    private long[] wallet;

    private List<long[]> chapterProgress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long[] getWallet() {
        return wallet;
    }

    public void setWallet(long[] wallet) {
        this.wallet = wallet;
    }

    public List<long[]> getChapterProgress() {
        return chapterProgress;
    }

    public void setChapterProgress(List<long[]> chapterProgress) {
        this.chapterProgress = chapterProgress;
    }
}
