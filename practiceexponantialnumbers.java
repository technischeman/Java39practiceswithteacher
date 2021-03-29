package practice1;

import java.util.Scanner;

public class practiceexponantialnumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write power of exponantial number ");
        int power=input.nextInt();
        System.out.println("write base of exponantial number ");
        int base=input.nextInt();
        int last=1;
        for (int i = 1; i <=power ; i++) {
             last*=base;

        }
        System.out.println(last);



}}
