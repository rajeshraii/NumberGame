package com.example.gameapp.service;
import com.example.gameapp.model.Game;
import com.example.gameapp.repository.GameRepository;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class GameService {
    private final GameRepository repo;
    private final Random random = new Random();
    public GameService(GameRepository repo) { this.repo = repo; }
    public Game createGame() {
        Game game = new Game();
        game.setNumberToGuess(random.nextInt(100)+1);
        game.setAttempts(0);
        return repo.save(game);
    }
    public String guessNumber(Long gameId,int guess) {
        Game game = repo.findById(gameId).orElseThrow();
        game.setAttempts(game.getAttempts()+1);
        if(guess<game.getNumberToGuess()) return save(game,"Higher");
        if(guess>game.getNumberToGuess()) return save(game,"Lower");
        return save(game,"Correct! Attempts:"+game.getAttempts());
    }
    private String save(Game game,String msg){repo.save(game);return msg;}
}