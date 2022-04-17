package mayın_tarlası_oyunu;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber , colNumber,size;
    int[][] map ;
    int[][] board;
    boolean game = true;


    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);


    public MineSweeper(int rowNumber , int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }
    public void run() {
        int row,col,success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun başladı");
        while(game) {
            print(board);
            System.out.println("bir satır sayısı giriniz : ");
            row = scan.nextInt();
            System.out.println("bir sütun sayısı giriniz : ");
            col = scan.nextInt();
            if (map[row][col] != -1){
                check(row,col);
                success += 1;
                if (success == (size - (size/4))){
                    System.out.println("başardınız");
                    break;
                }
            }
            else{
                game = false;
                System.out.println("game over");
            }
        }
    }
    public void check(int r , int c){
        if (map[r][c] == 0){
            if ((c < colNumber -1)&&(map[r][c+1] == -1)){
                board[r][c+1]++;
            }
            if ((r < rowNumber -1)&&map[r+1][c] == -1){
                board[r+1][c]++;
            }
            if (map[r][c-1] == -1){
                board[r][c-1]++;
            }
            if (map[r-1][c] == -1){
                board[r-1][c]++;
            }
            if (board[r][c] == 0){
                board[r][c] = -2;
            }
        }

    }
    public void prepareGame() {
        int randRow , randCol ,count = 0;
        while (count != (size / 4)) {
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(colNumber);
            if (map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    public void print(int[][] arr){
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j <arr[i].length ; j++){
                if (arr[i][j] >= 0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
