package com;

public class BasicMath {
    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();

        basicMath.isEvenNumber(24);
        basicMath.isEvenNumber(0);
        basicMath.isEvenNumber(-30);
        basicMath.isEvenNumber(-35);
        basicMath.isOddNumber(56);
        basicMath.isOddNumber(-65);
        basicMath.isOddNumber(5);
        basicMath.isOddNumber(0);
    }

    private void isOddNumber(int i) {
        if (i % 2 != 0)
            System.out.println(i + " is Odd Number");
        else
            System.out.println(i + " is not Odd Number");

    }

    private void isEvenNumber(int i) {
        if (i % 2 == 0)
            System.out.println(i + " is Even Number");
        else
            System.out.println(i + " is not Even Number");


    }
}
