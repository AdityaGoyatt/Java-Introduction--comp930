import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //question 1

        for(int i = 1; i<=5; i++){
            for(int m = 4; m>=i;m--){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Figure 2

        for (int i = 1; i <= 5; i++) {
            for (int m = 4; m >= i; m--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <=4; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(" ");
            }
            for (int j =7; j >=2*i-1;j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }



        //figure 3


        for (int i = 1; i <= 5; i++) {
            for (int m = 4; m >= i; m--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 1; i--) {
            for (int m = 4; m >= i; m--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        //figure 4

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 2; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}