# Scanner (build-in class)
```
1. User Input 
import java.util.Scanner; 
Scanner myVar = new Scanner(System.in);

Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()

import java.util.Scanner;

class MyClass {
  public static void main(String[ ] args) {
    Scanner myVar = new Scanner(System.in);
    System.out.println(myVar.nextLine());        
  }
}
```

# Class
- Modifier http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html 
```
            | Class | Package | Subclass | Subclass | World
            |       |         |(same pkg)|(diff pkg)| 
————————————+———————+—————————+——————————+——————————+————————
public      |   +   |    +    |    +     |     +    |   +     
————————————+———————+—————————+——————————+——————————+————————
protected   |   +   |    +    |    +     |     +    |   x     
————————————+———————+—————————+——————————+——————————+————————
no modifier |   +   |    +    |    +     |     x    |   x
————————————+———————+—————————+——————————+——————————+————————
private     |   +   |    x    |    x     |     x    |   x
```
- Identity, Attribute, Behavior
- Method overloading http://stackoverflow.com/questions/997482/does-java-support-default-parameter-values
- OOP: encapsulation, inheritance, polymorphism, and abstraction.
- Encapsulation
```
- Control of the way data is accessed or modified
- More flexible and easily changed code
- Ability to change one part of the code without affecting other parts
```
- Inheritance
```
1. Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. * non-private variables and methods.
2. The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).
3. extends keyword
# example 
class Dog extends Animal {
 // some code
}
```
- Polymorphism
```
One-method difference implementation (Parent class & multi child-class use 1 method but difference detail.)
Example: Animal sound() method, Cat sound() different with Dog sound()
```

# Method
```
1. Method
static void sayHello() {
    System.out.println("Hello World!");
 }
 
2. Method with return
static int sum(int val1, int val2) {
  return val1 + val2;
}

3. Reference Type
public class MyClass {
  public static void main(String[ ] args) {
    Person j;
    j = new Person("John");
    j.setAge(20);
    celebrateBirthday(j);
    System.out.println(j.getAge());
  }
  static void celebrateBirthday(Person p) {
    p.setAge(p.getAge() + 1);
  }
}
//Outputs "21"

4. Constant
public static final double PI = 3.14; 

5. Encapsulation: use of modifier effective

6. Overriding & Overloading 
- Should have the same return type and arguments
- The access level cannot be more restrictive than the overridden method's access level (Example: If the superclass method is declared public, the overriding method in the sub class can be neither private nor protected)
- A method declared final or static cannot be overridden
- If a method cannot be inherited, it cannot be overridden
- Constructors cannot be overridden

7. Abstration
- If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
- To use an abstract class, you have to inherit it from another class.
- Any class that contains an abstract method should be defined as abstract.
* An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon): abstract void walk();

8. Interfaces
An interface is a completely abstract class that contains only abstract methods.
Some specifications for interfaces:
- Defined using the interface keyword.
- May contain only static final variables.
- Cannot contain a constructor because interfaces cannot be instantiated.
- Interfaces can extend other interfaces.
- A class can implement any number of interfaces.
* A class can inherit from just one superclass, but can implement multiple interfaces!

9. Type casting
double a = 42.571;
int b = (int) a;
- Upcasting (automatically). Ex: Animal a = new Cat();
- Downcasting 
Animal a = new Animal();
((Cat)a).makeSound();

10. Anonymous class
class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

Machine m = new Machine() {
  @Override public void start() {
    System.out.println("Wooooo");
  }
};
  m.start();

11. Inner class (class inside another class)
class Robot {
  int id;
  Robot(int i) {
    id = i;
    Brain b = new Brain();
    b.think();
  }

  private class Brain {
    public void think() {
      System.out.println(id + " is thinking");
    }
  }

}

* The class Robot has an inner class Brain. The inner class can access all of the member variables and methods of its outer class, but it cannot be accessed from any outside class.

12. Enum: collection of constants
enum Rank {
  SOLDIER,
  SERGEANT,
  CAPTAIN
}

Rank a = Rank.SOLDIER;

13. Java API http://docs.oracle.com/javase/8/docs/api/
import java.awt.*;
* The wildcard character (*) is used to import all of the classes in the package.
```

