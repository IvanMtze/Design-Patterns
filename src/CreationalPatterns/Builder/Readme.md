# Builder
###Intent
Separate the construction of a complex object from its representation so that the
same construction process can create different representations.
 

### Motivation
the Builder pattern separates the algorithm for interpreting a textual
format from how a converted format gets created and represented.

### Applicability
Use the Builder pattern when

1.-the algorithm for creating a complex object should be independent of the
   parts that make up the object and how they're assembled.

2.-the construction process must allow different representations for the object
   that's constructed.

### Participants

#### Builder (TextConverter)
specifies an abstract interface for creating parts of a Product object.

#### ConcreteBuilder
ConcreteBuilder (ASCIIConverter, TeXConverter, TextWidgetConverter)
- constructs and assembles parts of the product by implementing the Builder
interface.
- defines and keeps track of the representation it creates.
- provides an interface for retrieving the product.

#### Director (RTFReader)

-constructs an object using the Builder interface.

#### Product
- represents the complex object under construction. ConcreteBuilder builds
the product's internal representation and defines the process by which it's
assembled.
- includes classes that define the constituent parts, including interfaces for
assembling the parts into the final result


### Consequences
Here are key consequences of the Builder pattern:
- It lets you vary a product's internal representation. The Builder object provides
the director with an abstract interface for constructing the product. The in-
terface lets the builder hide the representation and internal structure of the
product. It also hides how the product gets assembled.
- It isolates the code for construction and representation. The Builder pattern improves
  modularity by encapsulating the way a complex object is constructed and
  represented.
- It gives you finer control over the construction process. Unlike creational pat-
  terns that construct products in one shot, the Builder pattern constructs the
  product step by step under the director's control. Only when the product
  is finished does the director retrieve it from the builder.
  
  
### Implementation
Typically there's an abstract Builder class that defines an operation for each com-
ponent that a director may ask it to create. The operations do nothing by default.
A ConcreteBuilder class overrides operations for components it's interested in
creating.

**1. Assembly and construction interface.**
Builders construct their products in step-
by-step fashion. Therefore the Builder class interface must be general enough
to allow the construction of products for all kinds of concrete builders.

**2. Creating the products.**
Why no abstract class for products? In the common case, the products produced
by the concrete builders differ so greatly in their representation that there
is little to gain from giving different products a common parent class

**3. Empty methods as default in Builder**
They're defined as empty methods instead, letting clients override only the operations they're interested in

_This text was taken from "Design Patterns: Elements for reusable Object-Oriented Software"_ by gang of four.
