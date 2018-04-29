package games.medrick.medrickestan.core.model.game;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class AuthorInfo {

    public AuthorInfo() {
    }

    public AuthorInfo(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
