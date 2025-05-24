import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter the operator: ");
        String operator = scanner.next();
        int resualt;

        switch (operator) {
            case "+":
                resualt = a + b;
                break;
            case "-" : 
            resualt = a - b ;
            break;
            case "/":
                resualt = a / b;
                break;
                case "*":
                resualt = a * b;
                break;
            default: System.out.println("Enter one of the following operators: ");
            System.out.println("+ , / , - , *");
            scanner.close();
                return;
        }

         System.out.println("your numbers are: " + a + " and" +" " + b + " and your chosen operator is " + operator + " and the resualt is: " + resualt);

        scanner.close();
    }
}