# Exceptions, Lists, Threads & Files
```
1. Exceptions
public class MyClass {
  public static void main(String[ ] args) {
    try {
      int a[ ] = new int[2];
      System.out.println(a[5]);
    } catch (Exception e) {
      System.out.println("An error occurred");
    }
  }
}
//Outputs "An error occurred"

* Notice the (Exception e) statement in the catch block - it is used to catch all possible Exceptions.

1.1 throw
- The throw keyword allows you to manually generate exceptions from your methods. Some of the numerous available exception types include the IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException, and so on.

// example
int div(int a, int b) throws ArithmeticException {
  if(b == 0) {
    throw new ArithmeticException("Division by Zero");
  } else {
    return a / b;
  }
}

// another example
public void do(int x)
  throws  IOException  {
  if(x<0)
  {
   throw  new  IOException();
  }
}

try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
}

2. Threads
2.1 Extend the Thread class
Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
Then you create a new object of your class and call it's start method to run the thread.
// Example:
class Loader extends Thread {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Loader obj = new Loader();
    obj.start();
  }
}

// another
class A extends Thread {
	public void run () {
		System.out.println("Hello");
	}
	public static void main(String[ ] args) {
		A object = new A();
		object.start();
   }
}

// another way of threads
class Loader implements Runnable {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Thread t = new Thread(new Loader());
    t.start();
  }
}

* The Thread.sleep() method pauses a Thread for a specified period of time. For example, calling Thread.sleep(1000); pauses the thread for one second. Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround it with a try/catch block.

2.2 Types of Exceptions
There are two exception types, checked and unchecked (also called runtime). The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.
As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException. This is an example of a checked exception. Your code will not compile until you've handled the exception.

2.3 ArrayList
The Java API provides special classes to store and manipulate groups of objects.
One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.
Create an ArrayList as you would any object.

import java.util.ArrayList;
//...
ArrayList colors = new ArrayList();

or 

ArrayList<String> colors = new ArrayList<String>(10);

// example 
import java.util.ArrayList;

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.remove("Green");

    System.out.println(colors);
  }
}
// Output: [Red, Blue, Orange]

* Other useful methods include the following:
- contains(): Returns true if the list contains the specified element 
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list

Note: As with arrays, the indexing starts with 0.

2.4 LinkedList
The LinkedList is very similar in syntax to the ArrayList.
You can easily change an ArrayList to a LinkedList by changing the object type.

// example LinkedList
import java.util.LinkedList;

public class MyClass {
  public static void main(String[ ] args) {
    LinkedList<String> c = new LinkedList<String>();
    c.add("Red");
    c.add("Blue");
    c.add("Green");
    c.add("Orange");
    c.remove("Green");
    System.out.println(c);
  }
}
// Outputs [Red, Blue, Orange]

2.5 LinkedList vs. ArrayList

The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.

In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

2.6 HashMap
Arrays and Lists store elements as ordered collections, with each element given an integer index.
HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). 
The put, remove, and get methods are used to add, delete, and access values in the HashMap.
// Example:
import java.util.HashMap;
public class MyClass {
  public static void main(String[ ] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Amy", 154);
    points.put("Dave", 42);
    points.put("Rob", 733);
    System.out.println(points.get("Dave")); 
  }
}
// Outputs 42

2.7. Sets
A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
One of the implementations of the Set is the HashSet class.
// Example:
import java.util.HashSet;

public class MyClass {
  public static void main(String[ ] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("A");
    set.add("B");
    set.add("C");
    System.out.println(set);
  }
}
//  Output: [A, B, C]

* LinkedHashSet automatically order

2.8 Sorting Lists
One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. The methods in the Collections class are static, so you don't need a Collections object to call them.
// example 
public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("tiger");
    animals.add("cat");
    animals.add("snake");
    animals.add("dog");
       
    Collections.sort(animals);
       
    System.out.println(animals);
  }
}
/* Outputs:
[cat, dog, snake, tiger]
*/

// sort num
import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(3);
    nums.add(36);
    nums.add(73);
    nums.add(40);
    nums.add(1);

    Collections.sort(nums);
    System.out.println(nums);
  }
}
/* Outputs:
[1, 3, 36, 40, 73]
*/

* Other useful methods in the Collections class:
max(Collection c): Returns the maximum element in c as determined by natural ordering.
min(Collection c): Returns the minimum element in c as determined by natural ordering.
reverse(List list): Reverses the sequence in list.
shuffle(List list): Shuffles (i.e., randomizes) the elements in list.

2.9 Iterators
An Iterator is an object that enables to cycle through a collection, obtain or remove elements. 
Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. By using this iterator object, you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:
hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
next(): Returns the next object and advances the iterator.
remove(): Removes the last object that was returned by next from the collection.

The Iterator class must be imported from the java.util package.
// Example
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
   public static void main(String[ ] args) {
  LinkedList<String> animals = new LinkedList<String>();
  animals.add("fox");
  animals.add("cat");
  animals.add("dog");
  animals.add("rabbit");

  Iterator<String> it = animals.iterator();
  String value = it.next();
  System.out.println(value);
}
}
//Outputs "fox"
* it.next() returns the first element in the list and then moves the iterator on to the next element.
Each time you call it.next(), the iterator moves to the next element of the list.

Iterator<String> it = animals.iterator();
    while(it.hasNext()) {
      String value = it.next();
      System.out.println(value);   
     }
  }
```

# Files
1. Open files
```
import java.io.File;
...
File file = new File("C:\\data\\input-file.txt");

// example 
import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\lehungio\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}

*The getName() method returns the name of the file.
Note that we used double backslashes in the path, as one backslash should be escaped in the path String.
```

2. Read files
```
try {
  File x = new File("C:\\lehungio\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {
}

* try/catch block, because there's a chance that the file may not exist.

try {
  File x = new File("C:\\lehungio\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}

* The file's contents are output word by word, because the next() method returns each word separately.

3. Write files
import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\lehungio\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}

* This creates an empty file at the specified path. If the file already exists, this will overwrite it.

import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\lehungio\\test.txt");
    f.format("%s %s %s", "1","Momo", "Taro \r\n");
    f.format("%s %s %s", "2","Super", "Man");
    f.close();    
  } catch (Exception e) {
    System.out.println("Error");
  }
  }
}
```

# Quiz

```
Fill in the blanks to declare a function that takes two integers as arguments and prints their division. Handle the possible exception.
void myFunc(int a, int b) {
try {
    System.out.println(a / b);
  } catch (Exception e) { 
     System.out.println("Error");
  }
}
```
