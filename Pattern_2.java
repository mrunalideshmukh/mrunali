//Pyramid pattern4
public class Pattern_2{
public static void main(String args[]){

int rows=9;
System.out.println("");

for(int i=1; i<=rows; i++){
   for(int j=0; j<rows-i; j++){
       System.out.print(" ");

}
for(int k=1; k<i; k++){
       System.out.print(k);

}
for(int l=i; l>=1; l--){
       System.out.print(l);

}
System.out.print("\n");
        }
    }
}