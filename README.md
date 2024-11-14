Java Methods
A method is a block of code which only runs when it is called.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.


What is class and object in JAVA
A class is a blueprint or template that defines the properties and behaviour of objects, while an object is an instance(example or case) of a class that has actual values for those properties.

Declaration
A class can only be declared once, but an object can be created many times. 
 
Memory allocation
A class is not allocated memory in the Java Virtual Machine (JVM), but an object is allocated memory when it is created. 
 
Creating an object
To create an object of a class in Java, you can specify the class name, follow with the object name, and use the keyword new. 


Defining a class




If we declare final x = 5 then we can’t update the value of x
like  myObj.x = 25;
System.out.println(myObj.x);



JAVA Class Methods
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.


Create a Method
A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:



myMethod() is the name of the method.
static means that the method belongs to the Main class and not an object of the Main class.
static: This means that the method belongs to the class, not an object of the class. This allows Java to call the main method without needing to create an object of the Main class. The main method is always static because the program must run without any objects being created initially.
void means that this method does not have a return value.
Parameters and Arguments
Information can be passed to methods as a parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.




Note: 
When a parameter is passed to the method, it is called an argument. 
So, from the example above: fname, lname is a parameter, while Mohd, Nadeem, Ayan, Khan etc. are arguments.
 
Note:
 when you pass multiple Parameters then its remembers that all the argument should be pass in the same order.















What is OOP ?

OOP stands for Object-Oriented Programming.
Object-Oriented Programming (OOP) in Java is a way of designing and writing programs by thinking in terms of objects. It helps organise code in a way that’s easy to understand, modify, and maintain. OOP is based on four key ideas: Encapsulation, Inheritance, Polymorphism, and Abstraction.

Class and Object:
Class: Think of a class as a blueprint or template. For example, a Car class would describe what a car is (its properties) and what a car can do (its behaviours). It doesn’t represent an actual car, just the idea of a car.
Object: An object is an actual instance of a class. If Car is the class, then your specific car (say a red Honda) is an object of that class.

             

Key Takeaways:
Class: A blueprint for creating objects.
Object: An instance of a class.
Encapsulation: Hiding data inside a class and controlling access through methods.
Inheritance: One class can inherit properties and methods from another class.
Polymorphism: One object can take many forms, behaving differently based on the situation.
Abstraction: Hiding complex details and showing only the essential parts.
OOP helps in organising code, making it reusable, easy to maintain, and easy to understand.


Remember that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.


Create an Object
To create an object of Main, specify the class name, followed by the object name, and use the keyword new:




Static vs. Public 
You will often see Java programs that have either static or public attributes and methods. 
In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:






Java Constructors

A constructor in Java is a special method that is used to initialise objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:



Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

Java Modifiers
The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
Modifiers divide into two groups:
Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality


Access Modifiers
public - The code is accessible for all classes
private - The code is only accessible within the declared class
protected - The code is accessible in the same package and subclasses.



Non-Access Modifiers
final -  Attributes and methods cannot be overridden/modified 
static - Attributes and methods belongs to the class, rather than an object 


differences between static and public methods:
Static methods can be called without creating objects
Public methods must be called by creating objects

Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
declare class variables/attributes as private 
provide public get and set methods to access and update the value of a private variable

Get and Set
You already learned that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.
