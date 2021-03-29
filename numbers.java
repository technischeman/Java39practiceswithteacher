package practice2;

import java.util.Scanner;

public class numbers {
    public static final String[]digits={"","one","two","three","four","five","six","seven","eight","nine"};
    public static final String[]digits10={"","","twenty","thrty","fourty","fifty","sixty","seventy","eighty","ninety"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write number between 20-100; ");
        int ab=input.nextInt();
        int a=ab%10;
        writenumber(ab);

    }public static void writenumber(int ab){
        int first=ab%10;
        int ten=(ab-first)/10;
        System.out.println(digits10[ten]+digits[first]);
    }
}