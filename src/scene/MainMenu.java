package scene;

import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class MainMenu extends Pane {
	
	private final double BTN_WIDTH = 100;
	private final double BTN_HEIGHT = 100;
	private static Font headFont = Font.loadFont(ClassLoader.getSystemResourceAsStream("font/SPACEBAR.ttf"),40);
	private Canvas playBtn;
	private Canvas menuBG = new Canvas(SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);	

	public MainMenu() {
			
			GraphicsContext gc = menuBG.getGraphicsContext2D();
//			gc.drawImage(ResLoader.MenuImg, 0, 0, SceneManager.SCENE_WIDTH,SceneManager.SCENE_HEIGHT);
			getChildren().add(menuBG);
			
			Canvas MainLabel = new Canvas(SceneManager.SCENE_WIDTH,300);
			
			GraphicsContext gc2 = MainLabel.getGraphicsContext2D();
			
			gc2.setFont(headFont);
			gc2.setFill(Color.WHITE);
			gc2.setTextBaseline(VPos.CENTER);
			gc2.setTextAlign(TextAlignment.CENTER);
			gc2.fillText("Sushi", SceneManager.SCENE_WIDTH/2, 150);
			gc2.strokeText("Sushi", SceneManager.SCENE_WIDTH/2, 150);
			
			
//			changeCenter(MainLabel, 0, 0);
			getChildren().add(MainLabel);
	
//			playBtn = drawButton(ResLoader.PlayBtn1);	
			playBtn.setFocusTraversable(true);
//			addCanvasEvents(playBtn, "Play", ResLoader.PlayBtn1, ResLoader.PlayBtn2);
			
			getChildren().add(playBtn);
//			changeCenter(playBtn, (SceneManager.SCENE_WIDTH-BTN_WIDTH)/2, SceneManager.SCENE_HEIGHT/2);
			
		}
	
	private Canvas drawButton(Image img) {
		Canvas btn = new Canvas(BTN_WIDTH,BTN_HEIGHT);
		GraphicsContext gc = btn.getGraphicsContext2D();
		gc.drawImage(img, 0, 0, BTN_WIDTH,BTN_HEIGHT);
		
		return btn;
	}
	
	private void drawOnMouseEvent(Canvas canvas, Image img) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.drawImage(img, 0, 0, BTN_WIDTH,BTN_HEIGHT);
	}
	
}
