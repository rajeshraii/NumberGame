package com.example.gameapp.repository;
import com.example.gameapp.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GameRepository extends JpaRepository<Game, Long> {}