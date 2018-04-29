package games.medrick.medrickestan.core.entity;

import games.medrick.medrickestan.core.constant.Esra;
import games.medrick.medrickestan.core.constant.convertor.EsraConverter;

import javax.persistence.*;
import java.util.Set;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "cover_image_url", length = 100)
    private String coverImageUrl;

    @Column(name = "preview_image_url", length = 100)
    private String previewImageUrl;

    @Column(name = "loading_image_url", length = 100)
    private String loadingImageUrl;

    @Column(name = "close")
    private boolean close;

    @Enumerated(EnumType.ORDINAL)
    //@Convert(converter = EsraConverter.class)
    private Esra esra;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private Set<Chapter> chapters;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private Set<BookGenre> genres;

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

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getPreviewImageUrl() {
        return previewImageUrl;
    }

    public void setPreviewImageUrl(String previewImageUrl) {
        this.previewImageUrl = previewImageUrl;
    }

    public String getLoadingImageUrl() {
        return loadingImageUrl;
    }

    public void setLoadingImageUrl(String loadingImageUrl) {
        this.loadingImageUrl = loadingImageUrl;
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

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Set<BookGenre> getGenres() {
        return genres;
    }

    public void setGenres(Set<BookGenre> genres) {
        this.genres = genres;
    }
}
