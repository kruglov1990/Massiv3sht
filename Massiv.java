package ru.levelp;

/**
 * Created by Андрей on 31.05.2016.
 */
public class Massiv {
    public static void main(String[] args) {

        //массив в диапазоне от -257 до 346
        int[] intArray = new int[5];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = (int) (Math.random() * 347 - 257);
            }
        for(int i = 0; i < intArray.length; i++){
           System.out.println(intArray[i]);
      }
        int min = intArray[0];
        for(int i = 0; i < intArray.length; i++){
            if (min>intArray[i]){
                min = intArray[i];
            }
        }
            System.out.println("Минимальное значение в массиве - " + min);

    }
}
