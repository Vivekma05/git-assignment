import java.util.*;
public class alphabetical_order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        char a[] = new char[len];
        for (int i = 0; i < len; i++) {
            a[i] = str.charAt(i);
        }
        Arrays.sort(a);
        System.out.println(a);
    }
}

