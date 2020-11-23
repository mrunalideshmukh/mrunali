//Pyramid_pattern_2
public class Pyramid_pattern_2 {

	public static void main(String[] args) {
		
			int rows=9;
		
		System.out.println("");
		
		for(int i=1; i<=rows; i++){
		   for(int j=0; j<rows-i; j++){
		       System.out.print(" ");
		}
		for(int k=1; k<=i; k++){
		       System.out.print(k+" ");
		}
		System.out.print("\n");
		}
	}

}
