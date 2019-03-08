package model;

public class Ball {
	public final static int LEFT = -1;
	public final static int RIGHT = 1;
	
	private int status;
	private int xCoordinate;
	private int yCoordinate;
	
	public Ball(int s, int x, int y) {
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
	
	public void setStatus() {
		status = status*-1;
	}
	
}
