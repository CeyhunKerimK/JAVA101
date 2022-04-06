package Tek_sayıların_toplamını_bulan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner myInput = new Scanner(System.in);
        boolean loopInput = true;
        while (loopInput){
            System.out.print("sayı giriniz: ");
            sayi = myInput.nextInt();
            if (sayi%2==1){
                loopInput = false;
            }
            else{
                if ((sayi%2==0)&&(sayi%4==0)){
                    toplam+=sayi;
                }
            }
        }
        System.out.print("Bulunan sonuc: "+toplam);
    }
}
