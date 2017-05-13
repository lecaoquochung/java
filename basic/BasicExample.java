import java.util.Scanner;

class BasicExample {
    public static void main(String[ ] args) {
    	// user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String username = input.next();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println(String.format("%s, your age is %d", username, age));
        
        input.close();
    	
    	// hello world
    	System.out.println("Hello World");
    	
    	// string array
        String[ ] arr = { "A", "B", "Hello Array", "D"};
        System.out.println(arr[2]);
        System.out.println(arr.length); // array length
        
        // integer array
        int [ ] myIntArr = {6, 42, 3, 7};
        int sum=0;
        
        for(int x=0; x<myIntArr.length; x++) {
           sum += myIntArr[x];
        }
        System.out.println(sum);
        
        // multidimensional array
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
        int x = sample[1][0];
        System.out.println(x);
        
        // array quiz
        int result = 0;
        for (int i = 0; i < 5; i++) {
          if (i == 3) { 
             result += 10;
           } else {
             result += i;
           }	
        }
        System.out.println("Array Quiz result:" + result);
        
        // for each loop
        int[ ] primes = {2, 3, 5, 7};

        for (int t: primes) {
           System.out.println(t); 
        }
    }
}