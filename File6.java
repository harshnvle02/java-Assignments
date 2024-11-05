import java.util.*;

public class File6 {

    public static void main(String[] args) {
        int n = 5;
        int ft = 0;
        int st = 1;
        int nt = 0;
        System.out.println(ft);
        System.out.println(st);
        for (int i = 2; i <n; i++) {
            nt = ft + st;
            System.out.println(nt);
            ft = st;
            st = nt;
        }

    }
}
