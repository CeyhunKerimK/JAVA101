package Sayıları_küçükten_büyüğe_sıralayan_program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner myInput = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = myInput.nextInt();
        System.out.print("b sayısını giriniz: ");
        b = myInput.nextInt();
        System.out.print("c sayısını giriniz: ");
        c = myInput.nextInt();
        if ((a<b)&&(a<c)) {
            if (b < c) {
                System.out.print("a<b<c");
            } else {
                System.out.print("a<c<b");
            }
        }
        else if ((b<a)&&(b<c)){
            if (c < a){
                System.out.print("b<c<a");
            }
            else{
                System.out.print("b<a<c");
            }
        }
        else if ((c<a)&&(c<b)){
            if (b < a){
                System.out.print("c<b<a");
            }
            else{
                System.out.print("c<a<b");
            }
        }

    }
}
