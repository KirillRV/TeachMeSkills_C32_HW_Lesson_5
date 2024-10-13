package Lesson5;
import java.util.Arrays;
/**
 * 2*. Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
public class Task_2 {
    public static void main(String[] args) {
        int[][] array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int [][] finalarray = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    finalarray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println("result of array multiplication: ");
        for(int i=0;i<finalarray.length;i++){
            for(int j=0;j<finalarray[i].length;j++){
                System.out.print(" " + finalarray[i][j]);
            }
            System.out.println();
        }
    }
}