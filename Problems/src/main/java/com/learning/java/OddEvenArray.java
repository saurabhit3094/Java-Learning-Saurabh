package com.learning.java;

import java.util.Scanner;

public class OddEvenArray {

    public static boolean checksubArrays(int[] array, int i, int j) {

        if (j<i)
            return false;

        int evenCount = 0;
        int oddCount = 0;

        for (int k=i;k<=j;k++){
            if (array[k]%2 == 0){
                evenCount++;
            }else oddCount++;
        }
        if (evenCount == oddCount)
            return true;
        return false;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = Integer.parseInt(sc.nextLine());
        int[] inputArray = new int[arraySize];
        int count = 0;

        for (int i=0;i<arraySize;i++){
            int temp = sc.nextInt();
            inputArray[i] = temp;
        }

        for(int i=0;i<arraySize;i++){
            for (int j=i+1;j<arraySize;j=j+2){
                if(checksubArrays(inputArray,i, j))
                    count++;
            }
        }
            System.out.println(count);
        }


}
