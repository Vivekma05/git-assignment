import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<100000000;i++) {
            System.out.println("enter zero to exit or press any keyword:");
            int a = sc.nextInt();
            if (a == 0) {
                System.exit(0);
            }
            System.out.println("enter the table:");
            double b=sc.nextInt();
            for(int j=1;j<=10;j++) {
                System.out.println(b + " * " + j + " = " + b * j);
            }

        }

    }
}
