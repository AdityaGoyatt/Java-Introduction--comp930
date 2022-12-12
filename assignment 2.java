import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*

        //Answer 1
        System.out.println("Please write your Given name");
        String name = scan.next();
        System.out.println("please enter your hourly pay rate");
        int gpay = 0;
        int pay = scan.nextInt();
        System.out.println("Please enter the number of hours you worked");
        int wrkhr = scan.nextInt();
        if (wrkhr > 40){
            gpay = wrkhr*20 + (wrkhr - 40 )*20;}
        else {
            gpay = wrkhr * 20;
        }
        int tax = 0;
        System.out.println("Please enter your tax category of the following: \nA. no tax deduction\n" +
                "B. tax is 10% of gross pay\n" +
                "C. tax is 20% of gross pay\n" +
                "D. tax is 29% of gross pay \n" +
                "E. taxis35% of grosspay");
        char txcat = scan.next().charAt(0);

        if (txcat == 'E'){

            tax = gpay*35/100;
        }
        else if (txcat == 'D'){

            tax = gpay*29/100;
        }
        else if (txcat == 'C'){

            tax = gpay*20/100;
        }
        else if (txcat == 'B'){
            tax = gpay*10/100;
        }
        else {
            tax = 0;
        }
        int deduction = 0;
        System.out.println("Please Press Y if you want to deduct a sum of $20 from your salary for charity");
        char dedctn = scan.next().charAt(0);
        if (dedctn == 'Y'){
            deduction = 20;
        }
        int grosspay = gpay - tax - deduction;
        System.out.println("Given Name = " + name);
        System.out.println("Gross Pay = " + grosspay );
        System.out.println("Deductions = " + deduction);
        System.out.println("Net Pay = " + gpay );*/

        //Answer 2

        /*System.out.println("Please enter the number of cents you want change for (up to 100)");
        int amt = scan.nextInt();
        int qtrs = amt / 25;
        int dims = (amt - qtrs*25)/10;
        int nik = (amt - qtrs*25 -dims*10)/5;
        int cents = (amt - qtrs*25 - dims*10 - nik*5);
        String q = String.valueOf(qtrs) + " Quarters ";
        if (qtrs == 0){
            q = " ";
        }
        String d = String.valueOf(dims) + " Dimes ";
        if (dims == 0){
            d = " ";
        }
        String n = String.valueOf(nik) + " Nickels ";
        if (nik == 0){
            n = " ";
        }
        String c = String.valueOf(cents) + " Cents ";
        if (cents == 0){
            c = " ";
        }

        System.out.println(amt + " Cents: " + q + d + n + c);*/

    }
}
