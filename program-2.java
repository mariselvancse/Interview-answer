import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sin =new Scanner(System.in);

        int N=sin.nextInt();
        int value=1;
        for(int i=1;i<=N;i++)
        {
            System.out.print(value+" ");
            value=value+2;
        }
    }
}
