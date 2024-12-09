// public class Main {

// 	// Main method where execution begins
// 	public static void main(String[] args) {
// 		// Create a Car object
// 	//	Car car1 = new Car("Toyota", 2020, "Red");

// 		// Call the method to display details of the car
// 		displayDetails();
// 	}

// 	// Definition of the Car class
// // 	public static class Car {
// 		// Attributes (fields) of the Car class
// 	//	String model;
// 	//	int year;
// 	//	String color;

// 		// Constructor to initialize a Car object
// 		public Car(String model, int year, String color) {
// 			this.model = model;
// 			this.year = year;
// 			this.color = color;
// 		}

// 		// Method to display car details
// 		public void displayDetails() {
// 			System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
// 		}
// // 	}
// }



// Access_Modifier Class Obj_Name{

//     // Members
//     Fields declaration;
//     Method declaration;
// }


// ===============================================

// public class Main {
//     public static void main(String[] args) {
//         // Create an object of the Person class
//         Person person1 = new Person(); // Person() Constructor  of the class Main

//         // Set the object's attributes
//         person1.name = "John";
//         person1.age = 25;

//         // Call the method to display the person's details
//         person1.displayInfo();
//     }
// }

// // A simple class definition
// class Person {
//     // Attributes (fields)
//     String name;
//     int age;

//     // Method to display information about the person
//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }


// ===============================================

/*
public class Main{
    int x = 54;

    public static void main(String[] args){
        Main obj = new Main(); // Main() Constructor  of the class Main
        obj.x = 12;
        System.out.println(obj.x);
    }
}

*/


// ===============================================


// public class Main{
//     String name = "saifi";

//     public static void main(String[] args){
//         Main Obj = new Main(); // Main() Constructor  of the class Main
//         System.out.println(Obj.name);
//     }
// }


// ===============================================


// public class Main{

//     static void Nadeem(){
//         System.out.println("My name is Khan");
//     }

//     public static void main(String[] args){
//     Nadeem();
//     Nadeem();
//     Nadeem();
//     Nadeem();
//     Nadeem();
//     }
// }


// =======================Parameters and Arguments========================


// public class Main {
// 	static void Myfunc(String fname, String lname) {
// 		System.out.println("I am "+ fname + lname);
// 	}

// 	public static void main(String[] args) {
// 		Myfunc("Mohd", " Nadeem");
// 		Myfunc("Ayan", " Khan");
// 		Myfunc("Sheeza", " Nawaz");
// 		Myfunc("Mahira", " Khan");
// 	}
// }

/*
When a parameter is passed to the method, it is called an argument.
So, from the example above: fname, lname is a parameter, while Mohd, Nadeem, Ayan, Khan etc. are arguments.
*/



// ======================= To pass Multiple Parameters and Arguments Return Values ========================

// public class Main {
// 	static int Add(int a, int b) {
// 		return a+b; //Return Values
// 	}

// 	static float Sub(float x, float  y) {
// 		return x-y; //Return Values
// 	}

// 	static float user(String name, float age) {
// 		System.out.println("My name is " + name + " and my age is " + age);
// 		return age; //Return Values
// 	}

// 	public static void main(String[] args) {
// 		int res1 = Add(23, 7);
// 		System.out.println(res1);

// 		float res2 = Sub(5.2f, 2.3f);
// 		System.out.println(res2);

// 		System.out.println(user("Bro", 21.5f));

// 	}
// }

////- Note: when you pass multiple Parameters then its remember that all the argument should be pass in the same order.


// ========================== Java Method Overloading ==============================
////example of two methods that add numbers of different type: int and float

// public class Main {
// 	static int Addint(int a, int b) {
// 		return a+b;
// 	}

// 	static double Adddouble(double x, double y) {
// 		return x+y;
// 	}

// 	public static void main(String[] args) {
// 		System.out.println("int: " + Addint(21, 23));
// 		System.out.println("double: " + Adddouble(21.2, 2.23));
// 	}
// }



//-================================================

// //- file-1
// public class Person {
// 	public void greet() {  // public method that can be used by any other class
// 		System.out.println("Hello! I am a person.");
// 	}
// }


