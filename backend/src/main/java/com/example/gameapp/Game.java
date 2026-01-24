package com.example.gameapp.model;
import jakarta.persistence.*;

@Entity
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numberToGuess;
    private int attempts;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getNumberToGuess() { return numberToGuess; }
    public void setNumberToGuess(int numberToGuess) { this.numberToGuess = numberToGuess; }
    public int getAttempts() { return attempts; }
    public void setAttempts(int attempts) { this.attempts = attempts; }
}