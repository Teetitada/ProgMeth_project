package scene;

import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;

public class ResLoader {
	
	public static Image salmonSushi, kanikama, tempura, tamago, ikura, rottenSushi, wasabi;
	public static Image MenuImg, PlayBtn1, PlayBtn2;
	public static Image GameOverImg, ReplayBtn1, ReplayBtn2, HomeBtn1, HomeBtn2;
	public static Image hand;
	
	public static AudioClip bgmSound, inGameSound, endGameSound;
	
	public static void loadResorce() {

		MenuImg = new Image(ClassLoader.getSystemResource("image/MainBG.jpg").toString());
		PlayBtn1 = new Image(ClassLoader.getSystemResource("image/PlayBtn1.png").toString());
		PlayBtn2 = new Image(ClassLoader.getSystemResource("image/PlayBtn2.png").toString());
		
		GameOverImg = new Image(ClassLoader.getSystemResource("image/BG3.jpg").toString());
		ReplayBtn1 = new Image(ClassLoader.getSystemResource("image/ReplayBtn1.png").toString());
		ReplayBtn2 = new Image(ClassLoader.getSystemResource("image/ReplayBtn2.png").toString());
		HomeBtn1 = new Image(ClassLoader.getSystemResource("image/HomeBtn1.png").toString());
		HomeBtn2 = new Image(ClassLoader.getSystemResource("image/HomeBtn2.png").toString());
		
		salmonSushi = new Image(ClassLoader.getSystemResource("image/SalmonSushi.jpg").toString());
		kanikama = new Image(ClassLoader.getSystemResource("image/Kanikama.jpg").toString());
		tempura = new Image(ClassLoader.getSystemResource("image/Tempura.jpg").toString());
		tamago = new Image(ClassLoader.getSystemResource("image/Tamago.jpg").toString());
		ikura = new Image(ClassLoader.getSystemResource("image/Ikura.jpg").toString());
		rottenSushi = new Image(ClassLoader.getSystemResource("image/RottenSushi.jpg").toString());
		wasabi = new Image(ClassLoader.getSystemResource("image/Wasabi.jpg").toString());
		
		hand = new Image(ClassLoader.getSystemResource("image/Hand.jpg").toString());
		
		bgmSound = new AudioClip(ClassLoader.getSystemResource("sound/bgm.mp3").toString());
		inGameSound = new AudioClip(ClassLoader.getSystemResource("sound/bgm.mp3").toString());
		endGameSound = new AudioClip(ClassLoader.getSystemResource("sound/bgm.mp3").toString());
		
		bgmSound.setVolume(0.15);
		inGameSound.setVolume(0.15);
		endGameSound.setVolume(0.15);
	}
}
