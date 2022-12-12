//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("enter the numbers");
//        int x,y;
//        x = scan.nextInt();
//        y = scan.nextInt();
//        sumFunction(x,y);
//        substract(x,y);
//    }
//    public static void sumFunction(int num1,int num2) {
//        int sum;
//        sum = num1 + num2;
//        System.out.println(sum);
//
//    }

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter a number");
//        int x = scan.nextInt();
//        System.out.println("enter the power you want to raise it to");
//        int y = scan.nextInt();
//        power(x,y);
//
//    }
//    public static void power(int num1, int num2){
//        int power= 1;
//        for( int i = 0; i<num2; i++){
//            power = power*num1;
//        }
//        System.out.println(power);
//    }
//}

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the number");
//        int number = scan.nextInt();
//        System.out.println("enter the power you want to raise it to");
//        int pow = scan.nextInt();
//        int result_factoial = factorial(number);
//        int result_power = power(number, pow);
//        System.out.println("factorial is : " + result_factoial);
//        System.out.println("power is : " + result_power );
//    }
//    public static int factorial(int num1){
//     int factorial = 1;
//     for (int i = 1; i<=num1; i++) {
//         factorial = factorial*i;
//     }
//     return factorial;
//    }
//    public static int power(int num1, int  num2){
//        int power = 1;
//        for ( int i = 0; i<num2; i++){
//            power = power*num1;
//        }
//        return power;
//    }
//}
//
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the number");
//        int number = scan.nextInt();
//        System.out.println("enter the value of N");
//        int n = scan.nextInt();;
//        double main_result = 0;
//        for (int i = 0; i <=n; i++){
//            main_result = main_result + power(number,i)/factorial(i);
//        }
//        System.out.println(main_result);
//
//
//    }
//    public static double factorial(int num1){
//        double factorial = 1;
//        for (int i = 1; i<=num1; i++) {
//            factorial = factorial*i;
//        }
//        return factorial;
//    }
//    public static double power(int num1, int  num2){
//        double power = 1;
//        for ( int i = 0; i<num2; i++){
//            power = power*num1;
//        }
//        return power;
//    }
//}

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scan.nextInt();
        System.out.println("enter the value of N");
        int n = scan.nextInt();;
        double main_result = 0;
        int count = 2;
        for (int i = 1; i <=n; i = i+2){
            main_result = main_result + power(-1,count)*power(number,i)/factorial(i);
            count++;
        }
        System.out.println(main_result);


    }
    public static double factorial(int num1){
        double factorial = 1;
        for (int i = 1; i<=num1; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static double power(int num1, int  num2){
        double power = 1;
        for ( int i = 0; i<num2; i++){
            power = power*num1;
        }
        return power;
    }
}