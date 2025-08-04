import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Second number is zero, please enter a non-zero number");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) { 
            System.out.println("Enter a First Number:");
            double number1 = sc.nextDouble();
            System.out.println("Enter a Second Number:");
            double number2 = sc.nextDouble();
            System.out.println("Choose::-\n-------- 1=Add, 2=Subtract, 3=Multiply, 4=Divide, 5=Exit---------");
            int choice = sc.nextInt();
            
            if (choice == 5) {
                break;
            }
            
            String result = switch (choice) {
                case 1 -> "Result: " + add(number1, number2);
                case 2 -> "Result: " + subtract(number1, number2);
                case 3 -> "Result: " + multiply(number1, number2);
                case 4 -> "Result: " + divide(number1, number2);
                default -> "Invalid choice!";
            };
            System.out.println(result);
        }
        sc.close(); 
    }
}