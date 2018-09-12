# OOP
**Abstraction**: It's the ability to represent an object from the real world to the virtual world (characteristics and abilities).

**Polymorphism**: It's the ability of an object to have diferent actions depending on it's parameters. 

**Heritage**: It's the ability of a father class to pass actions and characteristics to a son class.

**Encapsulation**: It's the ability to restrict actions and charactersitics from an object.

**Why use OOP?** It's a better way to work, since it depends on the object's communication (messages), you can add modularity to your project, make big problems into a squence of small problems, reuse code so it is time and space efficient, find bugs faster, and it also allows you to restrict your data.

**Class**: It's the blueprint of an object; from this an object is created.

**Instance** It's the occurance of objects from a blueprint.

# Java 

**Interface**: It's like a contract which establishes actions that every single object that implements this has to do; how each object implements it, it doesn't matter. 

**Diferences between abstract and interfaces**: The difference between a interface and a abstract class is that an abstract class can manage states which interfaces can't. 
Objects can implement multiple interfaces and objects can only extend one abstract class. The abstract class generalizes the attributes and methods that are the same in different objects meanwhile interfaces just establishes actions that a objects have to do, it doesn't matter if the classes have something in common.

**Can an abstract class implement a interface and the other way around?** an abstract class can implement as many interfaces as it wants. An interface can't extend an abstract however you can extend another interface.

**Final**: It's where the pointer of where the element is stays the same wich causes the element to be constant. now with the list is a hole diferent story since the list only the first element stays constant since the pointers are managed while the list increments. For this to be avoided we have to to return a new list as a copy of the list we have inside the class. this way our original list wont change. --seperated class methos and attribute
- Class:
- Methdod:
- Attribute:

**Static**: It's the command which tells that it's the class's attribute or method. So it doesn't belong to the object. so when we call out a static method we dont call the object to do it but we call the class. Class.method. A static bock is like a constructor of a class not an object's constructor so every time we instantiate a object it does that piece of code, it doesn't matter the parameters you insert into the object. these pieces of code can be located anywhere, and you can have several static blocks, the way it wil be reproduced is in the up to down order.
- Class:
- Method:
- Attribute:
- Static block:

**Private**: It means that it's characteristics and actions only can be used by that object.
- Class:
- Method:
- Attribute:

**protected**: It's when the methods and attributes can be used by it's class and by it's children none other. That's untill a child declares it private. then right here it establishes a limit of use or a scope.
- Class:
- Method:
- Attribute:

**default**: it's laike the starting point of a abstract method or a method wich is in a interface. this allows these methods have a initial action wich can be overriden by its children at any time.
- Class
- Method
- Attribute

**casting**: is when a object needs to use another objects qualities so what it does it's that it creates another object from that object except eith the type of the object needed. this has some restrictions since not any object can turn into another object so the objects's class it wants to be turned has to be a subclass of the object which is right now.


