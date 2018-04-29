package games.medrick.medrickestan.api.controller;

import games.medrick.medrickestan.api.model.game.BuyChapterModel;
import games.medrick.medrickestan.api.model.game.SetChapterProgressModel;
import games.medrick.medrickestan.api.utils.ResponseHelper;
import games.medrick.medrickestan.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(method = RequestMethod.GET, value = "/game/base")
    public ResponseEntity baseEntity(@RequestParam(value = "clientVersion") int clientVersion
            , @RequestParam(value = "market") short market) {

        return ResponseHelper.response(gameService.baseData(clientVersion, market));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/game/chapter/buy")
    public ResponseEntity buyChapter(@RequestBody BuyChapterModel model) {
        gameService.buyChapter(model.getPlayerId(), model.getChapterId());

        return ResponseHelper.response(true);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/game/chapter/progress")
    public ResponseEntity progress(@RequestBody SetChapterProgressModel model) {
        return ResponseHelper.response(gameService.setProgress(
                model.getPlayerId()
                , model.getChapterId()
                , model.getProgress()));
    }
}
