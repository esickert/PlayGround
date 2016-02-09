//import java.util.*;

public class TestCircle   {

	static int num = 2080;

	public static void main(String[] args)  {

		CellularData table = new CellularData(); //one instance(object) represents one table
//		TestCircle y = new TestCircle(); //this is an instance of TestCircle

		System.out.println("Part 1 with Partial Data:");
//		final double[] canadaPartial = {0,0,0.05,0.23,0.37,0.75,1.26};
//		final double[] mexicoPartial = {0,0,0,0,0,0,0.01};
//		final double[] usaPartial = {0,0,0.14,0.28,0.5,0.83,1.39};
		final double[] albaniaPartial = {0,0.9014,60.067,73.3,58.912,78.18,85.4682};

//		System.out.println(x.getRadius() + " getRadius is in the Circle class\n");
//		System.out.println(x.getLength());
//		System.out.println(x.findArea());
		tester(111, table);
		System.out.println();
		
//		System.out.println(table);
		

//******************************************************************************
// BETWEEN STAR LINES IS TEST CODE FOR BITA 1
//	test[rows][columns]

// NOTE: we are using an array of Object (THE OBJECT CLASS) 

//		System.out.println(x.anArray[0][0]);
		table.anArray[1][1] = 0.123;
		table.anArray[2][4] = 0.043;

		System.out.println();
//		System.out.println(table);
		
//		public void insertArray(double[][] a, String country)	{ //method needs closing bracket
			table.anArray[3][0] = "albania";
			for (int i = 0; i <= albaniaPartial.length - 1; i++)	{
				table.anArray[3][i + 1] = albaniaPartial[i];
			}
		table.printHeader(table);

		for(int i = 0; i <= table.anArray.length - 1; i++)	{//COLUMNS Cylinder uses the array defined in Circle
			for(int j = 0; j <= table.anArray[i].length - 1; j++)	{  //ROWS
				System.out.print(table.anArray[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n");
		table.printHeader(table);
		System.out.println(table);
	}//end of main
	
//****************************************************************************** 
	
/**	KEYWORD "this" TESTING.    **/ 	
	static void tester(int num, CellularData z)	{
	//no object call with a static method thus no class object(instance). 'this' doesn't work
		System.out.println("Trying to understand the 'this' keyword!!!");
		System.out.println(num + " :method parameter variable");
//		num = this.num;	//this will set the object(instance) variable to the parameter variable
		System.out.println(num + " :line 63???");
//		System.out.println(this.num + " :line 64 instance(object) variable");
//		System.out.println(z.num + " line 65");
//		this.num = num;
//		z.num = this.num;
//		'z' is an instance (object) thus cannot be used in a static method
		System.out.println(num + " :line 67 setting Circle object variable to local instance variable");
	}//end of method tester
} //end of class TestCircle
