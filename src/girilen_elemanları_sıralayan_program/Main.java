package girilen_elemanları_sıralayan_program;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizinin boyutu : ");
        n = input.nextInt();
        int[] newList = new int[n];
        for (int i = 0 ; i < newList.length ; i++){
            System.out.print(i+1 +". Eleman : ");
            newList[i]=input.nextInt();
        }
        Arrays.sort(newList);
        System.out.print(Arrays.toString(newList));
    }
}
