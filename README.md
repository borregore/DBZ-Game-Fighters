# OOP
--Objects: they are the representation of some thing in the real world representated in the virtual world. Like the things in the real world the objects can have actions wich are called methods and attributes.

--class: They represent the types of objects, for example humans is the class of javier (since Javier is a type of human).

--recurssion: It's the abillity of the method to call itself or another method that will return to the method that started. It's a way to make cicles via methods.these methods need a condition where if it happens it gets out of the recursive cicle.

--abstract: is the class where they generalize the different attributes and methods that that different classes have. and abstract methods are the methods that every subclass of the abstract class must have now those methods have to be overwritten unless they are default.

--interface: its like a contract which establishes methods that every single class that implements this special kind of class has to do; how, it doesn't matter how.

--diferences between abstract and interfaces: the difference between a interface and a abstract class is that an abstract class can manage attributes which interfaces can't. The interface can be multi implementated (a sub class can have several interfaces) and a abstract calss can only be extended to 1 (a subclass of an abstract class can only have 1). The abstract class generalizes the attributes and methods that are the same in different classes meanwhile the interface just establishes methods that a class has todo, it doesnt matter if the classes have something in common.

--can an abstract class implement a interface and the other way around? an abstract class can implement as many interfaceses as it wants since the children of the abstract class will do the contract but not the other way arround since the subclass of an abstract class has too override its methods.

--heritage: is like the human heritage it depends on the subclass if it wants the atributes or methods the father class have. They will have the methods and attributes it's facther have unles they are private.

--Encapsulation: is where it encapsulates or has a range of use of its variables and methods between diferent classes.

--4 types of encapsulation: they are private, static, protected, default.

--final: its where the pointer of where the element is stays the same wich causes the element to be constant. now with the list is a hole diferent story since the list only the first element stays constant since the pointers are managed while the list increments. For this to be avoided we have to to return a new list as a copy of the list we have inside the class. this way our original list wont change.

--static: its the command which tells that it's the class's attribute or method. So it doesn't belong to the object. so when we call out a static method we dont call the object to do it but we call the class. Class.method. A static bock is like a constructor of a class not an object's constructor so every time we instantiate a object it does that piece of code, it doesn't matter the parameters you insert into the object. these pieces of code can be located anywhere, and you can have several static blocks, the way it wil be reproduced is in the up to down order.

--private: it means that it's attributes and methods only can be used by that class; not the childs or even no other class can use it.

--protected: it's when the methods and attributes can be used by it's class and by it's children none other. That's untill a child declares it private. then right here it establishes a limit of use or a scope.

default: it's laike the starting point of a abstract method or a method wich is in a interface. this allows these methods have a initial action wich can be overriden by its children at any time.

--Polymorphism: it's the abillity of a method to be overwritten or overloaded. when its over written is where the method changes it's action with the same attributes it's father method had, now the overwrite only the child can do this. The overload is where the method does diferent actions once it receives diferent parameters, now this could be done by the same class or it's children.

--scoping: it's like the limit that a variable or method has to be used between other classes. the scoping is established with the key words private, protected, default and public. Where public is the more opened since any class can use what it has, and public is the most restrictive one sinse only the class it is in can be used. now When it is protected all subclasses can use it's attributes and methods that's untill a child of those subclasses declares it private. Then the limit of use is only between those specific classes, since privatizing it the children won't be able to use the method or attribute.

--casting: is when a object needs to use another objects qualities so what it does it's that it creates another object from that object except eith the type of the object needed. this has some restrictions since not any object can turn into another object so the objects's class it wants to be turned has to be a subclass of the object which is right now.

--Why use OOP? it's a better way to work on since it depends on the class's comunication wich are messages, you can work on them modularly, you can make big problems into a squence of small problems, you can reuse code so it is time and space efficient, you can find bugs faster, and it also allows you to hide your data with ecapsulation.
