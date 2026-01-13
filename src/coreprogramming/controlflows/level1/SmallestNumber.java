package coreprogramming.controlflows.level1;
import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println(number1+" is smallest");

        }
        else if (number2 < number1 && number2 < number3){
            System.out.println(number2+" is smallest");

        }
        else{
            System.out.println(number3+"is smallest");
        }
    }
}