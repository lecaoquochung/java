import java.util.Scanner;
import samples.Vehicle;
import samples.Car;

class BasicExample {
	public static void main(String[ ] args) {
        sayHello("World!");
        quiz01();
        
        int x = sum(5,7);
        System.out.println("Method return value: " + x);
        
        // object Animal
        Animal dog = new Animal();
        dog.bark();
        
        // object Vehicle
        Vehicle AAA = new Vehicle();        
        AAA.setColor("Blue");
        System.out.printf(AAA.getColor());
        AAA.horn();
        System.out.println(Vehicle.COUNT);
        
        // example inheritance car form vehicle
        Car HV1 = new Car();
        HV1.setBrand("Toyota");
    }
	
	// hello world
	static void sayHello(String name) {
//		TODO default value in java
//		Reference http://stackoverflow.com/questions/997482/does-java-support-default-parameter-values
	    System.out.println("Hello" + " " + name);
	}
	
	// example user input
	static void userInput() {
		// user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String username = input.next();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println(String.format("%s, your age is %d", username, age));
        
        input.close();
	}
	
	// example string array
	static void strArr() {
        String[ ] arr = { "A", "B", "Hello Array", "D"};
        System.out.println(arr[2]);
        System.out.println(arr.length); // array length
	}
	
	// example integer array
	static void intArr() {
		// integer array
        int [ ] myIntArr = {6, 42, 3, 7};
        int sum=0;
        
        for(int x=0; x<myIntArr.length; x++) {
           sum += myIntArr[x];
        }
        System.out.println(sum);
	}
	
	// example multidimensional array
	static void multiArr() {
		// multidimensional array
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
        int x = sample[1][0];
        System.out.println(x);
	}

	// quiz 01: array quiz
	static void quiz01() {
		// array quiz
        int result = 0;
        for (int i = 0; i < 5; i++) {
          if (i == 3) { 
             result += 10;
           } else {
             result += i;
           }	
        }
        System.out.println("Quiz 01 result:" + result);
	}
	
	// example for each loop
	static void exampleForEachLoop() {
		// for each loop
        int[ ] primes = {2, 3, 5, 7};

        for (int t: primes) {
           System.out.println(t); 
        }
	}
	
	// example static method with return value
	static int sum(int val1, int val2) {
	  return val1 + val2;
	}
	
	// example return max value
	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	// method overloading by datatype
	static double max (double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
}