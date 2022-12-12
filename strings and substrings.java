import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String str = "java";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        str = str.replace("java", "python");
//        System.out.println(str);
//        str = str.replace('o','@');
//        System.out.println(str);
//
//        int m = str.length();
//        System.out.println(m);
//        // index of
//
//        String str2 = "           java                 java     ";
//        int x = str2.indexOf("java");
//        System.out.println(x);
//        System.out.println(str2.length());
//        System.out.println(str2.indexOf("java",5));
//        System.out.println(str2);

//        String str = "Aditya,Goyat,Crave,Gerome, Jermoe";
//        String[] str2 = str.split(",");
//        for (String i : str2)
//            System.out.println(i);
//
//
//        String str1 = str.substring(0,10);
//        String str3 = str.substring(10);
//        System.out.println(str1);
//        System.out.println(str3);
//        String str = " welcome to [google.com] website.";
//
//        System.out.println(str.substring(str.indexOf('[')+1,str.indexOf(']')));
//        System.out.println(str.charAt(3));

        int number = scan.nextInt();
        String[] str = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("enter value for string");
            str[i] = scan.next();
        }
        for (int i = 0; i < number; i++) {
            System.out.print(str[i] + " ");
        }
    }
}