public class CellularData	{

	private int startingYear;
	private int rows = 4;
	private int columns = 100;
	
	public CellularData()	{
	}
	
	public CellularData(int numOfRows, int numOfColumns, int startingYear)	{
		this.rows = numOfRows;
		this.columns = numOfColumns;
		this.startingYear = startingYear;
	}

	Object[] header = new Object[columns]; 		//Single array for header.
	Object[][] anArray = new Object[rows][columns];  //this is an array of Object class

	/**
	 *  creates a header of 1D array for the 2D array with country and years	
	 *  **/
	 //*************************************************************************
	void printHeader(CellularData x)	{
		System.out.print(x.header[0] = "Country" + "\t"); 
		for(int i = 1; i <= x.header.length - 1; i++)	{
			System.out.print(x.header[i] = x.startingYear++ + "\t");
		}
		System.out.println();
	} //end of method printHeader
	
	//*************************************************************************
	public Object[][] addCountry(double[] a, String country, int rowNumber)	{ //method needs closing bracket
			anArray[rowNumber][0] = country;
			for (int i = 0; i <= a.length - 1; i++)	{
				anArray[rowNumber][i + 1] = a[i];
			}
			return anArray;
		} 
//*****************************************************************************	
	public double getNumSubscriptionsInCountryForPeriod(double a[])	{
		double temp = 0.0;
		for (int i = 1; i <= a.length -1; i++)	{
			temp = temp + a[i];
		}
		 return temp;
	}

//*****************************************************************************
	public String toString()	{ //this works to override java.lang.Object.toString
		String output = "";
		for(int i = 0; i <= anArray.length - 1; i++)	{
			for(int j = 0; j <= anArray[i].length - 1; j++)	{  //ROWS
				output += (anArray[i][j] + "\t");
			}
		output += "\n";
		}                                       // which all subclasses inherit from
		return output;
	}// end of method printArray

}