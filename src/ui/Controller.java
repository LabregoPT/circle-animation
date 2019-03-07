package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import java.util.*;
import threads.*;

public class Controller {
	
	@FXML
	private Pane containerPane;
	
	@FXML
	private Button mainButton;
	
	@FXML
	private Circle initCircle;
	
	private List circles;
	private List threads;
	
	@FXML
	void startAnim(ActionEvent e) {
		
	}
	
	@FXML
	void initialize() {
		circles = new ArrayList<Circle>();
		threads = new ArrayList<CircleThread>();
	}
	
	@FXML
	void createCircle(MouseEvent m) {
		
	}
	
	public void move(Circle c, int status) {
		
	}
	
}
