# Factory Pattern

The Factory Pattern shows us that there is more to making
objects than just using the **new** operator and that
instantiation shouldn't always be done in public.

When you see "new", think "concrete". This is because whenever
you use the **new** opeator, you are instantiating a concrete
class which means programming to an implementation and not 
an interface.

    /* With concrete classes, it's common to have a set of concrete classes 
    which results in code like this. When you see code like this you know that
    when it's time for changes or extensions, this will have to be reopened.
    This kind of code can also exist in several parts of an application thus
    hurting maintainability and error-prone */

    Duck duck;

    if (picnic) {
        duck = new MallardDuck();
    } else if (hunting) {
        duck = new DecoyDuck();
    } else if (inBathTub) {
        duck = new RubberDuck();
    }

It's important to note that there is nothing wrong with the **new** operator, but
what is important is how it's impacted by the one constant in software - Change. 

Remember the design principle *"open for extension but closed for modification"*.
When you have code that uses a lot of concrete classes, extension via new concrete
classes will make modifications. 

The Factory Pattern uses the design principle *"identify the aspects that vary
and separate them from what stays the same"* and encapsulates object creation as
we have just seen that object creation may change over time.

Now the object that holds the object creation code is the **Factory**. So what are
the advantages of using a Factory? We have now encapsulated part of the codebase
that is susceptible to change such that we now have only one place to
make modifications when the implementation changes. Consider if the Factory 
had many clients and not just orderPizza() like in our example. Using 
Factory is great for maintainability.

NOTE: What we have discussed thus far is called the **Simple Factory**. The 
Simple Factory isn't a Design Pattern, but a *programming idiom*. Therefore,
the Simple Factory idiom and the Factory Pattern are two different things.