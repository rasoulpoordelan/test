package games.medrick.medrickestan.core.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

@Entity
@Table(name = "player_device")
public class PlayerDevice {

    public PlayerDevice() {
        this.joinDate = LocalDate.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", foreignKey = @ForeignKey(name = "FK_PLAYERDEVICE_PLAYE"), nullable = false)
    private Player player;

    @Column(name = "udid", length = 100, unique = true)
    private String udid;

    @Column(name = "client_version")
    private int clientVersion;

    @Column(name = "join_date")
    protected LocalDate joinDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "market_id", foreignKey = @ForeignKey(name = "FK_PLAYERDEVICE_MARKET"))
    private Market market;

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

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public int getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(int clientVersion) {
        this.clientVersion = clientVersion;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
}
