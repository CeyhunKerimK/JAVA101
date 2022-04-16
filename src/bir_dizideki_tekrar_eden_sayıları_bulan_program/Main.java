package bir_dizideki_tekrar_eden_sayıları_bulan_program;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] intList = {1,12,15,1,2,3,3,98,45,45,1,2,3,12};
        int[] duplicate = new int[intList.length];
        int startIndex = 0;
        for (int i = 0 ; i < intList.length ; i++){
            for (int j = 0 ; j <intList.length ; j++){
                if (i != j && (intList[i] == intList[j])){
                    if (intList[i] % 2 == 0 && intList[j] % 2 == 0){
                        duplicate[startIndex++] = intList[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));








    }
}
