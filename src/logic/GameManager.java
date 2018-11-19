package logic;

import javafx.scene.layout.Pane;
import scene.GameOver;
import scene.SceneManager;

public class GameManager {
	private static int currentScore;
	
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
	
	private static void spawnObject() {
/*		 Rectangle rect = new Rectangle(40, 40, Color.RED);
		 rect.setTranslateY((int)(Math.random()*14)*40);
*/
	}
	
	public static int getCurrentScore() {
		return currentScore;
	}
}
