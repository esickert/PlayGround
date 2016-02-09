public class CellularData	{

	int beginYear = 1980;
	int endYear = 1987;
    int num = 1880;
    
    Object[] header = new Object[8]; 		//Single array for header.
	Object[][] anArray = new Object[5][8];  //this is an array of Object class
	
	CellularData()	{
	}

	/**
	 *  creates a header of 1D array for the 2D array with country and years	
	 *  **/
	 
	void printHeader(CellularData x)	{
		System.out.print(x.header[0] = "Country" + "\t"); 
		for(int i = 1; i <= x.header.length - 1; i++)	{
			System.out.print(x.header[i] = x.beginYear++ + "\t");
		}
		System.out.println();
	} //end of method printHeader
	

	public String toString()	{ //this works
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