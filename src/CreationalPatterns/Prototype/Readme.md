
_This text was taken from "Design Patterns: Elements for reusable Object-Oriented Software"_ by gang of four.
Intent
Specify the kinds of objects to create using a prototypical instance, and create new
objects by copying this prototype.
Applicability
Use the Prototype pattern when a system should be independent of how its
products are created, composed, and represented; and
• when the classes to instantiate are specified at run-time, for example, by
dynamic loading; or
• to avoid building a class hierarchy of factories that parallels the class hierar-
chy of products; or
• when instances of a class can have one of only a few different combinations
of state. It may be more convenient to install a corresponding number of
prototypes and clone them rather than instantiating the class manually, each
time with the appropriate state.
Participants
• Prototype (Graphic)
- declares an interface for cloning itself.
• ConcretePrototype (Staff, WholeNote, HalfNote)
- implements an operation for cloning itself.
• Client (GraphicTool)
-
creates a new object by asking a prototype to clone itself.
Collaborations
• A client asks a prototype to clone itself.
Consequences
Prototype has many of the same consequences that Abstract Factory (87) and
Builder (97) have: It hides the concrete product classes from the client, thereby
reducing the number of names clients know about. Moreover, these patterns let a
client work with application-specific classes without modification.
Additional benefits of the Prototype pattern are listed below.
1. Adding and removing products at run-time. Prototypes let you incorporate a
new concrete product class into a system simply by registering a prototyp-
ical instance with the client.
2. Specifying new objects by varying values. Highly dynamic systems let you de-
fine new behavior through object composition—by specifying values for an
object's variables, for example—and not by defining new classes. You ef-
fectively define new kinds of objects by instantiating existing classes and
registering the instances as prototypes of client objects. A client can exhibit
new behavior by delegating responsibility to the prototype.
This kind of design lets users define new "classes" without programming.
In fact, cloning a prototype is similar to instantiating a class. The Prototype
pattern can greatly reduce the number of classes a system needs.