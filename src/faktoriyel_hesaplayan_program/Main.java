package faktoriyel_hesaplayan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,n_faktoriyel=1,r_faktoriyel=1,cıkarma_faktoriyel = 1,formul;
        Scanner input = new Scanner(System.in);
        System.out.print("N kümesinin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("r grubunun eleman sayısını giriniz: ");
        r = input.nextInt();
        int cıkarma = n-r;
        for (int i = 1;i<=n;i++){
            n_faktoriyel *= i;
        }
        for (int j = 1;j<=r;j++){
            r_faktoriyel *= j;
        }
        for (int k = 1;k<=cıkarma;k++){
            cıkarma_faktoriyel *= k;
        }
        formul = n_faktoriyel/(r_faktoriyel*cıkarma_faktoriyel);
        System.out.print("kombinasyon sonuç: "+formul);
    }
}
