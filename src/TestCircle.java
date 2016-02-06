//import java.util.*;

public class TestCircle   {

	public static void main(String[] args)  {

		Cylinder x = new Cylinder();
//		int year = 1980;

		System.out.println("Part 1 with Partial Data:");
		final double[] canadaPartial = {0,0,0.05,0.23,0.37,0.75,1.26};
		final double[] mexicoPartial = {0,0,0,0,0,0,0.01};
		final double[] usaPartial = {0,0,0.14,0.28,0.5,0.83,1.39};

		System.out.println(x.getRadius() + " getRadius is in the Circle class\n");
//		System.out.println(x.getLength());
		System.out.println(x.findArea());

//******************************************************************************
// BETWEEN STAR LINES IS TEST CODE FOR BITA 1
//	test[rows][columns]

// NOTE: we are using an array of Object (THE OBJECT CLASS) 

//		System.out.println(x.anArray[0][0]);
		x.anArray[1][1] = 0.123;
		x.anArray[2][4] = 0.043;
		
		x.anArray[0][0] = "Country"; 
		for(int i = 1; i <= x.anArray[0].length - 1; i++)	{
			x.anArray[0][i] = x.year++; 
		}
//		public void insertArray(double[][] a, String country)	{ //method needs closing bracket
			x.anArray[3][0] = "usa";
			for (int i = 0; i <= usaPartial.length - 1; i++)	{
				x.anArray[3][i + 1] = usaPartial[i];
			}
		
		
		System.out.println('\n');
		
		for(int i = 0; i <= x.anArray.length - 1; i++)	{//COLUMNS Cylinder uses the array defined in Circle
			for(int j = 0; j <= x.anArray[i].length - 1; j++)	{  //ROWS
				System.out.print(x.anArray[i][j] + "\t");
			}
			System.out.println();
		}
//****************************************************************************** 

	}
}
