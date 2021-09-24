class Practice {
    public static void main(String[] args) {
        practiceIfElse();
        practiceIfElse2();
        practiceIfElse3();
        practiceDivision();
        practiceSwitch();
        explain("Ears");
    }

    private static void explain(String part) {
        switch (part) {
            case "Eyes":
                System.out.println("Body part responsible for seeing world.");
                break;
            case "Nose":
                System.out.println("Body part responsible for smelling surrounding");
                break;
            case "Ears":
                System.out.println("Body part responsible for hearing sounds");
                break;

            default:
                System.out.println("Body part not known");
        }
    }


    private static void practiceSwitch() {
        String branch = "CIVIL";
        switch (branch) {
            case "CSE":
                System.out.println("CSE has ds, c++, oops subjects");
                break;
            case "ECE":
                System.out.println("ECE has de, analog, labs subjects");
                break;
            case "EEE":
                System.out.println("EEE has phy, circuits, grid subjects");
                break;
            default:
                System.out.println("Every branch has phy,c++, m1 subjects");
        }
    }

    private static void practiceDivision() {
        int x = 15;
        int y = 3;
        System.out.println(" division of x / y = " + division(x, y));
    }

    private static int division(int x, int y) {
        int c = x / y;
        return c;
    }

    private static void practiceIfElse3() {
        int numberOfGirls = 25;
        int numberOfBoys = 30;
        int totalStrength = 55;
        if (totalStrength == numberOfGirls + numberOfBoys)
            System.out.println("totalStrength equal to numberOfGirls + numberOfBoys");
        else
            System.out.println("totalStrength not equal to numberOfGirls + numberOfBoys");

    }

    private static void practiceIfElse2() {
        int choclates = 15;
        int iceCreams = 20;
        int balls = 50;
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