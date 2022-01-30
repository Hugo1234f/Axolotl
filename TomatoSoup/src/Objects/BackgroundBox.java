package Objects;

import java.awt.Color;

public class BackgroundBox {

	Color baseColor;
	String boxPath;
	
	
	public BackgroundBox(Color baseColor) {
		this.baseColor = baseColor;
	}
	
	public void setBoxPath(String path) {
		boxPath = path;
	}
	
	public Color getBaseColor() {
		return baseColor;
	}
}
