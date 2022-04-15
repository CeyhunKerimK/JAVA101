package dizilerdeki_sayıların_harmonik_ortalamasını_hesaplayan_program;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        float total = 0;
        for (int j : list) {
            total +=(1.0) / j;
        }
        System.out.println(total);


    }
}
