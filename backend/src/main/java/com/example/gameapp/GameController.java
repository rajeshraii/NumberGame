package com.example.gameapp.controller;
import com.example.gameapp.model.Game;
import com.example.gameapp.service.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
@CrossOrigin
public class GameController {
    private final GameService service;
    public GameController(GameService service) { this.service = service; }

    @PostMapping("/start")
    public Game startGame() { return service.createGame(); }

    @PostMapping("/guess/{id}")
    public String guess(@PathVariable Long id,@RequestParam int number){
        return service.guessNumber(id,number);
    }
}