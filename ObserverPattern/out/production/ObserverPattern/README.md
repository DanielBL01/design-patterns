# The Observer Pattern

A pattern that keeps your objects in the know when something they care about 
happens. It is one of the most commonly used design patterns and very useful.

The Observer Pattern defines a one-to-many dependency between objects so that 
when one object changes state, all of its dependents are notified and updated
automatically.

The "one" in this case is called the Subject and the "many" are called the 
Observers. You can even think about it like a newspaper subscription system where
you have the publisher and subscribers who receive the news.

The one subject then notifies many observers when something in the subject changes.
The observers are dependent on the subject such that when the subject's state chages,
the observers are notified.

### Design Pattern #3
#### Strive for loosely coupled designs between objects that interact

