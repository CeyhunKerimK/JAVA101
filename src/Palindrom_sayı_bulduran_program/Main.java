package Palindrom_sayı_bulduran_program;
public class Main {
    static boolean isPalinrom(int number) {
        int temp = number,reverse_num = 0,lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reverse_num = ( reverse_num * 10) + lastnumber;
            temp /= 10;

        }
        if (number == reverse_num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.print(isPalinrom(524));
    }
}
