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

**Diferences between abstract and interfaces**: The difference between a interface and a abstract class is that an abstract class can manage states which interfaces can't. Objects can implement multiple interfaces and objects can only extend one abstract class. The abstract class generalizes the attributes and methods that are the same in different objects meanwhile interfaces just establishes actions that objects have to do, it doesn't matter if the classes have something in common.

**Can an abstract class implement a interface and the other way around?** an abstract class can implement as many interfaces as it wants. An interface can't extend an abstract class however you can extend another interface.

**Final**: 
- Class: It indicates that a class can not be extended.
- Methdod: It indicates that a method can not be overridden or be hidden (for static).
- Attribute: It indicates that the variable can only be initialized once.

**Static**: 
- Class: Java has no way of making a top level static class. Java has static nested classes witch indicates that it doesn't have a refrence of an instance to an outer class.
- Method:  A static method is called on a class instance and not to an object of a class.
- Attribute: it's when the variable is attached to the class and not to the object. 
- Static block: It's like the constructor of a class. Every time a class is instantiated, this piece of code will be executed.

**Private**: 
- Class: It's not allowed to have a private class in java. However we can have private nested private class witch means that no outer classes can instantiate it.
- Method: It's when a method can't be accesed by outer objects.
- Attribute: It's when a Attribute can't be accesed by outer objects.

**protected**: 
- Class: It's not allowed to have a protected class in java. However we can have protected nested classes wich means it can't be instantiated by by other objects but it's children.
- Method: It's when a method can be accesed only by it's children.
- Attribute:It's when the attribute can be accesed only by it's children.

**default**: 
- Class: In java there's no such thing as a static class.
- Method: It's when the methods can have default implementations which helps the interfaces evolve without breaking the existing code.
- Attribute: There's no such thing as a default attribute in java.

**casting**: It's when you try to convert a object of type A to an object type B, if the object type A is not an instance of object type B then you will have a runtime error.


