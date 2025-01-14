import java.util.Arrays;
import java.util.Scanner;


/******************************************************************************

Array:- Array is a collection of similar data type that can store in a single variable.

Syntax:- type[] arrayName = new tye[size];

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {


		/**
		 *
		 * Syntax:- type[] arrayName = new tye[size];
		 *
		**/

// 		int[] marks = new int[4];
// 		int marks[] = new int[4];
// 		marks[0] = 89;
// 		marks[1] = 99;
// 		marks[2] = 75;
// 		marks[3] = 49;


// 		System.out.println(marks[0]);
// 		System.out.println(marks[1]);
// 		System.out.println(marks[2]);


// 		int n = marks.length;
// 		for(int i = 0; i<n; i++) {
// 			System.out.println(marks[i]);
// 		}


		/******************************************/

// 		int marks[] = {78, 89, 56, 54, 88};
// 		System.out.println(Arrays.toString(marks));


		/********************* taking size from the user *********************/

// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the lenth of Arrays: ");
// 		int size = sc.nextInt();

// 		int numbers[] = new int[size];

// 		for(int i = 0; i<=size; i++) {
// 			System.out.println(numbers[i]);
// 		}


		/******************* taking input from the user *****************/

		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int numbers[]  = new int[size];

		// Input
		for(int i = 0; i<size; i++ ) {
			numbers[i] = sc.nextInt();
		}

		// output
		int sum = 0;
		System.out.println("Entered arrays: ");
		for(int i = 0; i<size; i++) {
			System.out.println(i + ". " + numbers[i]+ '\t');
			sum = sum + numbers[i];
		}
		System.out.println("Sum of array: = " + sum);

		*/



		/***************************************************
		 * Take an array as input from the user and search for the given
		 * number x and print the index at  at wwhich it occurs.
		****************************************************/

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int num[] = new int[size];

		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Printed arrays: ");
		for(int i = 0; i<num.length; i++){
		    System.out.print(num[i] + "\t");
		}
		
		System.out.print("Enter any value of array: ");
		int x = sc.nextInt();
		for(int i = 0; i<num.length; i++){
		    if(num[i] == x){
		        System.out.println(x + " is placed at = " + i );
		    }
		}



// ==================== Comound Interest ===================

			Scanner sc=new Scanner(System.in);

		System.out.print("enter the principal amount : ");
		int p=sc.nextInt();

		System.out.print("enter the rate of interest per annum : ");
		int r=sc.nextInt();

		System.out.print("enter the years money is submitted: ");
		int n=sc.nextInt();

// 		double rate = r/100.0;
		double result= p * Math.pow(1 + r/100.0, n);

		System.out.println("The Compoo=und interest of " + p +" is = " +  Math.round(result) );

		





















	}
}
