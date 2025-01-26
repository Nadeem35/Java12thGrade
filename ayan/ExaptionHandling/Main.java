// Java Exceptions - Try...Catch
// When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
// When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

// Java try and catch
// The try statement allows you to define a block of code to be tested for errors while it is being executed.
// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
// The try and catch keywords come in pairs:



/*

try{
    //code
}catch(Exception e){
    System.out.print("Explain you Error");
}

*/

//====================== Example - 1  =====================

// public class Main{
// 	public static void main(String[] args) {

// 	    try{
// 	    int arr[] = {1, 2, 3, 4, 5};
// 	    System.out.print(arr[10]);
// 	    }catch(Exception e){
// 	        System.out.println("You are going out of bond.");
// 	    }finally{
// 	        System.out.println("Please correct your code!");
// 	    }

// 	}
// }



//====================== Example - 2  =====================


// public class  Main {

// 	public static int Add(int a, int b) {
// 		return a+b;
// // 		return a-b;
// // 		return a*b;
// // 		return a/b;
// // 		return a%b;
// 	}

// 	public static void main(String[] args) {
// 		try {
// 			System.out.println(Add(12, 35422));
// 		} catch(Exception e) {
// 			System.out.println("Somthing went wrong");
// 		}
// 	}

    
// }



//====================== Example - 3  =====================


public class Main{
    public static void Age(int age){
        if(age < 18){
            throw new ArithmeticException("You are not eligible !");
        }else{
            System.out.println("You are eligible Babu !");
        }
    }
    
    public static void main(String[] args){
        Age(45);  // 
    }
}





//=====================


// public class Main {
// 	public static void main(String[] args) {
// 		int a = 4545;
// 		int b = 15452;

// 		try {
// 			int sum = a+b;
// 			System.out.println(sum);
// 		} catch(Exception e) {
// 			System.out.println("you entering wrong input = " + e.getMessage());
// 		}
// 		finally {
// 			System.out.println("Finally executed.");
// 		}
// 	}
// }


//=====================


// public class Main {
// 	public static void main(String[] args) {

// 		try {
// 			int[] arr = {1,2,3,4,5/0};
// 			System.out.println(arr[5]);

// 		} catch(ArithmeticException e) {
// 			System.out.println("Error type-1 : "+ e.getMessage());
// 		} catch(ArrayIndexOutOfBoundsException e) {
// 			System.out.println("Error type-2 : " + e.getMessage());
// 		}
// 		finally {
// 			System.out.println("Finally executed.");
// 		}
// 	}
// }



















