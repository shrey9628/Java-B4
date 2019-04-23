package callbyvaluedemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		changeInt(a);
		System.out.println(a);
		int arr[]= new int[10];
		changeArr(arr);
		

	}
	public static void changeInt(int x)
	{
		x=x+10;
	}
	public static void changeArr(int[] arr1)
	{
		
	}

}
