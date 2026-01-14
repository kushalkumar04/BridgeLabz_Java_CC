package coreprogramming.controlflows.level2;
import java.util.Scanner;
public class SalaryOfEmployee {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        int salary = input.nextInt();
        int years = input.nextInt();

        if (years > 5){
            double bonus = salary * 0.05;
            System.out.println(bonus);
        }
        else{
            System.out.println("No bonus");
        }
    }
}
