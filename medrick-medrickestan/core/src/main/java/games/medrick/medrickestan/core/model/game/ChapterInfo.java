package games.medrick.medrickestan.core.model.game;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class ChapterInfo {

    public ChapterInfo() {
    }

    public ChapterInfo(
            long id
            , String name
            , String summary
            , LocalDateTime releaseDate
            , AuthorInfo author
            , long gemPrice
            , long goldPrice) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.author = author;
        this.price = new long[]{gemPrice, goldPrice};
        this.releaseDate = releaseDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    private long id;

    private String name;

    private String summary;

    private String releaseDate;

    private AuthorInfo author;

    private long[] price;

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public AuthorInfo getAuthor() {
        return author;
    }

    public void setAuthor(AuthorInfo author) {
        this.author = author;
    }

    public long[] getPrice() {
        return price;
    }

    public void setPrice(long[] price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
