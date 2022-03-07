import java.util.Scanner;

public class functionsum {

    public static void main(String args[]) {

        functionall f = new functionall();

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("enter the value of a ");
        a = sc.nextInt();

        System.out.println("enter the value of b ");
        b = sc.nextInt();

        System.out.println("total=" + f.sumfun(a, b));

        System.out.println("ect of a =" + f.fectfun(a));

        f.gadiyo(a);
    }

}
