package Hava_sıcaklığına_göre_etkinlik_öneren_program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float sicaklik;
        Scanner myInput = new Scanner(System.in);
        System.out.println("hava sıcaklığı kaç derece: ");
        sicaklik = myInput.nextFloat();
        if (sicaklik < 5 ){
            System.out.println("hava şartları kayağa gitmek için uygun");
        }
        else if ((sicaklik >= 5) && (sicaklik <15)){
            System.out.println("bugün Sinemaya gitmek için uygun");
        }
        else if ((sicaklik >= 15) && (sicaklik <25)){
            System.out.println("hava bugün piknik yapmak için uygun");
        }
        else if (sicaklik >=25){
            System.out.println("bugün yüzmek için güzel birgün");
        }
        else {
            System.out.println("geçersiz değer girildi!!");
        }


    }
}
