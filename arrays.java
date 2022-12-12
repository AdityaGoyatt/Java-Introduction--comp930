import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[][] arr1 = new int[3][4];
//        int[][] arr2 = new int[3][4];
//        int[][] arr_sum = new int[3][4];
//        int[][] arry = new int[4][3];
//        int[][] factorial_arry = new int[4][3];
//        Random random = new Random();
//        int min = 1;
//        int max = 10;
//        for(int i = 0; i <4; i++){
//            for(int m = 0; m<3;m++){
//                arry[i][m] = random.nextInt(max - min + 1) +min;
//            }
//        }
//        for(int i = 0; i <4; i++){
//            for(int m = 0; m<3;m++) {
//                System.out.print(arry[i][m]+ " ");
//            }
//            System.out.println(" ");
//            }
//        for(int i = 0; i <4; i++){
//            for(int m = 0; m<3;m++){
//                int s = 1;
//                int k = arry[i][m];
//
//                for (int j = 1; j<=k; j++){
//                    s = s*j;
//                }
//                factorial_arry[i][m] = s;
//            }
//        }
//        for(int i = 0; i <4; i++){
//            for(int m = 0; m<3;m++) {
//                System.out.print(factorial_arry[i][m] + " ");
//            }
//            System.out.println(" ");
//        }


        int[][] arry = new int[3][4];
        Random random = new Random();
        int min = 1;
        int max = 20;
        for (int i = 0; i < 3; i++) {
            for (int m = 0; m < 4; m++) {
                arry[i][m] = random.nextInt(max - min + 1) + min;
            }
        }
//        for(int i = 0; i <3; i++){
//            for(int m = 0; m<4;m++){
//                System.out.print(arry[i][m] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("factors : \n");
//
//        for(int i = 0; i <3; i++){
//            for(int m = 0; m<4;m++){
//                int number = arry[i][m];
//                for (int j = 1; j<=number; j++){
//                    if (number % j == 0){
//                        System.out.print(j + ", ");
//                    }
//                }
//                System.out.println(" ");
//
//            }
//        }
//
//
//        for (int i = 0; i < 3; i++) {
//            for (int m = 0; m < 4; m++) {
//                System.out.print(arry[i][m] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("the prime numbers are ");
//        int count = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int m = 0; m < 4; m++) {
//                count = 0;
//                int number = arry[i][m];
//                for (int j = 1; j <= number; j++) {
//                    if (number % j == 0) {
//                        count = count + 1;
//                    }
//                }
//                if (count < 3) {
//                    System.out.print(number + ", ");
//                }
//            }
//        }
//    }
//}