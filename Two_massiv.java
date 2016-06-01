package ru.levelp;

/**
 * Created by Андрей on 31.05.2016.
 */
public class Two_massiv {
    public static void main(String[] args) {

        //Задача про 2 массива и отображение третьего
        int[] massivOne = new int[5];
        int[] massivTwo = new int[5];
        int[] massivThree = new int[5];

        for (int i = 0; i < massivOne.length; i++){
            massivOne[i] = (int) (Math.random() * 8);
            System.out.print(massivOne[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < massivTwo.length; j++){
            massivTwo[j] = (int) (Math.random() * 8);
            System.out.print(massivTwo[j] + " ");
        }

        System.out.println();
        System.out.println();

        int counter = 0;
        int x = 0;
        for (int j = 0; j < massivTwo.length; j++){
            for (int i = 0; i < massivOne.length; i++){
                if (massivOne[i] == massivTwo[j]){
                    counter++;
                }
                x = counter;
            }
            System.out.print(x +" ");
            counter = 0;
        }


    }
}
