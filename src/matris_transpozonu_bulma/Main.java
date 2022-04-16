package matris_transpozonu_bulma;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[][] matris = {
                {2,3,4},
                {5,6,4}
        };
        int[][] new_matris = new int[3][2];
        for (int i = 0 ; i <matris.length ; i++){
            for (int j = 0 ; j <matris[i].length ; j++){
                new_matris[j][i] = matris[i][j];
            }
        }
        for (int [] satir: matris){
            for (int sutun:satir){
                //System.out.print(sutun + " ");
            }
            //System.out.print("\n");
        }
        System.out.println("Matris");
        System.out.println(Arrays.deepToString(matris));
        System.out.println("Matris Transpose");
        System.out.println(Arrays.deepToString(new_matris));
    }
}
