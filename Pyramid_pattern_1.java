 // Pyramid_pattern_1
public class Pyramid_pattern_1
{

	public static void main(String[] args) 
    {
	
	
		int rows=17;
		
		for (int i=1; i<=rows; i++){
		  for (int j=1; j<=rows; j++){
		  System.out.print(" ");
		  }
		 rows--;
		for (int k=1; k<=i; k++){
		  System.out.print(i+" ");           
		}                                               
		System.out.println();
		}
		                                                   
	}

}


