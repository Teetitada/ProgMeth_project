package logic;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.ImageView;
import model.Sushi;
import scene.Animation;
import scene.GameStage;
import model.Entity;

public class Holder {
	
	private static Holder instance = new Holder();
	
	private GameStage gameStage;
	protected Animation animation;
	
	private List<Sushi> sushiPlate;
	
	public Holder() {
		sushiPlate = new ArrayList<>();
		animation = new Animation();
	}
	
	public static Holder getInstance () {
		return instance;
	}
	
	protected void setup() {
		gameStage = new GameStage();
		gameStage.getChildren().add(animation);
	}
	
	protected void reset() {
		gameStage = null;
		sushiPlate.clear();
	}
	
	public GameStage getGameStage() {
		return gameStage;
	}

	public List<Sushi> getSushiPlate() {
		return sushiPlate;
	}
	
	public Animation getAnimation() {
		return animation;
	}
	
}
