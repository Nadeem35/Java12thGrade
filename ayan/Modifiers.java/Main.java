// public class Main{
//     int x;
    
//     public Main(int y){
//         x = y;
//     }
    
//     public static void main(String[] args){
//         Main obj = new Main(56);
//         System.out.println(obj.x);
//     }
// }



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











































































