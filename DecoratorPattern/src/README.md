# Decorator Pattern

### Design Pattern - Open-Closed Principle
#### Classes should be open for extension, but closed for modification

Why is this principle important? It states that while classes
are open for new behavior, if your needs or requirements change, 
you should go ahead and make your own extension rather than 
changing the class itself.

We want this because we can be sure that the existing class code
is correct and bug free so altering the code should be closed.

Therefore, the goal is to allow classes to be easily extended to 
incorporate new behavior without modifying existing code. This 
leads to designs that are resilient to change and flexible 
enough to take on new functionality to meet changing 
requirements.

### Coffee Shop Simulator

To explain the Decorator Pattern we use a Coffee Shop as an 
example.

In the first implementation of the coffee shop, imagine that they
have just one Beverage superclass and every type of coffee must extend
that superclass. Not only is there HouseBlend, DarkRoast, etc. but
there can also be condiments like steamed milk, soy, mocha, etc. This 
means we will have classes like HouseBlend but also classes like 
DarkRoastWithMocha.

Each subclass will need to implement its own cost to compute the cost of
the coffee along with the other condiments in the order.

You quickly realize that with so many combinations, a single
superclass extension like this won't work and will lead terrible
maintainability of code. What if the price of a condiment goes up? What if they add
a new topping? So many subclasses to change and add,
so little time...

The second implementation attempts to fix this problem by establishing
that there will only be subclasses for the different coffees like 
HouseBlend, DarkRoast, etc. and the condiments can be instance 
variables that each subclass can inherit. While this does sound better,
think about the future and how this implementation handles changes.

Remember that while inheritance is great, it doesn't always lead 
to the most flexible or maintainable code. Think back to the 
Strategy Pattern, in the Second Implementation, what if we get 
another beverage like Iced Tea? Now you have an Iced Tea subclass
that inherits methods like hasSoy() or hasWhip() which are not applicable to Iced Tea.

Secondly, what if there are new condiments, this means that we will
have to go back to the superclass and change the logic of calculating 
the total price of condiments.

Lastly, what about double toppings? If a customer wants x2 mocha in
their coffee, how does this class deal with this? With these examples,
it becomes clear that this implementation is also lacking.

The Decorator Implementation exists to fix these problems. By following
the open-closed design pattern, the class allows inheriting behavior 
at runtime through composition and delegation. By dynamically 
composing objects, we can add new functionality by writing new code 
rather than altering existing code.

Decorator means exactly what you think it is, to decorate. In this 
case, we want to decorate our classes. If it is easier, think of them
as wrappers.

So what's going on in DecoratorImplementation? We start with our 
Beverage superclass which coffees like HouseBlend and DarkRoast will
extend. However, from this point, we know that our condiments should 
decorate these coffees. So think of starting with a base like DarkRoast.
At runtime, if we want to pair the DarkRoast with mocha and soy, then 
we can start layering these on top of DarkRoast as decorators.