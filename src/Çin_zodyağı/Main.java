package Çin_zodyağı;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogum_yılı,sonuc;
        Scanner myInput = new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz: ");
        dogum_yılı = myInput.nextInt();
        sonuc = dogum_yılı%12;
        if ((dogum_yılı <0 )){
            System.out.print("hatalı sayı girişi!!");
        }
        else{
            if (sonuc == 0){
                System.out.print("Çin zodyağına göre burcunuz (Maymun)");
            }
            else if (sonuc == 1){
                System.out.print("Çin zodyağına göre burcunuz (Horoz)");
            }
            else if (sonuc == 2){
                System.out.print("Çin zodyağına göre burcunuz (Köpek)");
            }
            else if (sonuc == 3){
                System.out.print("Çin zodyağına göre burcunuz (Domuz)");
            }
            else if (sonuc == 4){
                System.out.print("Çin zodyağına göre burcunuz (Fare)");
            }
            else if (sonuc == 5){
                System.out.print("Çin zodyağına göre burcunuz (Öküz)");
            }
            else if (sonuc == 6){
                System.out.print("Çin zodyağına göre burcunuz (Kaplan)");
            }
            else if (sonuc == 7){
                System.out.print("Çin zodyağına göre burcunuz (Tavşan)");
            }
            else if (sonuc == 8){
                System.out.print("Çin zodyağına göre burcunuz (Ejderha)");
            }
            else if (sonuc == 9){
                System.out.print("Çin zodyağına göre burcunuz (Yılan)");
            }
            else if (sonuc == 10){
                System.out.print("Çin zodyağına göre burcunuz (at)");
            }
            else if (sonuc == 11){
                System.out.print("Çin zodyağına göre burcunuz (Koyun)");
            }
        }


    }
}
