package scene;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneManager {
	private static Stage primaryStage;
	public static final double SCENE_WIDTH = 1200;
	public static final double SCENE_HEIGHT = 600;
	
	private static Pane mainMenu = new MainMenu();
	private static Scene mainMenuScene = new Scene(mainMenu,SCENE_WIDTH,SCENE_HEIGHT);
	
	public static void enterMainMenu() {
		primaryStage.setScene(mainMenuScene);
	}
	
	public static void enterGame() {
		
	}
	
	public static void changeSceneTo(Pane pane) {
//			ResLoader.bgmSound.stop();
//			ResLoader.bgmSound.play();
			Scene nextScene = new Scene(pane,SCENE_WIDTH,SCENE_HEIGHT);
			primaryStage.setScene(nextScene);
	}
				
}
