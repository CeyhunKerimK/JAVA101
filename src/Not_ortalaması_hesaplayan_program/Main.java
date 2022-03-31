package Not_ortalaması_hesaplayan_program;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        int not1, not2, not3, not4, not5, not6;
        int ortalama, toplam;
        Scanner take = new Scanner(System.in);
        out.print("Matematik notunu giriniz :");
        not1 = take.nextInt();
        out.print("Türkçe notunu giriniz :");
        not2 = take.nextInt();
        out.print("tarih notunu giriniz :");
        not3 = take.nextInt();
        out.print("Fizik notunu giriniz :");
        not4 = take.nextInt();
        out.print("Kimya notunu giriniz :");
        not5 = take.nextInt();
        out.print("Müzik notunu giriniz :");
        not6 = take.nextInt();
        toplam = not1 + not2 + not3 + not4 + not5 + not6;
        ortalama = toplam / 6;
        out.println("öğrencinin not ortalaması : " + ortalama);
        String sonuc = (ortalama >= 60) ? "geçti" : "kaldı";
        System.out.print(sonuc);



    }
}
