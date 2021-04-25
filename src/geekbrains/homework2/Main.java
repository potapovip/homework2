package geekbrains.homework2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int [] biArr  = getRandArrBinar(10);
//        for(int i = 0; i <= biArr.length - 1 ;i++){
//            System.out.print(biArr[i] + " ");
//            if (biArr[i] == 0){
//                biArr[i] = 1;
//            }else{
//                biArr[i] = 0;
//            }
//        }
//        System.out.println();
//        for(int i = 0; i <= biArr.length - 1 ;i++) {
//            System.out.print(biArr[i]+ " ");
//        }

//        int [] biArr  = getRandArrBinar(10);
//        for(int i = 0; i <= biArr.length - 1 ;i++) {
//            System.out.print(biArr[i] + " ");
//            if (biArr[i] > 0) {
//                biArr[i] = 0;
//            }
//            else {
//                biArr[i] =1;
//
//            }
//        }
//        System.out.println();
//        for(int i = 0; i <= biArr.length - 1 ;i++) {
//            System.out.print(biArr[i]+ " ");
//        }

// Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        int[] secArr = new int [8];
//
//       iter1: for (int i=0; i<= secArr.length - 1; i++) {
//            for(int z = 0; z<=21;z++){
//                if (z % 3 != 0) continue;
//                secArr[i] = z; continue iter1;
//            }
//
//            System.out.print(secArr[i] + " ");
//        }

//
//
//        }
//        for (int i=0; i<= secArr.length - 1; i++)
//        System.out.print(secArr[i] + " ");
//        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        int[] secArr = new int [8];
//        for (int i=0; i<= secArr.length - 1; i++) {
//            secArr[i] = i * 3;
//            System.out.print(secArr[i] + " ");
//            }
//        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
//            int[] trArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//            for(int i = 0; i< trArr.length;i++){
//                if (trArr[i] < 6){
//                    trArr[i] = trArr[i] *2;
//                }
//                System.out.print(trArr[i]+ " ");
//            }


//        for (int t = 0; t<=21; t++) {
//            if (t % 3 != 0) continue;
//            System.out.print(t);
//        }






// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        int [][] fourArr = new int [10][10];
//        for (int i = 0; i<fourArr.length;i++){
//            for(int q = 0; q<fourArr[i].length;q++){
//                if((q==i) || i==((fourArr[i].length-1)-q))  {
//                    fourArr[i][q] = 1;
//                }
//                System.out.print(fourArr[i][q]+ " ");
//            }System.out.println();
//        }
//** Задать одномерный массив c целыми числами и найти в нем минимальный и максимальный элементы ;
//        int[] fiveArr = {4,13,5,14,22,2};
//        int max =fiveArr[0];
//        int min = fiveArr[0];
//        for (int i = 0; i<fiveArr.length; i++) {
//            if(fiveArr[i]>max){
//                max = fiveArr[i];
//            }
//            if(fiveArr[i]<min){
//                min = fiveArr[i];
//            }
//        }System.out.println("Минимальный элемент: " +min+ " Максимальный элемент: "+max);
//        int[] fiveArr = {4,13,5,14,12,-9};
//        Arrays.sort(fiveArr);
//        System.out.println(fiveArr[0]);
//        System.out.println(fiveArr[fiveArr.length -1]);

//Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят...
        int [] sixArr = {4, 5, 2, 1, 2, 2, 5, 4};
        int summArrLeft = 0;
        int summArrRight  = 0;
        for(int i = 0; i< sixArr.length-3;i++){
            if((summArrLeft = summArrLeft+sixArr[i+1]) == (summArrRight = summArrRight +sixArr[(sixArr.length-1)-i]))
                System.out.println("True");
            ;
        }


//        int [] sixArr = {2, 2, 2, 1, 2, 2, 10, 1};
//        int[] summArr = new int[sixArr.length -3];
//        for(int i = 0; i< sixArr.length-3;i++){
//            summArr[i]= sixArr[i]+sixArr[i+1];
//        }







//        int[] arr = new int[3];
//        arr [0] = 2;
//        arr [1] = 5;
//        arr [2] = 9;
//        for (int i=arr.length-1; i>= 0;i--)
//        System.out.println( arr[i]);
//
//        int [] arr2 = {10,5,20,15,3,6,9,1};
//        for(int i = 0;i<= arr2.length-1;i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        for(int i = arr2.length-1; i>=0;i--) {
//            System.out.print(arr2[i] + " ");
//        }
//        int arr [] = new int[10];
//        for (int i = 0; i <= arr.length -1;i++) {
//            arr[i] = (int) Math.round(Math.random() );
//            System.out.print(arr[i] + " ");
//        }
//
//            System.out.println(getRandArr(5));



    }
    static int[]  getRandArr100 (int arr) {
        int resultArr [] = new int[arr];
        for (int i = 0; i <= arr -1; i++) {
            resultArr[i] = (int) (Math.random()*100);
        }
        return resultArr;
    }
    static int[]  getRandArrBinar (int arr) {
        int resultArr [] = new int[arr];
        for (int i = 0; i <= arr -1; i++) {
            resultArr[i] = (int) Math.round(Math.random());
        }
        return resultArr;
    }


}

