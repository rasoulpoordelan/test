package games.medrick.medrickestan.core.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

@Entity
@Table(name = "player")
public class Player {

    public Player() {
        this.creationDate = LocalDateTime.now();
        this.gem = 10;
        this.gold = 10;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nick_name", length = 50, nullable = true)
    private String nickName;

    private long gem;

    private long gold;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "player")
    private Set<PlayerDevice> devices = new HashSet<>();

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

    public long getGem() {
        return gem;
    }

    public void setGem(long gem) {
        this.gem = gem;
    }

    public long getGold() {
        return gold;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Set<PlayerDevice> getDevices() {
        return devices;
    }

    public void setDevices(Set<PlayerDevice> devices) {
        this.devices = devices;
    }

    public long[] getWallet() {
        return new long[]{this.gem, this.gold};
    }
}
