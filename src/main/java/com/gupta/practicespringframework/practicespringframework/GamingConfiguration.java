package com.gupta.practicespringframework.practicespringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gupta.practicespringframework.practicespringframework.game.GameRunner;
import com.gupta.practicespringframework.practicespringframework.game.GamingConsole;
import com.gupta.practicespringframework.practicespringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
     @Bean
     public GamingConsole game() {
    	 var game=new PacmanGame();
    	 return game;
     }
     
     @Bean
     public GameRunner gameRunner() {
    	 var gameRunner=new GameRunner(game());
    	 return gameRunner;
     }
}
