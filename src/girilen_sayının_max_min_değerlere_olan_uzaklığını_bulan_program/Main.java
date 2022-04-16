package girilen_sayının_max_min_değerlere_olan_uzaklığını_bulan_program;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        List<Integer> newlist = new ArrayList<Integer>();
        List<Integer> maxList = new ArrayList<Integer>();
        int n = input.nextInt();
        for (i = 0 ; i < list.length ; i++){
            if (n < list[i]){
                maxList.add(list[i]);
            }
            if ( n > list[i]){
                newlist.add(list[i]);
            }
        }
        int count = newlist.size();
        System.out.println("En küçük : "+newlist.get(count-1));
        System.out.print("En büyük : "+maxList.get(0));

    }
}
