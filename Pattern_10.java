//Hollow inverted half pyramid
public class Pattern_10
{
    public static void main(String[] args)
    {

	int n=6;
	for(int i=n;i>0;i--)
             {
	              if(i==1 || i==n)
                       for(int j=1;j<=i;j++)
                         {
                              System.out.print("*");
                         }
                   else
	           {
                       for(int j=1;j<=i;j++)         
                          {  
                          	if(j==1 || j==i)
                              System.out.print("*");
                              else
                               System.out.print(" ");
                          }
                }
                     System.out.println();   
               }             
    }
}
