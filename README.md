Collection: A collection is simply a group of objects, often referred to as elements.

The Java Collections Framework (JCF) includes interfaces, classes, and algorithms to manage data in different ways, such as storing, retrieving, sorting, and performing various operations on collections of objects.

Java Collections Framework Components

Interfaces: Java Collections Framework defines several core interfaces, each representing different types of collections:
Collection Interface: The root of the hierarchy. All collection interfaces like List, Set, and Queue extend from this.
List Interface: An ordered collection (sequence) that allows duplicates (e.g., ArrayList, LinkedList). Since List preserves the insertion order, it allows positional access and insertion of elements. The List interface is found in java.util package and inherits the Collection interface. It is a factory of the ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions.
Set Interface: A collection that does not allow duplicates (e.g., HashSet, TreeSet).
Queue Interface: A collection designed for holding elements prior to processing (e.g., PriorityQueue, LinkedList).
Map Interface: A collection of key-value pairs, where keys are unique (e.g., HashMap, TreeMap, Hashtable).
Classes: These are the concrete implementations of the interfaces:
ArrayList, LinkedList, Vector: Implement the List interface.
HashSet, TreeSet, LinkedHashSet: Implement the Set interface.
HashMap, TreeMap, Hashtable: Implement the Map interface.
PriorityQueue: Implements the Queue interface.
Utility Classes: Java provides utility classes to help manipulate collections:
Collections: A class that provides static methods (like sorting, searching) for working with collections.
Generics: Collections use Generics to ensure type safety. This allows you to define the type of objects that a collection will store, like List<String> or Map<Integer, String>, avoiding type errors at runtime.


List Interface: 

An ordered collection (sequence) that allows duplicates (e.g., ArrayList, LinkedList). Since List preserves the insertion order, it allows positional access and insertion of elements. 
The List interface is found in java.util package and inherits the Collection interface. 
It is a factory of the ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions.


Operation 1: Adding elements to List class using add() method
Operation 2: Updating elements in List class using set() method
Operation 3: Searching for elements using indexOf(), lastIndexOf methods
Operation 4: Removing elements using remove() method
Operation 5: Accessing Elements in List class using get() method
Operation 6: Checking if an element is present in the List class using contains() method

An ArrayList class which is implemented in the collection framework provides us with dynamic arrays in Java. 
Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
