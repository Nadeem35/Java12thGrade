public class Main {
    int x;  // Instance variable to store a value

    // Constructor
    public Main(int y) {
        x = y;  // Initialize the instance variable 'x' with the value of 'y'
    }

    // Main method (entry point of the program)
    public



// ===================== Java Constructor with Parameters =================== 



// public class Main{
//     String name;
//     int age;
//     String course;
    
//     public Main(String n, int a, String c){
//         name = n;
//         age = a;
//         course = c;
//     }
    
    
//     public static void main(String[] args){
        
//         Main obj = new Main("nadeem", 54, "12th");
        
//         System.out.println(obj.name);
//         System.out.println(obj.age);
//         System.out.println(obj.course);
//     }
    
// }



// ================== code from second file (modifiers) ======================


// class Main{
//     public static void main(String[] args){
//         Main obj = new Main();
//         System.out.println(obj.name);
//     }
// }



//===================== This  code is onli accessible inside class not out of class =============

public class Main{
    private String name = "Arham";
    private int age = 20;
    private String klass = "BTech";
    
    
    public static void main(String[] args){
        Main obj  = new Main();
        System.out.println(obj.name + " " + obj.age + " " + obj.klass);
        
    }
}



//========================= revisions code =============================

    
// public class Main {
//     int x;
// 	public void Nadeem() {
// 		System.out.print("Message " + x);
// 	}
// 	public static void main (String[] args) {
// 		/* using static method */
//      // Nadeem();
// 		Main obj = new Main();
// 		obj.x = 12;
// 		obj.Nadeem();
// 	}
// }



// =======================\

// public class Main{
//     static void myMethod(String fname, String lname){
//         System.out.println("My name is " + fname + lname);
//     }

//     public static void main (String[] args) {

//         myMethod("nadeem", " Inaya");
//     }
// }









































































