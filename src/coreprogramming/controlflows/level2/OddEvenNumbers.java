package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number>0){
            for (int i = 1 ; i <= number ;i++  ){
                if (i % 2 ==0){
                    System.out.println(i + " is a even number");
                }
                else{
                    System.out.println(i+" is a odd number");
                }
            }

        }
        else{
            System.out.println("Enter a natural number");
        }
        input.close();

    }
}
