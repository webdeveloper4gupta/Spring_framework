package com.gupta.practicespringframework.practicespringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gupta.practicespringframework.practicespringframework.game.GameRunner;
import com.gupta.practicespringframework.practicespringframework.game.GamingConsole;
import com.gupta.practicespringframework.practicespringframework.game.MarioGame;
import com.gupta.practicespringframework.practicespringframework.game.PacmanGame;
import com.gupta.practicespringframework.practicespringframework.game.SuperContraGame;

public class App03GamingBasicJava {
     public static void main(String[] args) {
//first of all we launch the spring context
    	 var context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
//    	 System.out.println(context.getBean("game"));
//    	 context.getBean( GamingConsole.class).up();
    	context.getBean(GameRunner.class).run();
	}
}
