# OOP
**Abstraction**: It's the ability to represent an object from the real world to the virtual world (characteristics and abilities).

**Polymorphism**: It's the ability of an object to have different actions depending on it's parameters. 

**Heritage**: It's the ability of a father class to pass actions and characteristics to a son class.

**Encapsulation**: It's the ability to restrict actions and characteristics from an object.

**Why use OOP?** It's a better way to work, since it depends on the object's communication (messages), you can add modularity to your project, make big problems into a sequence of small problems, reuse code so it is time and space efficient, find bugs faster, and it also allows you to restrict your data.

**Class**: It's the blueprint of an object; from this an object is created.

**Instance** It's the occurrence of objects from a blueprint.

# Java 

**Interface**: It's like a contract which establishes actions that every single object that implements this has to do; how each object implements it, it doesn't matter. 

**Diferences between abstract and interfaces**: The difference between a interface and a abstract class is that an abstract class can manage states which interfaces can't. Objects can implement multiple interfaces and objects can only extend one abstract class. The abstract class generalizes the attributes and methods that are the same in different objects meanwhile interfaces just establishes actions that objects have to do, it doesn't matter if the classes have something in common.

**Can an abstract class implement a interface and the other way around?** an abstract class can implement as many interfaces as it wants. An interface can't extend an abstract class however you can extend another interface.

**Final**: 
- Class: It indicates that a class can not be extended.
- Method: It indicates that a method can not be overridden or be hidden (for static).
- Attribute: It indicates that the variable can only be initialized once.

**Static**: 
- Class: Java has no way of making a top level static class. Java has static nested classes which indicates that it doesn't have a reference of an instance to an outer class.
- Method:  A static method is called on a class instance and not to an object of a class.
- Attribute: it's when the variable is attached to the class and not to the object. 
- Static block: It's like the constructor of a class. Every time a class is instantiated, this piece of code will be executed.

**Private**: 
- Class: It's not allowed to have a private class in java. However we can have private nested private class which means that no outer classes can instantiate it.
- Method: It's when a method can't be accessed by outer objects.
- Attribute: It's when a Attribute can't be accessed by outer objects.

**Protected**: 
- Class: It's not allowed to have a protected class in java. However we can have protected nested classes which means it can't be instantiated by by other objects but it's children.
- Method: It's when a method can be accessed only by it's children.
- Attribute: It's when the attribute can be accessed only by it's children.

**Default**: 
- Class: It's when a class can't be instantiated by another class that is in a different package
- Method: It's when a method can't be accessed by a class that is in a different package.
- Attribute: It's when an attribute can't be accessed by a class that is in a different package.

**Casting**: It's when you try to convert a object of type A to an object type B, if the object type A is not a subclass of object type B then you will have a runtime error. 

**Primitive casting**: You can cast primitives to other primitives but you can't cast primitives to classes and vice versa. There are two types of casting in java; implicit and explicit casting. 

**Explicit casting**: The explicit casting requires a casting operator meanwhile the implicit doesn't, the compiler does it automatically. Casting an object from a subclass to a super class doesn't require an explicit cast. Casting an object from a super class to a subclass requires an explicit cast. 
