package Artık_yıl_hesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil, artik_yil, asirlik_artik_yil;
        Scanner myInput = new Scanner(System.in);
        System.out.print("yıl bilgisini giriniz: ");
        yil = myInput.nextInt();
        if (yil < 0) {
            System.out.print("hatalı saı girişi!!");
        } else {
            if ((yil%4==0) && ((yil%100==0) && (yil%400==0))){
                System.out.print(yil+" artık yıldır.");
            }
            else if (yil % 100 == 0){
                System.out.print(yil+" artık yıl değildir.");
            }
            else if (yil%4==0){
                System.out.print(yil+" artık yıldır.");
            }
            else{
                System.out.print(yil+" artık yıl değildir..");
            }
            }
        }
    }

