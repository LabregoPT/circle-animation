package model;

import javafx.scene.paint.Color;

public class Ball {
	private int radius;
	private int status;
	private int xCoordinate;
	private int yCoordinate;
	private Color color;
	
	public Ball(int r, int s, int x, int y, Color c) {
		radius = r;
		status = s;
		xCoordinate = x;
		yCoordinate = y;
		color = c;
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public int getStatus() {
		return status;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getRadius() {
		return radius;
	}
}
