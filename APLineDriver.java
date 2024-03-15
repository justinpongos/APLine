
public class APLineDriver {
	public static void main(String[]args) {
		
		APLine First = new APLine (5, 4, -17);
		double Slope1 = First.getSlope();
		boolean onLine1 = First.isOnLine(5, -2);
			System.out.println(First);
			System.out.println("The slope is " + Slope1);
			System.out.println(onLine1);
			System.out.println("\n");
			
		APLine Second = new APLine (-25, 40, 30);
		double Slope2 = Second.getSlope();
		boolean onLine2 = Second.isOnLine(5, -2);
			System.out.println(Second);
			System.out.println("The slope is " + Slope2);
			System.out.println(onLine2);

	}//end main
}//end class
