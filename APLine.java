
public class APLine {
	private double a;
	private double b;
	private double c;
public APLine(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
		}//end zero argument
public double getSlope() {
	double slope = 0;
	slope = (-1*a)/b;
	return slope;
	}//end getSlope getter

public boolean isOnLine(double x, double y) {
	boolean statement = true;
	double equation = 0.0;
	equation = (a* x)+(b* y) + (c);
		if (equation == 0) {
			statement = true;
		}//end if
		else {
			statement = false;
		}//end else
		return statement;
	}//end method isOnLine
public String toString() {
String output = " ";
output = "The equation of the line is " + a + "x " + b + "y " + c;
return output;

	}//end toString
}//end class
