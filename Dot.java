package dotlab;


public class Dot 
{
	private static String[] 	LEGAL_COLOR_NAME = {
		"RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
	};
	int X;
	int Y;
	int radius;
	String colorName;

public Dot (String colorName, int X, int Y, int radius) {
this.colorName = colorName;
this.X = X;
this.Y = Y;
this.radius = radius;
	int exists = 0;
	for (int i =0; i<LEGAL_COLOR_NAME.length;i++)
		if(colorName.equals(LEGAL_COLOR_NAME[i])){
			exists++;
if(exists == 0) {
	throw new IllegalArgumentException (colorName + "is not an elligible color name");
		}
		}
}

public String getColorName() {
	return colorName;
}
public int getX() {
	return X;
}
public int getY() {
	return Y;
}
public int getRadius() {
	return radius;
}

public String toString() {
	return colorName + X + Y + radius;
}
public static void main(String[] args){
	Dot dot1 = new Dot("Blue", 2,3,5);
System.out.println(dot1.toString());
}
}


