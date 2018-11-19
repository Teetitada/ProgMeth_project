package model;

import javafx.scene.canvas.Canvas;

public abstract class Entity {
	protected boolean aliveStatus;
	
	public Canvas canvas;
	
	public Entity() {
		aliveStatus = false;
	}
	
	public boolean stillAlive() {
		return aliveStatus;
	}
	
	abstract void dead();
	
	protected abstract void draw();
}
