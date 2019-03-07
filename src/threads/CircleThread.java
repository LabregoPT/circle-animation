package threads;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.Ball;
import ui.Controller;

public class CircleThread extends Thread {
	private boolean active;
	private Ball circle;
	private Circle guiCircle;
	private Controller gui;
	
	public CircleThread(int r, int x, int y, Controller g, Circle guiC) {
		if((int)Math.random()%2==0) {
			circle = new Ball(r, 1, x, y);
		}else {
			circle = new Ball(r, -1, x, y);
		}
		gui = g;
		guiCircle = guiC;
	}
	
	public void run() {
		while(active) {
			gui.move(guiCircle, circle.getStatus());
		}
	}
	
	public void setActivity(boolean a) {
		active = a;
	}
}
