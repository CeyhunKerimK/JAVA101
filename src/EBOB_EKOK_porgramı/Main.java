package EBOB_EKOK_porgramı;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz: ");
        n2 = input.nextInt();
        int k=1;

        int new_number = 1;
        while (k<=(n1*n2)){
            if ((k%n1==0)&&(k%n2==0)){
                new_number=k;
                break;
            }
            k++;
        }
        int EKOK = (n1*n2)/new_number;
        System.out.println("n1 ve n2'nin EKOK'u: "+EKOK);
        System.out.println("n1 ve n2'nin EBOB'u: "+new_number);
    }
}
