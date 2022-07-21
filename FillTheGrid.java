import java.util.*;
import java.lang.*;
import java.io.*;

public class FillTheGrid {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		while(t-->0)
		{
		  int n=s.nextInt();
		  int m=s.nextInt();
		  
		  if(n==1 || m==1)
		  {
		      System.out.println(n*m);
		  }
		  else if(n==1 && m==1)
		  {
		    System.out.println(1);   
		  }
		  else if(n%2==0 && m%2==0)
		  {
		  System.out.println(0);
		  }
		  else if(n%2!=0 && m%2!=0)
		  {
		   System.out.println(n+m-1);   
		  }
		  else if(n%2==0 && m%2!=0)
		  {
		      System.out.println(n); 
		  }
		  else
		  {
		      System.out.println(m); 
		  }
		  
		}
	}
}
