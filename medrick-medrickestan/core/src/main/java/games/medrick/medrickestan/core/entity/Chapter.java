package games.medrick.medrickestan.core.entity;

import games.medrick.medrickestan.core.constant.ChapterStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * created by Behrooz Bahrame on 2/15/2018
 **/

@Entity
@Table(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", foreignKey = @ForeignKey(name = "FK_CHAPTER_BOOK"))
    private Book book;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "summery", length = 250)
    private String summery;

    @Column(name = "release_date")
    private LocalDateTime releaseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_player_id", foreignKey = @ForeignKey(name = "FK_CHAPTER_AUTHOR_PLAYER"))
    private Player author;

    @Enumerated(EnumType.ORDINAL)
    private ChapterStatus status;

    @Column(name = "gem_price")
    private long gemPrice;

    @Column(name = "gold_price")
    private long goldPrice;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "chapter", cascade = CascadeType.ALL)
    private Set<ChapterData> chapterData;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Player getAuthor() {
        return author;
    }

    public void setAuthor(Player author) {
        this.author = author;
    }

    public ChapterStatus getStatus() {
        return status;
    }

    public void setStatus(ChapterStatus status) {
        this.status = status;
    }

    public long getGemPrice() {
        return gemPrice;
    }

    public void setGemPrice(long gemPrice) {
        this.gemPrice = gemPrice;
    }

    public long getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(long goldPrice) {
        this.goldPrice = goldPrice;
    }

    public Set<ChapterData> getChapterData() {
        return chapterData;
    }

    public void setChapterData(Set<ChapterData> chapterData) {
        this.chapterData = chapterData;
    }
}
