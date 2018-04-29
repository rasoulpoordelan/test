package games.medrick.medrickestan.core.entity;

import javax.persistence.*;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

@Entity
@Table(name = "player_chapter"
        , uniqueConstraints = @UniqueConstraint(name = "UK_PLAYERCHAPTER_PLAYER_CHAPTER", columnNames = {"player_id", "chapter_id"}))
public class PlayerChapter {

    public PlayerChapter() {
        this.dialogId = 0;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", foreignKey = @ForeignKey(name = "FK_PLAYERCHAPTER_PLAYER"))
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter_id", foreignKey = @ForeignKey(name = "FK_PLAYERCHAPTER_CHAPTER"))
    private Chapter chapter;

    @Column(name = "dialog_id")
    private short dialogId;

    @Column(name = "character_name")
    private String characterName;

    @Column(name = "status")
    private int status;

    @Column(name = "play_time")
    private int playTime;

    @Column(name = "character_id")
    private int characterId;

    @Column(name = "character_body")
    private int characterBody;

    @Column(name = "character_hair")
    private int characterHair;

    @Column(name = "param1")
    private int param1;

    @Column(name = "param2")
    private int param2;

    @Column(name = "param3")
    private int param3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public short getProgress() {
        return dialogId;
    }

    public void setProgress(short progress) {
        this.dialogId = progress;
    }
}
