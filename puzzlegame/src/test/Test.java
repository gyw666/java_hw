package test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //需求
        //把一维数组0~15打乱顺序,再添加到二维数组中

        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length - 1);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        int[][] arr=new int[4][4];

        int index=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=tempArr[index];
                index++;
            }
        }



    }
}
