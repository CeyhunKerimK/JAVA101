package Kullanıcı_gririşi_programı;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username = "ceyhun",password = "dippper46",new_password;
        String secim;
        Scanner myInput = new Scanner(System.in);
        System.out.println("kullanıcı isminizi giriniz: ");
        username = myInput.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = myInput.nextLine();
        if (username.equals("ceyhun") && password.equals("dipper46")){
            System.out.println("giriş başarılı.");
        }
        else if ((username.equals("ceyhun")) && (!password.equals("dipper46"))){
            System.out.println("kullanıcı ismi doğru ama şifre hataldıır.");
            System.out.println("şifrenizi değiştirmek ister misiniz ?\nevet için (y)\nhayır için (n)");
            secim = myInput.next();
            switch (secim){
                case "y":
                    System.out.println("yeni şifre giriniz: ");
                    new_password = myInput.next();
                    myInput.nextLine();
                    if (new_password.equals("dipper46")){
                        System.out.println("yeni şifreniz eski şifrenizle aynı olamaz!!");
                    }
                    else{
                        System.out.println("şifreniz değiştirildi.");
                    }
                    System.out.println("sistem sonlandırıldı.");
                    break;
                case "n":
                    System.out.println("sistem sonlandırıldı.");
                    break;
            }
        }
        else if (!(username.equals("ceyhun")) && (password.equals("dipper46"))){
            System.out.println("şifre doğru fakat şifre hatalıdır.");
        }
        else {
            System.out.println("hatalı giriş yapıldı.");
        }
    }
}
