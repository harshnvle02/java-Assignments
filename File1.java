import java.util.*;

public class File1 {
    public static void main(String[] args) {
        int ch;

        do {

            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            // System.out.println(num);

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

            System.out.println("Again(1/2)?");
            ch = sc.nextInt();

        } while (ch != 2);
    }
}
