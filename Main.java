// Class definition
class Sum {
    int num1;
    int num2;

    // Method to calculate and display sum
    void add() {
        int result = num1 + num2;
        System.out.println("Sum: " + result);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create object of class Sum
        Sum obj = new Sum();

        // Assign values
        obj.num1 = 10;
        obj.num2 = 20;

        // Call the method
        obj.add();
    }
}
