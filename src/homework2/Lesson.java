package homework2;

import homework1.Homework;

import java.util.ArrayList;

public class Lesson {


    public static void main(String[] args) {

        runtask1();
        runtask2();
        runtask4();
        runtask5();
        runtask6();
        runtask7();
        runtask8();
        runtask9();
        runtask10();
        runtask11();
        runtask12();
        runtask13();
        runtask14();
        runtask15();
        runtask16();
        runtask17();
        runtask18();
        runtask19();
        runtask20();
    }

    private static void runtask20() {
        //Task 20. Write a Java program to convert an array to ArrayList.
        System.out.println("\nTask 20. Write a Java program to convert an array to ArrayList.");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int[] array1 = {-10, -9, 22, -5, 32, 8, 0, 8};
        for (int i : array1) {
            integerArrayList.add(i);
        }
        System.out.println(integerArrayList);
    }

    private static void runtask19() {
        //Task 19. Write a Java program to add two matrices of the same size.
        System.out.println("\nTask 19. Write a Java program to add two matrices of the same size.");
        int a = 3;
        int b = 2;
        int[][] matr1 = {{1, 2}, {4, 5}, {7, 8}};
        int[][] matr2 = {{1, 1}, {1, 1}, {1, 1}};
        int[][] matrSum = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrSum[i][j] = matr1[i][j] + matr2[i][j];
            }
        }


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrSum[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void runtask18() {
        //Task 18. Write a Java program to find the second smallest element in an array.
        System.out.println("\nTask 18. Write a Java program to find the second smallest element in an array.");
        //int[] array1 = {1, 42, 22, -5, 32, 8, 0, 8};
        int[] array1 = {10, 9, 22, 5, 32, 8, 30, 8};
        int elMin1 = array1[0];
        int elMax1 = array1[0];
        int elMin2 = 0;
        for (int val : array1) {
            if (elMin1 > val) {
                elMin1 = val;
            }
        }
        for (int val : array1) {
            if (elMax1 < val) {
                elMax1 = val;
            }
        }
        elMin2 = elMax1;
        for (int val : array1) {
            if (elMin2 > val && val != elMin1) {
                elMin2 = val;
            }
        }

        System.out.println(elMin1 + " - 1 наименьшее, " + elMin2 + " - 2 наименьшее значения массива " + Homework.arrayToString(array1));

    }

    private static void runtask17() {
        //Task 17. Write a Java program to find the second largest element in an array.
        System.out.println("\nTask 17. Write a Java program to find the second largest element in an array.");
        //int[] array1 = {1, 42, 22, -5, 32, 8, 0, 8};
        int[] array1 = {-1, -42, -22, -5, -32, -8, -64, -64};
        int elMax1 = array1[0];
        int elMin1 = array1[0];
        int elMax2 = 0;
        // find the first maximum element
        for (int val : array1) {
            if (elMax1 < val) {
                elMax1 = val;
            }
        }
        // find the first minimum to initialize them 2 maximum
        for (int val : array1) {
            if (elMin1 > val) {
                elMin1 = val;
            }
        }
        elMax2 = elMin1;
        for (int val : array1) {
            if (elMax2 < val && val != elMax1) {
                elMax2 = val;
            }
        }

        System.out.println(elMax1 + " - 1 наибольшее, " + elMax2 + " - 2 наибольшее значения массива " + Homework.arrayToString(array1));

    }

    private static void runtask16() {
        //Task 16. Write a Java program to remove duplicate elements from an array.
        System.out.println("\nTask 16. Write a Java program to remove duplicate elements from an array.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 8, 13, 22, 9, 8};
        int[] array2 = new int[array1.length];
        int k = 0;
        boolean chk;
        System.out.println("array1 = " + Homework.arrayToString(array1));
        for (int i = 0; i < array1.length; i++) {
            chk = false;
            for (int j = 0; j < i; j++) {
                if (array1[i] == array2[j]) {
                    chk = true;
                    break;
                }
            }
            if (!chk) {
                array2[k] = array1[i];
                k++;
            }
        }
        int[] array3 = new int[k];
        System.arraycopy(array2, 0, array3, 0, k);
        System.out.println("array3 = " + Homework.arrayToString(array3));

    }

    private static void runtask15() {
        //Task 15. Write a Java program to find the common elements between two arrays of integers.
        System.out.println("\nTask 15. Write a Java program to find the common elements between two arrays of integers.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 1, 13, 22, 9, 4};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        String result = "";
        System.out.println("array1 = " + Homework.arrayToString(array1));
        System.out.println("array2 = " + Homework.arrayToString(array2));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result += " ar1[" + i + "] = " + " ar2[" + j + "] = " + array1[i] + "\n";
                    break;
                }
            }
        }
        System.out.println("Общие элементы:\n" + result);

    }

    private static void runtask14() {
        //Task 14. Write a Java program to find the common elements between two arrays (string values).
        System.out.println("\nTask 14. Write a Java program to find the common elements between two arrays (string values).");
        String[] arrayString1 = {"Аня", "Таня", "Слава", "Паша", "Оля", "Слава"};
        String[] arrayString2 = {"Яблоко", "Груша", "Таня", "Арбуз", "Сыр", "Слава", "Сыр"};
        String result = "";
        System.out.println("arrayString1 = " + Homework.arrayToString(arrayString1));
        System.out.println("arrayString2 = " + Homework.arrayToString(arrayString2));
        for (int i = 0; i < arrayString1.length; i++) {
            for (int j = 0; j < arrayString2.length; j++) {
                if (arrayString1[i].equals(arrayString2[j])) {
                    result += " ar1[" + i + "] = " + " ar2[" + j + "] = " + arrayString1[i] + "\n";
                    break;
                }
            }
        }
        System.out.println("Общие элементы:\n" + result);

    }

    private static void runtask13() {
        //Task 13. Write a Java program to find the duplicate values of an array of string values.
        System.out.println("\nTask 13. Write a Java program to find the duplicate values of an array of string values.");
        String[] arrayString = {"Аня", "Таня", "Слава", "Паша", "Оля", "Слава"};
        String result = "";
        System.out.println("arrayString = " + Homework.arrayToString(arrayString));
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length; j++) {
                if (j != i && arrayString[i].equals(arrayString[j])) {
                    result += " arrayString[" + i + "] = " + arrayString[i] + "\n";
                }
            }
        }
        System.out.println("Повторяющиеся элементы:\n" + result);

    }

    private static void runtask12() {
        //Task 12. Write a Java program to find the duplicate values of an array of integer values.
        System.out.println("\nTask 12. Write a Java program to find the duplicate values of an array of integer values.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 8, 13, 22, 9, 8};
        String result = "";
        System.out.println("array1 = " + Homework.arrayToString(array1));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (j != i && array1[i] == array1[j]) {
                    result += " array1[" + i + "] = " + array1[i];
                }
            }
        }
        System.out.println("Повторяющиеся элементы:\n" + result);

    }

    private static void runtask11() {
        //Task 11. Write a Java program to reverse an array of integer values.
        System.out.println("\nTask 11. Write a Java program to reverse an array of integer values.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 8};
        System.out.println("array1 = " + Homework.arrayToString(array1));
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }
        System.out.println("array2 = " + Homework.arrayToString(array2));

    }

    private static void runtask10() {
        //Task 10. Write a Java program to find the maximum and minimum value of an array.
        System.out.println("\nTask 10. Write a Java program to find the maximum and minimum value of an array.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 8};
        int elMax = array1[0];
        int elMin = array1[0];
        for (int val : array1) {
            if (elMax < val) {
                elMax = val;
            }
            if (elMin > val) {
                elMin = val;
            }
        }
        System.out.println(elMin + " минимальное, " + elMax + " максимальное значения массива " + Homework.arrayToString(array1));

    }

    private static void runtask9() {
        //Task 9.  Write a Java program to insert an element (specific position) into an array.
        System.out.println("\nTask 9.  Write a Java program to insert an element (specific position) into an array.");
        String[] arrayString = {"Аня", "Таня", "Слава", "Паша", "Оля", "Слава"};
        String check = "Коленька";
        int pos = 4;
        System.out.println("arrayString = " + Homework.arrayToString(arrayString));
        String[] arrayStringNew = new String[arrayString.length + 1];
        for (int i = 0; i < arrayStringNew.length; i++) {
            if (i < pos - 1) {
                arrayStringNew[i] = arrayString[i];
            } else if (i == pos - 1) {
                arrayStringNew[i] = check;
            } else {
                arrayStringNew[i] = arrayString[i - 1];
            }
        }
        System.out.println("arrayStringNew = " + Homework.arrayToString(arrayStringNew));

    }

    private static void runtask8() {
        //Task 8.  Write a Java program to copy an array by iterating the array.
        System.out.println("\nTask 8.  Write a Java program to copy an array by iterating the array.");
        String[] arrayString = {"Аня", "Таня", "Слава", "Паша", "Оля", "Слава"};
        System.out.println("arrayString = " + Homework.arrayToString(arrayString));
        String[] arrayStringNew = new String[arrayString.length];
        System.arraycopy(arrayString, 0, arrayStringNew, 0, arrayString.length);
        System.out.println("arrayStringNew = " + Homework.arrayToString(arrayStringNew));

    }

    private static void runtask7() {
        //Task 7.  Write a Java program to remove a specific element from an array.
        System.out.println("\nTask 7.  Write a Java program to remove a specific element from an array.");
        String[] arrayString = {"Аня", "Таня", "Слава", "Паша", "Оля", "Слава"};
        System.out.println(Homework.arrayToString(arrayString));
        String check = "Слава";
        int arrayNewLength = arrayString.length;
        System.out.println("Удаляем элементы " + check);
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(check)) {
                for (int j = i; j <= arrayString.length - 1; j++) {
                    if (j == arrayString.length - 1) {
                        arrayString[j] = "";
                    } else {
                        arrayString[j] = arrayString[j + 1];
                        arrayString[j + 1] = "";
                    }
                }
                arrayNewLength--;
            }
        }
        String[] arrayNew = new String[arrayNewLength];
        System.arraycopy(arrayString, 0, arrayNew, 0, arrayNewLength);
        System.out.println(Homework.arrayToString(arrayString));
        System.out.println(Homework.arrayToString(arrayNew));

    }

    private static void runtask6() {
        //Task 6.  Write a Java program to find the index of an array element.
        System.out.println("\nTask 6.  Write a Java program to find the index of an array element.");
        int[] array1 = {12, 22, -5, 32, 8, 0, 8};
        int check = 8;
        String tmp = "";
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == check) {
                tmp += i + "-й ";
            }
        }
        System.out.println(check + " это " + (tmp.equals("") ? "никакой " : tmp) + "элемент массива " + Homework.arrayToString(array1));

    }

    private static void runtask5() {
        //Task 5.  Write a Java program to test if an array contains a specific value.
        System.out.println("\nTask 5.  Write a Java program to test if an array contains a specific value.");
        int[] array1 = {12, 22, -5, 32, 8, 0};
        int check = 9;
        int tmp = 0;
        for (int value : array1) {
            if (value == check) {
                tmp = 1;
                break;
            }
        }
        System.out.println("Массив " + Homework.arrayToString(array1) + (tmp == 1 ? " содержит " : " не содержит ") + "элемент " + check);

    }

    private static void runtask4() {
        //Task 4.  Write a Java program to calculate the average value of array elements.
        System.out.println("\nTask 4.  Write a Java program to calculate the average value of array elements.");
        int[] array1 = {12, 22, -5, 32, 8, 0};
        int tmp = 0;
        for (int value : array1) {
            tmp += value;
        }
        System.out.println("Среднее значение элементов массива " + Homework.arrayToString(array1) + " = " + tmp / array1.length);

    }


    private static void runtask2() {
        //Task 2. Write a Java program to sum values of an array.
        System.out.println("\nTask 2. Write a Java program to sum values of an array.");
        int[] array1 = {12, 22, -5, 32, 8, 0};
        int tmp = 0;
        for (int value : array1) {
            tmp += value;
        }
        System.out.println("Сумма элементов массива " + Homework.arrayToString(array1) + " = " + tmp);


    }

    private static void runtask1() {
        //Bubble sort
        //Task 1. Write a Java program to sort a numeric array and a string array.
        System.out.println("\nTask 1. Write a Java program to sort a numeric array and a string array.");

        int[] array1 = {12, 22, -5, 32, 8, 0};
        System.out.println(Homework.arrayToString(array1));
        int tmp = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = (array1.length - 1); j >= (i + 1); j--) {
                if (array1[j] < array1[j - 1]) {
                    tmp = array1[j];
                    array1[j] = array1[j - 1];
                    array1[j - 1] = tmp;
                }
            }
        }
        System.out.println(Homework.arrayToString(array1));

        String[] arrayString = {"Аня", "Таня", "Паша", "Оля", "Слава"};
        System.out.println(Homework.arrayToString(arrayString));
        String tmpString = "";
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = (arrayString.length - 1); j >= (i + 1); j--) {
                if (arrayString[j].compareTo(arrayString[j - 1]) < 0) {
                    tmpString = arrayString[j];
                    arrayString[j] = arrayString[j - 1];
                    arrayString[j - 1] = tmpString;
                }
            }
        }
        System.out.println(Homework.arrayToString(arrayString));


    }
}
