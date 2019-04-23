package centi;

import java.util.Arrays;
import java.util.Scanner;

public class centi {

	public static void main(String[] args) 
	{
	 
		int avg =0; int sum=0; int k=0; 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		
		
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int gv = sc.nextInt();
		int c[] = new int[20];
		for(int i=0;i<n;i++)
		{
			if(a[i]!=gv)
			{
				c[k]=a[i];
				k++;
				
			}	
		}
		
for(int i=0;i<n;i++)
{
	for(int j=i;j<n;j++)
	{
		
	if(c[i]>c[j])
	{
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
	}
}
		for(int i=1;i<=k;i++)
		{
		
		System.out.println(c[i]);
	      }
	}

}
