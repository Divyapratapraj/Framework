package practice.divya;

import java.util.Scanner;

public class SumSum {
	public static void main (String[] args)  
    { 

	int intArr[]= {5,6,7};
	/*for(int i=0;i<intArr.length;i++)
	{
		System.out.println("Element at"+i+"is"+intArr[i]);
	

	 */
	for(int i=0;i<=intArr.length;i++)
	{
	if(i%2 == 0)
	{
		System.out.println(("Element at even position"+i+"is"+intArr[i]));
	}
	else {
		System.out.println("Element at odd place"+i+"is"+intArr[i]);
	}
}

}}