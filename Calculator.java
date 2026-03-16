import java.util.Scanner;

class Calculator{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number");
    double firstNum = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Enter second number");
    double secondNum = scanner.nextDouble();
    scanner.nextLine();


    System.out.println("Which operation to perform");

    String operation = scanner.nextLine();
    if (operation.equals("sum")){
        System.out.printf("The sum of %f and %f is %f",firstNum,secondNum, firstNum + secondNum );
    }
    else if (operation.equals("sub")){
        System.out.printf("The subtraction of %f and %f is %f",firstNum,secondNum, firstNum - secondNum );
    }
    else if (operation.equals("mul")){
        System.out.printf("The multiplication of %f and %f is %f",firstNum,secondNum, firstNum * secondNum );
    }
    else if (operation.equals("div")){
        System.out.printf("The division of %f and %f is %f",firstNum,secondNum, firstNum / secondNum );
    }
    else{
        System.out.println("Operation not supported");
    }
    }

}
