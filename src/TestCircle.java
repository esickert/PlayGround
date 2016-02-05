//import java.util.*;

public class TestCircle   {

    public static void main(String[] args)  {

        Cylinder x = new Cylinder();
        int year = 1980; 

        System.out.println(x.getRadius() + " getRadius is in the Circle class\n");
//       System.out.println(x.getLength());
        System.out.println(x.findArea() + "\n");
        
//******************************************************************************        
//     test[rows][columns]

// NOTE: we are using an array of Object (THE OBJECT CLASS) 
	   x.anArray[0][0] = "Country"; 
//	   System.out.println(x.anArray[0][0]);
	   x.anArray[1][1] = 0.123;
	   x.anArray[2][4] = 0.043;
	   

	   for(int i = 1; i <= x.anArray.length - 1; i++)	{
	       System.out.print(x.anArray[0][i] = year++ + "\t"); //"Country" is getting over written
	   } 
	   System.out.println("\n");
	    
      for(int i = 1; i <= x.anArray.length - 1; i++)	{ //COLUMNS Cylinder uses the array defined in Circle
           for(int j = 0; j <= x.anArray[i].length - 1; j++)	{  //ROWS
       		     System.out.print(x.anArray[i][j] + "\t");   
           }
           System.out.println();
       }  
//****************************************************************************** 
         
    }
}
