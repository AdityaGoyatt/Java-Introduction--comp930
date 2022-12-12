import java.util.Random;
public class Main {
    public static void main(String[] args) {


        int[][] arry = new int[3][4];
        Random random = new Random();
        int min = 1;
        int max = 20;
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 4; m++) {
                arry[i][m] = random.nextInt(max - min + 1) + min;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 4; m++) {
                System.out.print(arry[i][m] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("the prime numbers are ");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 4; m++) {
                count = 0;
                int number = arry[i][m];
                for (int j = 1; j <= number; j++) {
                    if (number % j == 0) {
                        count = count + 1;
                    }
                }
                if (count < 3) {
                    System.out.print(number + ", ");
                }
                array2[i][j] = number
            }
        }
    }
}