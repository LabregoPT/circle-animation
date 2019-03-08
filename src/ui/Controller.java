package ui;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.*;
import threads.*;
import model.Ball;

public class Controller {
	
	@FXML
	private Pane containerPane;
	
	private List<Circle> circles;
	private List<CircleThread> threads;

	
	@FXML
	void initialize() {
		circles = new ArrayList<Circle>();
		threads = new ArrayList<CircleThread>();
	}
	
	@FXML
	void createCircle(MouseEvent m) {
		Random rnd = new Random();
		Color color = new Color(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),1);
		Circle c = new Circle(m.getSceneX(), m.getSceneY(), 25.0, color);
		circles.add(c);
		CircleThread ct = new CircleThread(25, (int)m.getSceneX(), (int)m.getSceneY(),this, c);
		threads.add(ct);
		containerPane.getChildren().add(c);
		ct.start();
	}
	
	public void move(Circle c, int status, CircleThread t) {
		c.setLayoutX(5*status+c.getLayoutX());
		if(c.getLayoutX()+c.getRadius() == containerPane.getMaxWidth()) {
			t.turnCircle();
		}
		if(c.getLayoutX() == 0) {
			t.turnCircle();
		}
	}
	
	public List<Circle> getCircles(){
		return circles;
	}
	
}
