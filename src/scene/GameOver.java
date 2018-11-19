package scene;

import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class GameOver extends Pane {
	private final double BTN_WIDTH = 75;
	private final double BTN_HEIGHT = 75;
	private static Font headFont = Font.font("Monospace", FontWeight.BOLD,36);
	private static Font bodyFont = Font.font("Monospace", FontWeight.BOLD,24);
	private Canvas bgCanvas = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
	private Canvas replayBtn;
	private Canvas homeBtn;
	private Canvas field, gameOverLabel, result;
	private int score;
	
	public GameOver(int score) {
		this.score = score;
		
//		GraphicsContext gc = bgCanvas.getGraphicsContext2D();
//		gc.drawImage(ResLoader.GameOverImg, 0, 0, SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
//		getChildren().add(bgCanvas);
		
		GraphicsContext gc = bgCanvas.getGraphicsContext2D();
//		gc.drawImage(ResLoader.GameOverImg, 0, 0, SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
		getChildren().add(bgCanvas);
		
		gameOverLabel = new Canvas(SceneManager.SCENE_WIDTH,200);
		GraphicsContext gc2 = gameOverLabel.getGraphicsContext2D();
		
		gc2.setFont(headFont);
		gc2.setFill(Color.WHITE);
		gc2.setTextBaseline(VPos.CENTER);
		gc2.setTextAlign(TextAlignment.CENTER);
		gc2.fillText("GAME OVER", SceneManager.SCENE_WIDTH/2, 100);
		
//		changeCenter(gameOverLabel, 0, 0);
		getChildren().add(gameOverLabel);
		
	}
	
	private void showResult(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		gc.setFill(Color.BLACK);
		gc.setFont(bodyFont);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.setTextBaseline(VPos.CENTER);
		gc.fillText("SCORE",canvas.getWidth()/2, 25);
		gc.fillText(""+score, canvas.getWidth()/2, 75);
		
	}
}
