//Pyramid pattern5
public class Pattern_3{
public static void main(String args[]){

int rows=9;
System.out.println(" ");

 
int i,j;
for(i=rows; i>=1; i-- ){

 for(j=1; j<=i*2; j++){
 System.out.print(" ");
 }
 for(j=i; j<=rows; j++){
 System.out.print(j+" ");
 }
for(j=rows-1; j>=i; j--){
 System.out.print(j+" "); 
 }
  System.out.println();
 
 }
 
}
}
