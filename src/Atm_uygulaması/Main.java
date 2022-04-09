package Atm_uygulaması;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float bakiye = (float) 2000.34,miktar;
        String username,password;
        int secim;
        int hak=3;
        while (hak > 0) {
            System.out.println("lütfen kullanıcı isminizi giriniz: ");
            username = input.nextLine();
            System.out.print("parolanızı giriniz: ");
            password = input.nextLine();
            if (username.equals("user") && password.equals(("1234"))) {
                System.out.println("Hoşgeldiniz");
                boolean dogruluk = true;
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız:\n1-)Para çekme\n2-)Para yatırma\n3-)Bakiye sorgulama\n4-)çıkış yapma");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("çekmek istediğiniz miktarı girin: ");
                            miktar = input.nextFloat();
                            if (miktar > bakiye) {
                                System.out.println("çekmek istediğiniz miktar bakiyenizin üstünde lütfen tekrar deneyiniz");
                                System.out.println("mevcut bakiyeniz: " + bakiye);
                            } else {
                                System.out.println("işleminiz başarılı bir şekilde gerçekleştirilmişir.");
                                float yeni_bakiye = bakiye;
                                yeni_bakiye -= miktar;
                                System.out.println("mevcut kalan bakiyeniz: " + yeni_bakiye);
                            }
                            break;
                        case 2:
                            System.out.println("yatımak istediğiniz miktarı giriniz: ");
                            miktar = input.nextFloat();
                            float yeni_bakiye = bakiye;
                            yeni_bakiye += miktar;
                            System.out.println("mevcut bakiyeniz: " + yeni_bakiye);
                            break;

                        case 3:
                            System.out.println("mevcut bakiyeniz: " + bakiye);
                            break;

                    }

                }while (secim != 4);
                break;
            }
            else {
                int yeni_hak_sayisi = hak-=1;
                System.out.println("Sisteme hatalı veri girişi yapıldı.\nKalan hak sayısı: "+yeni_hak_sayisi);
                if (yeni_hak_sayisi == 0){
                    System.out.println("Sisteme girişiniz bloke oldu.");
                }

            }
        }

    }
}
