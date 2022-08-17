import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        n= girdi.nextInt();

        System.out.print("Üs olacak sayı :");
        k= girdi.nextInt();
        int total = 1;

        for (int i = 0;i<=k;i++){
            total *=n;
        }
        System.out.println("Cevap : "+total);
    }
}
