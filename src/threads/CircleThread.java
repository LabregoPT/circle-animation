package threads;

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
			circle = new Ball(Ball.RIGHT, x, y);
		}else {
			circle = new Ball(Ball.LEFT, x, y);
		}
		gui = g;
		guiCircle = guiC;
		active = true;
	}
	
	public void run() {
		while(active) {
			gui.move(guiCircle, circle.getStatus(), this);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void turnCircle() {
		circle.setStatus();
	}
	
	public void setActivity(boolean a) {
		active = a;
	}
}
