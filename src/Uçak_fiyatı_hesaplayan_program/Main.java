package Uçak_fiyatı_hesaplayan_program;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double gidilen_yol,normal_tutar,indirimli_fiyat,yas,gidis_donus_indirimili_fiyat;
        int yolculuk_tipi;
        Scanner myInput = new Scanner(System.in);
        System.out.print("kaç kilometre yol gidilecek: ");
        gidilen_yol = myInput.nextDouble();
        System.out.print("müşterinin yaşı kaç: ");
        yas = myInput.nextDouble();
        System.out.println("tek yönlü bilet => 1\nÇift Yönlü bilet => 2");
        yolculuk_tipi = myInput.nextInt();
        if ((yolculuk_tipi < 0)||(yolculuk_tipi >2)||(gidilen_yol < 0) || (yas < 0)){
            System.out.print("hatalı veri girdiniz!!");
        }
        else{
            if (yolculuk_tipi == 1){
                if (yas <= 12){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*50)/100;
                    System.out.print("alınacak toplam tutar: "+indirimli_fiyat);
                }
                else if ((yas > 12)&&(yas <24)){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*10)/100;
                    System.out.print("alınacak toplam tutar: "+indirimli_fiyat);
                }
                else  if ((yas > 65)){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*30)/100;
                    System.out.print("alınacak toplam tutar: "+indirimli_fiyat);
                }
                else{
                    normal_tutar = (gidilen_yol*0.10);
                    System.out.print("alınacak toplam tutar: "+normal_tutar);
                }
            }
            else if (yolculuk_tipi == 2){
                if (yas <= 12){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*50)/100;
                    gidis_donus_indirimili_fiyat = (indirimli_fiyat*20)/100 ;
                    System.out.print("alınacak toplam tutar: "+gidis_donus_indirimili_fiyat);
                }
                else if ((yas > 12)&&(yas <24)){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*10)/100;
                    gidis_donus_indirimili_fiyat = (indirimli_fiyat*20)/100 ;
                    System.out.print("alınacak toplam tutar: "+gidis_donus_indirimili_fiyat);
                }
                else  if ((yas > 65)){
                    normal_tutar = (gidilen_yol*0.10);
                    indirimli_fiyat = (normal_tutar*30)/100;
                    gidis_donus_indirimili_fiyat = (indirimli_fiyat*20)/100 ;
                    System.out.print("alınacak toplam tutar: "+gidis_donus_indirimili_fiyat);
                }
                else{
                    normal_tutar = (gidilen_yol*0.10);
                    gidis_donus_indirimili_fiyat = (normal_tutar*20)/100 ;
                    System.out.print("alınacak toplam tutar: "+gidis_donus_indirimili_fiyat);
                }
            }

        }
    }
}
