package component;
import java.util.*;

public abstract class Pieces {
	
	Vector coordinates;
	boolean color; 

	public Pieces(Vector newCoordinates, boolean newColor) {
		this.coordinates = newCoordinates;
		this.color = newColor;
	}
	
	public Vector getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Vector coordinates) {
		this.coordinates = coordinates;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

}
