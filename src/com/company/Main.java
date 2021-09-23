package com.company;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("Sum of a + b = "+ sum(a,b));
        System.out.println("Product of a * b = "+ product(a,b));
        a = 200000;
        b = 5;
        int c = 2;
        System.out.println("Interest of rupees a for b years  at c percent = "+ interest(a,b,c));

    }

    private static int sum(int x, int y) {
        int c = x+y;
        return c;
    }
    private static int product(int a, int b){
        int c = a*b;
        return c;
    }





    private static  int interest(int principleAmount, int years, int interestRate){

        int interestPerMonth = (principleAmount * interestRate) / 100;
        int interestAmount =  interestPerMonth * years*12;



        return interestAmount;
    }
}
