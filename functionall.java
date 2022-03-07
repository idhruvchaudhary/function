public class functionall {

    public static int sumfun(int a, int b) {

        return a + b;

    }

    public static int fectfun(int a) {
        int f = 1, i;

        for (i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;

    }

    public static void gadiyo(int a) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));

        }

    }

}
