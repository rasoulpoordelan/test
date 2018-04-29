package games.medrick.medrickestan.service.impl;


import games.medrick.medrickestan.core.entity.Chapter;
import games.medrick.medrickestan.core.entity.Player;
import games.medrick.medrickestan.core.entity.PlayerChapter;
import games.medrick.medrickestan.core.model.game.*;
import games.medrick.medrickestan.core.repository.*;
import games.medrick.medrickestan.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PlayerChapterRepository playerChapterRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    ChapterRepository chapterRepository;

    @Autowired
    GenreRepository genreRepository;

    @Override
    public BaseData baseData(int clientVersion, short market) {
        BaseData result = new BaseData();

        result.setGenres(genreRepository.findAll().stream().map(g -> new GenreInfo(g.getId(), g.getName())).collect(Collectors.toList()));

        result.setBooks(bookRepository.findAll().stream().map(b ->
                new BookInfo(
                        b.getId()
                        , b.getName()
                        , b.isClose()
                        , new String[]{b.getCoverImageUrl(), b.getPreviewImageUrl(), b.getLoadingImageUrl()}
                        , b.getChapters().stream().map(c -> new ChapterInfo(c.getId()
                        , c.getName()
                        , c.getSummery()
                        , c.getReleaseDate()
                        , new AuthorInfo(c.getAuthor().getId(), c.getAuthor().getNickName())
                        , c.getGemPrice()
                        , c.getGoldPrice()
                )).collect(Collectors.toList())
                        , b.getGenres().stream().map(g -> g.getGenre().getId()).collect(Collectors.toList())
                        , b.getEsra())
        ).collect(Collectors.toList()));

        return result;
    }

    @Override
    public void buyChapter(long playerId, long chapterId) {
        Player player = playerRepository.getOne(playerId);
        Chapter chapter = chapterRepository.getOne(chapterId);
        PlayerChapter playerChapter = playerChapterRepository.findByPlayerAndChapter(player, chapter);

        if (playerChapter == null) {
            playerChapter = new PlayerChapter();
            playerChapter.setPlayer(player);
            playerChapter.setChapter(chapter);

            playerChapterRepository.save(playerChapter);
        }
    }

    @Override
    public short setProgress(long playerId, long chapterId, short progress) {
        Player player = playerRepository.getOne(playerId);
        Chapter chapter = chapterRepository.getOne(chapterId);
        PlayerChapter playerChapter = playerChapterRepository.findByPlayerAndChapter(player, chapter);
        //playerChapter.setProgress(progress);
        playerChapterRepository.save(playerChapter);

        return playerChapter.getProgress();
    }
}
