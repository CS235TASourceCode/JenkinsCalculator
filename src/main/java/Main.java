import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator");

        Scanner scanner = new Scanner(System.in);

        while(true){
            String equation = scanner.nextLine();
            String[] math = equation.split(" ");
            switch (math[0]){
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(math[1]), Integer.parseInt(math[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(math[1]), Integer.parseInt(math[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(math[1]), Integer.parseInt(math[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(math[1]), Integer.parseInt(math[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(math[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(math[1])));
                    break;
                default:
                    System.exit(0);
            }
        }


    }
}
