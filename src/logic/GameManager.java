package logic;

import javafx.scene.layout.Pane;
import scene.GameOver;
import scene.SceneManager;

public class GameManager {
	private static int score;
	
	public static void startGame() {
		
	}
	
	public static void update() {
		
	}
	
	public static void scoreUpdate() {
		
	}
	
	public static void gameOver() {
		Pane gameOver = new GameOver(getCurrentScore());
//		Holder.getInstance().reset();
		SceneManager.changeSceneTo(gameOver);
	}
	
	public static int getCurrentScore() {
		return score;
	}
}
