package practice.divya;

import java.util.Scanner;
public class LearnWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		while(i>=5)
		{
		System.out.println(i);		
i++;
	}
		System.out.println(i);
}}*/


//Do While

		Scanner input=new Scanner(System.in);

		System.out.println("Enter the Value");	
		 int i=input.nextInt();
		
		//int i =0;
		do
		{
			System.out.println(i);
			i++;
			
		}
		while(i<=5);
	}
}



