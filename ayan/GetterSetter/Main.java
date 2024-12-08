// ==================== File - 1 ================
/*

  Get and Set
 You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). 
 However, it is possible to access them if we provide public get and set methods.

 The get method returns the variable value, and the set method sets the value.

 Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

*/




public class Main{
    public String name;
    
    // getter
    public String getName(){
        return name;
    }
    
    // setter
    public static setName(String newName){
        this.name = newName;
    }
}


// ==================== File - 2 ================
public class Second{
    public static void main(String[] args){
        Main Obj = new Main();
        Obj.setName("Nadeem");
        System.out.print(Obj.getName());
    } 
}








/*
Explaination
The get method returns the value of the variable name.
The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.
*/








