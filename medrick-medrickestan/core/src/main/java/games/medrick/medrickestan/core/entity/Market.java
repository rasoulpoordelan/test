package games.medrick.medrickestan.core.entity;


import games.medrick.medrickestan.core.constant.Platform;

import javax.persistence.*;

@Entity
@Table(name = "market")
public class Market {
    @Id
    @Column(name = "id")
    private short id;

    @Column(name = "name", unique = true, length = 50)
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "platform")
    private Platform platform;

    public Market() {
    }

    public Market(short id) {
        this.id = id;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

}
