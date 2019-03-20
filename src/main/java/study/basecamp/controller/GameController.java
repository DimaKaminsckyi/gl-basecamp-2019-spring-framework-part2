package study.basecamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.basecamp.service.GameService;
import study.basecamp.wire.NumberResponse;


@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){this.gameService = gameService;}

    @GetMapping("/{number}")
    public ResponseEntity<NumberResponse> getNumber(@PathVariable int number){
        NumberResponse body = new NumberResponse();
        body.setResponse(gameService.isGameWon(number));
        return ResponseEntity.ok(body);
    }
}
