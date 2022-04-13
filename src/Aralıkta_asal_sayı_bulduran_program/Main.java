package Aralıkta_asal_sayı_bulduran_program;

public class Main {
    public static void main(String[] args) {
        for (int i = 2 ; i <= 100 ; i++) {
            int status = 1;
            for (int j = 2 ; j < i ; j++) {
                if (i % j == 0) {
                    status = 0;
                }
            }
            if (status == 1) {
                System.out.print(i + " ");
            }
        }
    }
}


