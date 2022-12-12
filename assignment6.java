import java.util.Scanner;

public class Main {


    //question 1
    public static Scanner scan = new Scanner(System.in);

//
//    public static void main(String[] args) {
//        System.out.println("enter the no of players");
//        int n = scan.nextInt();
//        String[] names = new String[n];
//        int[] bid = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("enter your name");
//            names[i] = scan.next();
//            bid[i] = setBidvalue();
//        }
//        System.out.println(bidCalculator(names,bid));
//    }
//
//    public static String bidCalculator(String[] arry, int[] bid) {
//        int m = 0;
//        String winner = arry[m];
//        for (int i = 1; i < bid.length - 1; i++) {
//            if (bid[m] < bid[i]) {
//                m = i;
//                winner = arry[i];
//            }
//        }
//        return winner;
//    }
//
//    public static int setBidvalue(){
//        int i = 0;
//        while(true){
//            System.out.println("please enter a bid less than 2000");
//            int value = scan.nextInt();
//            if (value>2000){
//                continue;
//                }
//            return value;
//        }


// question 2
//    public static String prev = "";
//
//
//    public static void main(String[] args){
//        String str;
//        while(true){
//            str = scan.nextLine();
//            if(str.equals(99999)){
//                break;
//            }
//
//            System.out.println(direction(str) + " " + str.substring(2,5));
//        }
//    }
//
//    public static String direction(String stringInput) {
//        int str1 = Integer.parseInt(stringInput.substring(0, 1));
//        int str2 = Integer.parseInt(stringInput.substring(1, 2));
//        int sum = str1 + str2;
//        if (sum == 0) {
//            return prev;
//        } else if (sum % 2 == 0) {
//            prev = "Right";
//        } else {
//            prev = "Left";
//        }
//        return prev;
//    }
}


