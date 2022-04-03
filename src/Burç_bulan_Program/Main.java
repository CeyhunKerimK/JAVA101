package Burç_bulan_Program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay,gun;
        Scanner myInput = new Scanner(System.in);
        System.out.println("hangi ay doğdunuz (1-12 formatında giriniz): ");
        ay = myInput.nextInt();
        System.out.println("hangi gün doğdunuz: ");
        gun = myInput.nextInt();
        if (ay == 1){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 21){
                    System.out.println("oğlak burcusunuz.");
                }
                else{
                    System.out.println("kova burcusunuz.");
                }
            }
        }
        else if (ay == 2){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 19){
                    System.out.println("kova burcusunuz.");
                }
                else{
                    System.out.println("balık burcusunuz.");
                }
            }
        }
        else if (ay == 3){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 20){
                    System.out.println("balık burcusunuz.");
                }
                else{
                    System.out.println("koç  burcusunuz.");
                }
            }
        }
        else if (ay == 4){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 20){
                    System.out.println("koç burcusunuz.");
                }
                else{
                    System.out.println("boğa burcusunuz.");
                }
            }
        }
        else if (ay == 5){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 21){
                    System.out.println("boğa burcusunuz.");
                }
                else{
                    System.out.println("ikizler burcusunuz.");
                }
            }
        }
        else if (ay == 6){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 22){
                    System.out.println("ikizler burcusunuz.");
                }
                else{
                    System.out.println("yengeç burcusunuz.");
                }
            }
        }
        else if (ay == 7){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 22){
                    System.out.println("yengeç burcusunuz.");
                }
                else{
                    System.out.println("aslan burcusunuz.");
                }
            }
        }
        else if (ay == 8){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 22){
                    System.out.println("aslan burcusunuz.");
                }
                else{
                    System.out.println("başak burcusunuz.");
                }
            }
        }
        else if (ay == 9){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 22){
                    System.out.println("başak burcusunuz.");
                }
                else{
                    System.out.println("terazi burcusunuz.");
                }
            }
        }
        else if (ay == 10){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 22){
                    System.out.println("terazi burcusunuz.");
                }
                else{
                    System.out.println("akrep burcusunuz.");
                }
            }
        }
        else if (ay == 11){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 21){
                    System.out.println("akrep burcusunuz.");
                }
                else{
                    System.out.println("yay burcusunuz.");
                }
            }
        }
        else if (ay == 12){
            if ((gun > 1)&&(gun < 28)){
                if (gun <= 21){
                    System.out.println("yay burcusunuz.");
                }
                else{
                    System.out.println("oğlak burcusunuz.");
                }
            }
        }
    }
}
