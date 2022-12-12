import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Assignment 3 Deadline: October 18th
//        1. The number 6 is said to be a perfect number because it is equal to the sum of all its
//        exact divisors (other than itself).
//        6=1+2+3
//        Write a program that get a number from the user and define this number is perfect
//        number or not.
//        2. The number 153 has the property that it is equal to the sum of the cubes of its
//        digits: 13+53 +33 = 153. Write a program that will find all the three-digit natural
//        numbers that have this property.
//        3. Write a program that first prompts the user for a value of x, reads x (as a double)
//        and then computes and prints the value of eX without using either of the
//        methods exp or pow from the Math class. The value of ex
//        is given by the
//        following power series
        /*
        Answer 1
        System.out.println(" Please enter a number");
        int number = scan.nextInt();
        int m = 0;

        for (int i = 1; i<number ; i++){
            if (number%i == 0){

                m = m+i;

            }
        }

        if (number == m){
            System.out.println(number + " is a perfect number");
        }
        else{
            System.out.println(m +  " is not a perfect number");
        }*/


        //question 2

//        int i = 0;
//        for (i = 100; i <= 999; i++) {
//            int first_digit = i / 100;
//            int second_digit = (i % 100) / 10;
//            int third_digit = (i % 10);
//
//            int pow_first = 1;
//            int pow_second = 1;
//            int pow_third = 1;
//            for (int j = 1; j <= 3; j++) {
//                pow_first = pow_first * first_digit;
//            }
//            for (int j = 1; j <= 3; j++) {
//                pow_second = pow_second * second_digit;
//            }
//            for (int j = 1; j <= 3; j++) {
//                pow_third = pow_third * third_digit;
//            }
//            if ((pow_first + pow_second + pow_third) == i) {
//                System.out.println(i);
//            }
//        }



        //3

        System.out.println("enter the value of x");
        double x = scan.nextDouble();
        System.out.println("enter the value of n");
        int n = scan.nextInt();
        double power = 1;
        double exponential = 1;
        int factorial = 1;
        for(int i = 1; i <=n; i++) {
            for (int m = 0; m <= i; m++) {
                power = power * x;
            }
            for (int j = 1; j<=i;j++){
                factorial = factorial*j;
            }
            exponential = exponential + power/factorial;
        }
        System.out.println(exponential);
   }
}