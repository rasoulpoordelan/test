package games.medrick.medrickestan.core.model.game;

import java.util.ArrayList;
import java.util.List;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class BaseData {

    public BaseData() {
        books = new ArrayList<>();
    }

    private List<GenreInfo> genres;

    private List<BookInfo> books;

    public List<GenreInfo> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreInfo> genres) {
        this.genres = genres;
    }

    public List<BookInfo> getBooks() {
        return books;
    }

    public void setBooks(List<BookInfo> books) {
        this.books = books;
    }
}
