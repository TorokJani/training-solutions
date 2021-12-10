package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println(" I add these two numbers: " + firstNum + " + " + secondNum + "!");
        System.out.println(firstNum+secondNum);
    }
}
