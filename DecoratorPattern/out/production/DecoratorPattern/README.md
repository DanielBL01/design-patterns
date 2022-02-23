# Decorator Pattern

In the first implementation of the coffee shop, imagine that they
have just one Beverage class and every type of coffee must extend
that superclass. Not only is there HouseBlend, DarkRoast, etc. but
there can also be condiments like steamed milk, soy, mocha, etc.

Each subclass then implements its own cost to compute the cost of 
the coffee along with the other condiments in the order.

You quickly realize that with so many combinations, a single 
superclass extension like this won't work and will lead terrible
maintainability of code.

Example - what if the price of milk goes up? What if they add 
just a single new topping? So many subclasses to change and add,
so little time...





