package model;

public class Ball {
	private int radius;
	private int status;
	private int xCoordinate;
	private int yCoordinate;
	
	public Ball(int r, int s, int x, int y) {
		radius = r;
		status = s;
		xCoordinate = x;
		yCoordinate = y;
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
	
	public int getRadius() {
		return radius;
	}
}
