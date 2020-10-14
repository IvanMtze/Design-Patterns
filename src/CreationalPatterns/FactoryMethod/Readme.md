# Intent
Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.
## Also Known As
Virtual Constructor
## Motivation
Frameworks use abstract classes to define and maintain relationships between objects. A framework is often responsible for creating these objects as well. This creates a dilemma: The framework must instantiate classes, but it only knows about abstract classes, which it cannot instantiate. The Factory Method pattern offers a solution. It encapsulates the knowledge of which Document subclass to create and moves this knowledge out of the
framework.
Once an Application sub-class is instantiated, it can then instantiate application-specific factory method because it's responsible for "manufacturing" an object. 

## Applicability
Use the Factory Method pattern when
• a class can't anticipate the class of objects it must create.
• a class wants its subclasses to specify the objects it creates.
• classes delegate responsibility to one of several helper subclasses, and you
want to localize the knowledge of which helper subclass is the delegate.

## Participants
Product
- defines the interface of objects the factory method creates.
ConcreteProduct
- implements the Product interface.
Creator 
- declares the factory method, which returns an object of type Product. Cre-
ator may also define a default implementation of the factory method that
returns a default ConcreteProduct object.
- may call the factory method to create a Product object
Collaborations
• Creator relies on its subclasses to define the factory method so that it returns
an instance of the appropriate ConcreteProduct.

## Consequences
Factory methods eliminate the need to bind application-specific classes into your code. The code only deals with the Product interface; therefore it can work with any user-defined ConcreteProduct classes.
A potential disadvantage of factory methods is that clients might have to subclass the Creator class just to create a particular ConcreteProduct object. Subclassing is fine when the client has to subclass the Creator class anyway, but otherwise the client now must deal with another point of evolution.

Here are two additional consequences of the Factory Method pattern:
1. Provides hooks for subclasses. Creating objects inside a class with a factory
method is always more flexible than creating an object directly. Factory
Method gives subclasses a hook for providing an extended version of an
object
2. Connects parallel class hierarchies. In the examples we've considered so far, the
factory method is only called by Creators. But this doesn't have to be the
case; clients can find factory methods useful, especially in the case of parallel
class hierarchies.
Parallel class hierarchies result when a class delegates some of its responsibil-
ities to a separate class.


## Implementation
Consider the following issues when applying the Factory Method pattern:

1. Two major varieties. The two main variations of the Factory Method pattern are

(1) the case when the Creator class is an abstract class and does not provide
an implementation for the factory method it declares, and (2) the case when
the Creator is a concrete class and provides a default implementation for
the factory method. It's also possible to have an abstract class that defines a
default implementation, but this is less common.

The first case requires subclasses to define an implementation,because there's
no reasonable default.

In the second case, the concrete Creator uses the fac-
tory method primarily for flexibility. It's following a rule that says, "Create
objects in a separate operation so that subclasses can override the way they're
created." This rule ensures that designers of subclasses can change the class
of objects their parent class instantiates if necessary.

2. Parameterized factory methods. Another variation on the pattern lets the fac-
tory method create multiple kinds of products. The factory method takes aparameter that identifies the kind of object to create. All objects the factory
method creates will share the Product interface
It isn't interested in other classes.
Hence MyCreator extends the kinds of products created, and it defers re-
sponsibility for creating all but a few products to its parent.

3. Language-specific variants and issues. Different languages lend themselves to
other interesting variations and caveats.
An even more flexible approach akin to parameterized factory methods is to
store the class to be created as a class variable of Application. That way
you don't have to subclass Application to vary the product.
Instead of creating the
concrete product in the constructor, the constructor merely initializes it to 0.
The accessor returns the product. But first it checks to make sure the product
exists, and if it doesn't, the accessor creates it. This technique is sometimes
called lazy initialization.

4. Using templates to avoid subclassing. As we've mentioned, another potential
problem with factory methods is that they might force you to subclass just
to create the appropriate Product objects. Another way to get around this in
C++ is to provide a template subclass of Creator that's parameterized by the
Product class

5. Naming conventions. It's good practice to use naming conventions that make
it clear you're using factory methods.

## Known Uses
Factory methods pervade toolkits and frameworks. SodefaultControllerClass is the real factory method, that is, the method that subclasses should override.
A more esoteric example in Smalltalk-80 is the factory method parserClass defined by Behavior

## Related Patterns
Abstract Factory (87) is often implemented with factory methods. The Motivation example in the Abstract Factory pattern illustrates Factory Method as well. Factory methods are usually called within Template Methods (325). In the docu-
ment example above, NewDocument is a template method. Prototypes (117) don't require subclassing Creator. However, they often require an Initialize operation on the Product class. Creator uses Initialize to initialize the object. Factory Method doesn't require such an operation


_This text was taken from "Design Patterns: Elements for reusable Object-Oriented Software"_ by gang of four.

