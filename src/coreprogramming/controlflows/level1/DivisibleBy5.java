package coreprogramming.controlflows.level1;
import java.util.Scanner;
public class DivisibleBy5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 5 == 0){
            System.out.println("It is divisible");
        }
        else{
            System.out.println("NOt divisible");
        }
    }
}