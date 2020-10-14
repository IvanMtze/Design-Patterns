# Abstract Factory
### Intent

Provide an interface for creating families of related or dependent objects without specifying ther concreate class.

### Also known as 
Kit

### Motivation

Consider a user interface toolkit that supports multiple look-and-feel standards, such as Motif and Presentation Manager. To be portable across look-and-feel standards, an application should not hard-code it widgets for a particual look and feel. Instantiating look-and-feel classes of widgets throughtout the application makes it hard to change the look and feel later.
WidgetFactory's interface has an operation that returns a new widget object for each abstract widget class. Clients call these oper-
ations to obtain widget instances, but clients aren't aware of the concrete classes they're using. Thus clients stay independent of the prevailing look and feel. Clients create widgets solely through the WidgetFactory interface and have no knowl- edge of the classes that implement widgets for a particular look and feel. In other words, clients only have to commit to an interface defined by an abstract class, not a particular concrete class.
A WidgetFactory also enforces dependencies between the concrete widget classes.

### Applicability
Use the Abstract Factory pattern when

1.-A system should be independent of how its products are created, composed,
and represented.

2.-A system should be configured with one of multiple families of products.

3.-A family of related product objects is designed to be used together, and you
need to enforce this constraint.

4.-You want to provide a class library of products, and you want to reveal just
their interfaces, not their implementations.

### Implementation
1. Factories as singletons.

2. Creating the products.

3. Defining extensible factories.


_This text was taken from "Design Patterns: Elements for reusable Object-Oriented Software"_ by gang of four.
