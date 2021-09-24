class Practice {
    public static void main(String[] args) {
        practiceIfElse();
        practiceIfElse2();
    }

    private static void practiceIfElse2() {
       int choclates = 15;
       int iceCreams = 20;
       int balls     = 50;
       if (balls > choclates + iceCreams)
           System.out.println("balls greater than choclates + iceCreams");
       else
           System.out.println("balls not greater than choclates + iceCreams");
    }

    private static void practiceIfElse() {
        int a = 50;
        int b = 5;
        int c = 100;
        if (c < (a * b))
            System.out.println("c less than a*b");
        else
            System.out.println("c not less than a*b");
    }
}
