package com.gupta.practicespringframework.practicespringframework.game;

public class GameRunner {
//  MarioGame game;
private	GamingConsole game;
  public GameRunner(GamingConsole  game) {
	  this.game=game;
  }
  public void run() {
	  System.out.println("running ");
	  game.up();
	  game.down();
	  game.left();
	  game.right();
  }
}
