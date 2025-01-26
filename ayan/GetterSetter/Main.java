// ==================== File - 1 ================
/*

  Get and Set
 Private variables can only be accessed within the same class (an outside class has no access to it). 
 However, it is possible to access them if we provide public get and set methods.

 The get method returns the variable value, and the set method sets the value.

 Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

*/

// ==================== File - 1 ================
public class Main{
    public String name;
    
    // getter
    public String getName(){
        return name;
    }
    
    // setter
    public void setName(String newName){
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
The set method takes a parameter (newName) and assigns it to the name variable. 
The this keyword is used to refer to the current object.
*/




// ==================== File - 1 ================
package GetterSetter;

public class Fileone {
    public int age;
    public String name;
    private String edu;

    public int getmethd1() {
        return age;
    }
    public String getmethd2() {
        return name;
    }
    public String getmethd3(){
    return edu;
    }

    public void setmethod(int newAge, String newName, String newEdu) {
        this.age = newAge;
        this.name = newName;
        this.edu = newEdu;
    }
}

// ==================== File - 2 ================
package GetterSetter;
public class Fileone {
    public int age;
    public String name;
    private String edu;

    public int getmethd1() {
        return age;
    }
    public String getmethd2() {
        return name;
    }
    public String getmethd3(){
    return edu;
    }

    public void setmethod(int newAge, String newName, String newEdu) {
        this.age = newAge;
        this.name = newName;
        this.edu = newEdu;
    }
}






