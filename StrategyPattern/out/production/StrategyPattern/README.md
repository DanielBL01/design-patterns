# SimUDuck

Imagine the initial design of the system created one Duck superclass with defined methods like 
quack() and swim() and an abstract method display() from which all other duck types inherit. Then 
imagine that the game now needs flying ducks.

At first, it seems easy enough. Simply add a defined fly() method in the superclass and have all 
the ducks inherit it. However, our first problem. We find that there are rubber ducks and 
these ducks do not fly. We failed to notice that not all subclasses of Duck should fly. (Rubber 
duck class also had to override the quack() method as it should squeak).

One solution would be to override the fly() method in rubber duck like we did with quack(). But
what happens if we introduce a wooden duck? They don't fly or quack. That would mean we would 
have to override quack() to do nothing and override fly() to do nothing.

Given another constraint that the game has to be updated every six months. Using inheritance 
probably wasn't the answer as when the specs change, we'll be forced to look at and possibly
override fly() and quack() for every new Duck subclass forever. 

What's another solution? We could take the fly() method out of the superclass and make a 
Flyable() interface with a fly() method such that only ducks who are supposed to fly can 
implement the interface and have a fly() method. This can also be done with quack() with a 
Quackable() interface.

Although this solution solves the problem of the flying rubber ducks as not all subclasses 
will inherit the fly() and quack() method, it creates a different maintenance problem as 
each subclass will have to implement the fly() and quack() method respectively. What if a little 
change is required to the flying behavior, and you have 50 flying Duck subclasses? (Java interface
typically have no implementation code so no code reuse).

### Design Pattern #1
#### Identify the aspects of your application that vary and separate them from what stays the same

No matter what you work on, what you're building and what technologies you are using, the one 
true constant is change. No matter how well an application is designed, over time it must grow 
and change, or it will die.

Therefore, take the parts that vary and encapsulate them, so that later you can alter or extend
the parts that vary without affecting those that don't. (Encapsulation simply refers to the 
"bundling of data with the methods that operate on that data, or the restricting of direct access 
to some of an object's components" so basically make a class to handle change).

To start, let us encapsulate fly() and quack() by creating two **sets** of classes for fly and quack.
Each set will hold all the implementation of the respective behavior i.e. have a set of multiple classes 
that **implements** different flying behaviors and the same set for quacking. 

We also want to keep things flexible. Since these are behaviors we want to assign these behaviors 
to the instances of Duck i.e. we may instantiate a new MallardDuck instance and initialize it 
with a specific type of flying behavior. However, we may also want to change that behavior 
dynamically i.e. create behavior setter methods in the Duck classes so that we can change the 
MallardDuck's flying behavior at runtime.

### Design Pattern #2
#### Program to an interface, not an implementation

We'll use an interface to represent each behavior. For instance, we can have a FlyBehavior and
QuackBehavior and each implementation of a behavior (a class) will implement one of these 
interfaces. 

Notice this is different from what we had before where a behavior came either from a concrete 
implementation in the superclass or by providing a specialized implementation in the subclasses 
itself by overriding the behavior. In both cases, we were programming to an implementation. 

With this new design, the Duck subclasses will use a behavior represented by an interface so that
the actual implementation of the behavior won't be locked into the Duck subclass.

NOTE: Program to an interface doesn't mean use the Java interface. A better description may be 
to program to a supertype. The whole point is to exploit polymorphism (bundling of data with 
the methods that operate on that data, or the restricting of direct access to some of an object's 
components).

Example of Polymorphism

    // Programming to an implementation
    Dog d = new Dog();
    d.bark();

    // Programming to an interface or supertype to exploit polymorphism
    Animal animal = new Dog();
    animal.makeSound();

After reading this. Make a look at the codebase for SimUDuck to see how these concepts were used
to create the new SimUDuck.

Additionally, you will notice the ModelDuck class. This class is to demonstrate that with our 
new dynamic design it's simple to add ModelDuck into our app, give it initial flying and quacking
behaviors but also change them at runtime like giving it a rocket!

Finally, a brief overview. Each duck now has a FlyBehavior and a QuackBehavior to which it 
delegates flying and quacking (Delegation can be viewed as a relationship between objects where 
one object forwards certain method calls to another object). Putting two classes together like 
this is called **composition**. So instead of inheriting their behavior, the ducks get their 
behaviors by being composed with the appropriate behavior objects!

### Design Pattern #3
#### Favor composition over inheritance

Creating systems using composition gives one much more flexibility rather than inheritance. 
Not only does it let you encapsulate a family of algorithms (in this case, a "family of algorithms"
is referring to how we encapsulated the fly behavior using an interface + set of classes that 
implements the interface) into their own set of classes, but it also lets you **change** behavior
at runtime.

Composition is sometimes referred to as a **HAS-A** relationship and inheritance as an **IS-A** 
relationship

## The Strategy Pattern
#### The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

This is the formal definition of what we just did. And thanks to this design pattern, the simulator
is ready for any changes that may appear in the future!