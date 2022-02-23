# Singleton Pattern

With the Singleton Pattern, the class can only instantiate one 
object. The use case is actually quite trivial to think about. 
There are obviously different objects we only need one of and 
instantiating more than one of these objects could cause all sorts 
of problems.

The Singleton Pattern ensures one and only one object is 
instantiated for the given class. The Singleton Pattern also 
gives us a global point of access like a global variable but 
without its downsides.

Here's one downside. If you assign an object to a global variable
then that object will be created when your application begins.
However, what if this object is resource intensive and your 
application never ends up using it? The Singleton Pattern allows 
us to create our object only when it is needed. 

The thing with Singleton objects is that you don’t 
instantiate one, you just ask for an instance. So the class 
Singleton has a static method called getInstance().

The Singleton Pattern ensures a class has only one instance,
and provides a global point of access to it. 

Breaking it down further, we take a class and let it manage 
a single instance of itself. We also prevent any other class
from creating a new instance on its own. The only way to get
an instance is to go through the class itself.

We also provide a global access point to the instance such 
that whenever you need this single instance, you can query
the class for it, and it will hand you back this single instance.

To combat the problem of resource-intensive objects, you can 
see that the Singleton instance is created in a lazy manner.

### Note
You may notice that it is possible to achieve the "Singleton" by
having a class in which all methods and variables are defined 
as static. However, given the way static initializations are handled
in Java, this could get messy especially if multiple classes are 
involved. it's much better to stay in the object world. (This is 
another discussion about static vs object in Java)

Also, why are global variables really that worse than a Singleton?
In Java, global variables are basically static references to 
objects and that comes with disadvantages. Firstly, the issue 
with lazy vs eager instantiation which with global variables 
you cannot control. Additionally, global variables tend to 
encourage developers to pollute the namespace with lots of 
global references to small objects. Singletons don't encourage 
this in the same way. 