import java.util.*;
public class File3 {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter num2: ");
        int n2=sc.nextInt();

        int res1=1;
        int res2=1;

        for(int i=2;i<=n1;i++){
            if (n1%i==0) {
                res1=res1*i;
                n1=n1/i;
                i=1;
            }
        }

        for(int i=2;i<=n2;i++){
            if(n2%i==0){
                res2=res2*i;
                n2=n2/i;
                i=1;
            }
        }
     System.out.println("LCM is: "+res1*res2);
    }
}
