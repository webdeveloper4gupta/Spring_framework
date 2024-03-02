package com.gupta.practicespringframework.practicespringframework;

import com.gupta.practicespringframework.practicespringframework.game.GameRunner;
import com.gupta.practicespringframework.practicespringframework.game.MarioGame;
import com.gupta.practicespringframework.practicespringframework.game.PacmanGame;
import com.gupta.practicespringframework.practicespringframework.game.SuperContraGame;

public class App01GamingBasicJava {
     public static void main(String[] args) {
//		var game=new MarioGame();
    	 var game =new PacmanGame();
//    	 var game=new SuperContraGame();
		var gameRunner=new GameRunner(game);
		gameRunner.run();
    	 
	}
}