// //- file-2
// public class Main {
// 	public static void main(String[] args) {
// 		Person person = new Person();  // Creating an object of Person class
// 		person.greet();  // Calling the public greet method of the Person class
// 	}
// }




// ======================= A Method with If...Else ========================


// public class Main {

// 	static void Check(int age) {
// 		if(age > 18) {
// 			System.out.println("You are adult");
// 		} else {
// 			System.out.println("Not adult");
// 		}
// 	}

// 	public static void main(String[] args) {
// 		Check(25);
// 	}

// }



// ======================= Retun Values ========================


// public class Main{
//     static int add(int a){
//         return a + 10;
//     }
//     public static void main(String[] args){
//       int res = add(12);
//       System.out.println(res);
//     }
// }


//----------------------------


// public class Main{
//     static int add(int a, int b){
//         return a + 10 + b;
//     }
//     public static void main(String[] args){
//       int res = add(12, 32);
//       System.out.println(res);
//     }
// }



// =======================  ========================

// public class Main{
//     static int Add(int a, int b){
//         return a+b;
//     }

//     static int Sub(int a, int b){
//         return a-b;
//     }

//     public static void main(String[] args){
//         System.out.println(Add(15, 8));
//         System.out.println(Sub(15, 8));
//     }
// }



//======================== Method Overloading ==================
// method overloading, multiple methods can have the same name with different parameters:
// Note: Multiple methods can have the same name as long as the number and/or
//       type of parameters are different.


// ----------------------------

// public class Main {

// 	static int plusMethod(int x, int y) {
// 		return x + y;
// 	}

// 	static double plusMethod(double x, double y) {
// 		return x + y;
// 	}

// 	public static void main(String[] args) {
// 		int myNum1 = plusMethod(8, 5);
// 		double myNum2 = plusMethod(4.3, 6.26);
// 		System.out.println("int: " + myNum1);
// 		System.out.println("double: " + myNum2);
// 	}

// }




//============= Java Class Attributes ========

// public class Main{
//     int x = 11;
//     public static void main(String[] args){
//         Main obj = new Main();
//         System.out.println(obj.x);
//     }
// }





// ========================== Static vs. Public =======================

//// -- You will often see Java programs that have either static or public attributes and methods.
//// -- static methods can access without creating object while the public method we can't create without object method.


// public class Main{
//     static void onlyStatic(){
//         System.out.println("Hello Jamian !");
//     }
//     public static void main(String[] args){
//         onlyStatic();
//     }
// }


// In the example above, we created a static method, which means that it can be accessed without
// creating an object of the class, unlike public, which can only be accessed by objects:



// ------------------- creating with static and public -------------------

// public class Main {
//     // static method
// 	static void myStatic() {
// 		System.out.println("We can access without creating objects ");
// 	}
    
//     // ppublic method
// 	public void myPublic() {
// 		System.out.println("We can't access without creating objects ");
// 	}

// 	public static void main(String[] args) {
// 		myStatic();

// // 		myPublic(); // error: non-static method myPublic() cannot be referenced from a static context

// 		Main myObj = new Main();
// 		myObj.myPublic();
// 	}
// }




// ========================= Using Multiple Classes ===========================


public class Main{
    public void fMethod(String name){
        System.out.println("Enter you name " + name );
    }
    
    public void sMethod(int perc){
        System.out.println("My percecntage is : " + perc);
    }
}


public class AnoClass{
    public static void main(String[] args){
        Main newObj = new Main();
        
        newObj.fMethod("Palastine");
        newObj.sMethod(1553);
    }
}



// ========================= Constructor Parameters ================
// A constructor in Java is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created.



// public class Main {
//   int x;

//   public Main(int y) {
//     x = y;
//   }

//   public static void main(String[] args) {
//     Main myObj = new Main(5);
//     System.out.println(myObj.x);
//   }
// }



// ========================= ==================


// public class Main {
//   int modelYear;
//   String modelName;

//   public Main(int year, String name) {
//     modelYear = year;
//     modelName = name;
//   }

//   public static void main(String[] args) {
//     Main myCar = new Main(1969, "Mustang");
//     System.out.println(myCar.modelYear + " " + myCar.modelName);
//   }
// }



// ================== code for second file (modifiers) ======================



public class OOPs{
    public String name = "Nadeem";
}










