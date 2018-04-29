package games.medrick.medrickestan.core.model.game;

import games.medrick.medrickestan.core.constant.Esra;

import java.util.ArrayList;
import java.util.List;

/**
 * created by behroozbahrameh on 2/16/18
 **/

public class BookInfo {

    public BookInfo() {
        chapters = new ArrayList<>();
    }

    public BookInfo(long id
            , String name
            , boolean close
            , String[] images
            , List<ChapterInfo> chapters
            , List<Short> genres
            , Esra esra) {
        this.id = id;
        this.name = name;
        this.close = close;
        this.images = images;
        this.chapters = chapters;
        this.genres = genres;
        this.esra = esra;
    }

    private long id;

    private String name;

    private boolean close;

    private Esra esra;

    private String[] images;

    private List<ChapterInfo> chapters;

    private List<Short> genres;

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

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public Esra getEsra() {
        return esra;
    }

    public void setEsra(Esra esra) {
        this.esra = esra;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }


    public List<ChapterInfo> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterInfo> chapters) {
        this.chapters = chapters;
    }

    public List<Short> getGenres() {
        return genres;
    }

    public void setGenres(List<Short> genres) {
        this.genres = genres;
    }
}
