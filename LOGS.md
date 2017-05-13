# User input
```
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
- Identity, Attribute, Behavior
- Method overloading http://stackoverflow.com/questions/997482/does-java-support-default-parameter-values
```
# Method
static void sayHello() {
    System.out.println("Hello World!");
 }
 
# Method with return
static int sum(int val1, int val2) {
  return val1 + val2;
}

# Reference Type
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

# Constant
public static final double PI = 3.14; 
```