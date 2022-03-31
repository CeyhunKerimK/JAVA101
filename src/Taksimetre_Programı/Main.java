package Taksimetre_Programı;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gidilen_yol,ucret,sabit_ucret = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç km yol gidildi :");
        gidilen_yol = input.nextDouble();
        ucret = 10 +(gidilen_yol * sabit_ucret);
        if (ucret < 20){
            System.out.print("borcunuz 20 tl'dir.");
        }
        else if (ucret > 20){
            System.out.print("borcunuz "+ ucret +" tl'dir");
        }



    }
}
