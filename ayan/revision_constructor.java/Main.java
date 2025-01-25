import java.util.*;

// public class Main {
// 	int a = 54;

// 	public static void main(String[] args) {
// 	    Main obj = new Main();
// 	    obj.a = 111;
// 	    System.out.println(obj.a);
// 	}
// }


// ===================== Creating two Object ============

// public  class Main{
//     int a = 5454;
//     String name = "Salam";

//     public static void main(String[] args){
//         Main obj1 = new Main();
//         Main obj2 = new Main();

//         System.out.println(obj1.a);
//         System.out.println(obj2.name);
//     }

// }


//=============================


public class Main {

	int age;
	String name;

	public Main(int newAge, String newName) {
		age = newAge;
		name = newName;
	}

	void display() {
		System.out.println("Age :"+ age);
		System.out.println("Name :"+ name);
	}

	public static void main(String[] args) {
		Main obj = new Main(21, "Inaya");
		
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}




//===============================

// import java.util.*;

// // Class defining
// public class Main{
//     int a;
//     String name;

//     // Instance variable
//     public Main(int newa, String newname){
//         a = newa;
//         name = newname;
//     }

//     // method to display
//     public void person(){
//         System.out.println("Age : " + a);
//         System.out.println("Name : " + name);
//     }

//     // Main method
//     public static void main(String[] args){
//         Main obj = new Main(51, "Inaya");
//         obj.person();
//     }

// }


