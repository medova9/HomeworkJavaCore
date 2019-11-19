package homework1;


public class Homework {
    private static final String RESULT_WORD = "--РЕЗУЛЬТАТ--";

    public static void main(String[] args) {
        System.out.println("Домашняя работа №1");
        runTask1();
        runTask2();
        runTask3();
        runTask4();
        runTask5();
        runTask6();
        runTask7();
        runTask8();
        runTask9();
        runTask10();
        runTask11();
        runTask12();
        runTask13();
        runTask14();
        runTask15();
        runTask16();
        runTask17();
        runTask18();
        runTaskAdvancedLevel();
    }

    private static void runTask1() {
        System.out.println("\n1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести ");
        System.out.println("равна 16% от силы тяжести на Земле.");
        Weight girl = new Weight(49);
        System.out.println(RESULT_WORD);
        System.out.println("Вес " + girl.getMyWeight() + " кг. на Земле равен " + girl.getWeightOnMoon() + " кг. на луне");
    }

    private static void runTask2() {
        System.out.println("\n2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.");
        double[] myArray = {3, 14, 22.3, -67};
        int myPercent = 10;
        System.out.println(RESULT_WORD);
        System.out.println("При увеличении каждого элемента массива " + arrayToString(myArray) + " на " + myPercent + "%");
        increaseEachArrayEl(myArray, myPercent);
        System.out.println("получается массив " + arrayToString(myArray));
    }

    private static void runTask3() {
        System.out.println("\n3. Напишите метод, который будет проверять является ли число палиндромом (одинаково ");
        System.out.println("читающееся в обоих направлениях).");
        int number = 155585551;
        System.out.println(RESULT_WORD);
        System.out.println("Число " + number + " палиндром - " + isPalindrome(number));
    }

    private static void runTask4() {
        System.out.println("\n4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)");
        System.out.println(RESULT_WORD);
        int startOfInterval = 1;
        int endOfInterval = 100;
        int evenCheck = 0;
        printEvenNumbers(startOfInterval, endOfInterval, evenCheck);
    }

    private static void runTask5() {
        System.out.println("\n5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)");
        System.out.println(RESULT_WORD);
        int startOfInterval = 1;
        int endOfInterval = 15;
        int evenCheck = 1;
        printEvenNumbers(startOfInterval, endOfInterval, evenCheck);
    }

    private static void runTask6() {
        System.out.println("\n6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления ");
        System.out.println("(используя только цикл for)");
        int startOfInterval = 1;
        int endOfInterval = 100;
        System.out.println(RESULT_WORD);
        printEvenNumbersTo100(startOfInterval, endOfInterval);
    }

    private static void runTask7() {
        int resultSum = 0;
        System.out.println("\n7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)");
        int startOfInterval = 20;
        int endOfInterval = 200;
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            resultSum += i;
        }
        System.out.println(RESULT_WORD);
        System.out.println(resultSum);
    }

    private static void runTask8() {
        System.out.println("\n8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому ");
        System.out.println("числу (используя цикл и оператор if else)");
        System.out.println(RESULT_WORD);
        int startOfInterval = 1;
        int endOfInterval = 12;
        String month;
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            if (i == 1) {
                month = "январь";
            } else if (i == 2) {
                month = "февраль";
            } else if (i == 3) {
                month = "март";
            } else if (i == 4) {
                month = "апрель";
            } else if (i == 5) {
                month = "май";
            } else if (i == 6) {
                month = "июнь";
            } else if (i == 7) {
                month = "июль";
            } else if (i == 8) {
                month = "август";
            } else if (i == 9) {
                month = "сентябрь";
            } else if (i == 10) {
                month = "октябрь";
            } else if (i == 11) {
                month = "ноябрь";
            } else {
                month = "декабрь";
            }
            System.out.println(i + " месяц " + month);
        }
    }

    private static void runTask9() {
        System.out.println("\n9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы ");
        System.out.println("значение первой оказалось во второй, а второй - в первой.");
        int firstNum = 1;
        int secondNum = 2;
        System.out.println("firstNum = " + firstNum + ", " + "secondNum = " + secondNum);
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("ВЖУХ!");
        System.out.println("firstNum = " + firstNum + ", " + "secondNum = " + secondNum);
    }

    private static void runTask10() {
        System.out.println("\n10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, ");
        System.out.println("а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.");
        int num1 = 1;
        int num2 = 2;
        int num3;
        num3 = sumNums(num1, num2);
        System.out.println(RESULT_WORD);
        System.out.println(num1 + "+" + num2 + "=" + num3);
    }

    private static void runTask11() {
        System.out.println("\n11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.");
        int num1 = 13;
        int num2 = -3;
        int num3 = 5;

        System.out.println(RESULT_WORD);
        System.out.println("Наибольшая переменная из num1 = " + num1 + ", num2 = " + num2 + " и num3 = " + num3 + " это ");
        if (num1 == maxNum(num1, num2, num3)) {
            System.out.println("num1 = " + num1);
        }
        if (num2 == maxNum(num1, num2, num3)) {
            System.out.println("num2 = " + num2);
        }
        if (num3 == maxNum(num1, num2, num3)) {
            System.out.println("num3 = " + num3);
        }
    }

    private static void runTask12() {
        System.out.println("\n12. Напишите программу, в которой используются две переменные логического типа (boolean),");
        System.out.println("присвойте им значения и выведете для каждой переменной на экран строку \"истина\", если ");
        System.out.println("переменная имеет значение true и \"ложь\", если переменная имеет значение false.");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(RESULT_WORD);
        System.out.println("В первой переменной " + trueOrFalseName(bool1)
                + ", во второй " + trueOrFalseName(bool2));
    }

    private static void runTask13() {
        String str1;
        String str2;
        String str3;
        str1 = "\n13. Напишите программу, где двум строковым переменным присваиваются значения, третей же ";
        str2 = "строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем " +
                "напечатайте значение третьей строковой переменной.";
        str3 = str1 + str2;
        System.out.println(str3);
    }

    private static void runTask14() {
        System.out.println("\n14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая");
        System.out.println("переменная больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй ");
        System.out.println("переменной на 8. В конце программы выведите значения обоих чисел на экран.");
        int num1 = 13;
        int num2 = -3;
        System.out.println("Первая переменная = " + num1);
        System.out.println("Вторая переменная = " + num2);
        if (num1 > num2) {
            num1 = num1 + 3;
        } else {
            num2 += 8;
        }
        System.out.println("--ВЖУХ--");
        System.out.println("Первая переменная = " + num1);
        System.out.println("Вторая переменная = " + num2);
    }

    private static void runTask15() {
        System.out.println("\n15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной ");
        System.out.println("программе): for while do while");
        System.out.println("for");
        printHundredDo();
        System.out.println("while");
        printHundredWhile();
        System.out.println("do while");
        printHundredDoWhile();
    }

    private static void runTask16() {
        System.out.println("\n16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, ");
        System.out.println("если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. ");
        System.out.println("Минимум, максимум и шаг указываются пользователем (можно захардкодить).");
        printSeriesOfNumbers(-10, 35, 5);
    }

    private static void runTask17() {
        System.out.println("\n17. Все элементы массива поделить на значение наибольшего элемента этого массива.");
        double[] myArray1 = {3, 14, 22.3, -67};
        System.out.println(RESULT_WORD);
        System.out.println("При делении каждого элемента массива " + arrayToString(myArray1) + " на максимальный элемент ");
        decreaseEachArrayEl(myArray1);
        System.out.println("получается массив " + arrayToString(myArray1));
    }

    private static void runTask18() {
        System.out.println("\n18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов ");
        System.out.println("укажите кол-во рублей и курс.");
        double sumUSD;
        double rateUSD = 2.0698;
        double sumBYN = 500;
        sumUSD = conversionToBYN(sumBYN, rateUSD);
        System.out.println(round(sumBYN, 2) + " белорусских рублей это " + round(sumUSD, 2) + " $");
    }

    private static void runTaskAdvancedLevel() {
        System.out.println("\n2. Напишите программу, которая будет считать количество часов, минут и секунд в n-ном ");
        System.out.println("количестве суток.");
        int days = 15;
        DaysCounter daysCounter = new DaysCounter(days);

        System.out.println("В " + days + " днях "
                + daysCounter.getHours() + " часов "
                + daysCounter.getMinutes() + " минут "
                + daysCounter.getSeconds() + " секунд.");
    }


    private static double conversionToBYN(double sum, double rate) {
        double result;
        result = sum / rate;
        return result;
    }

    private static void printSeriesOfNumbers(int startOfInterval, int endOfInterval, int step) {
        String outStr = "";
        for (int i = startOfInterval; i <= endOfInterval; i += step) {
            // натуральные числа начинаются с 1
            if (i > 0) {
                outStr += i + " ";
            }
            if (outStr.length() > 80) {
                System.out.println(outStr);
                outStr = "";
            }
        }
        System.out.println(outStr);

    }

    private static void printHundredDo() {
        String outStr = "";

        for (int i = 1; i <= 100; i++) {
            outStr = outStr + i + ", ";
            if (outStr.length() > 80) {
                System.out.println(outStr);
                outStr = "";
            }
        }
        System.out.println(outStr);

    }

    private static void printHundredWhile() {
        String outStr = "";
        int i = 1;
        while (i <= 100) {
            outStr = outStr + i + ", ";
            if (outStr.length() > 80) {
                System.out.println(outStr);
                outStr = "";
            }
            i++;
        }
        System.out.println(outStr);

    }

    private static void printHundredDoWhile() {
        String outStr = "";
        int i = 1;
        do {
            outStr = outStr + i + ", ";
            if (outStr.length() > 80) {
                System.out.println(outStr);
                outStr = "";
            }
            i++;
        } while (i <= 100);
        System.out.println(outStr);

    }


    private static void increaseEachArrayEl(double[] array, int incPercent) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * (1 + (double) incPercent / 100);
        }
    }

    public static String arrayToString(double[] array) {
        String str = "{ ";
        for (int i = 0; i < array.length; i++) {
            str = str + round(array[i], 2) + (i + 1 < array.length ? ", " : " }");
        }
        return str;
    }

    public static String arrayToString(int[] array) {
        String str = "{ ";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i] + (i + 1 < array.length ? ", " : " }");
        }
        return str;
    }

    public static String arrayToString(String[] array) {
        String str = "{ ";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i] + (i + 1 < array.length ? ", " : " }");
        }
        return str;
    }

    private static Boolean isPalindrome(int checkedNumber) {
        int resultNumber = 0;
        int bufferNumber = checkedNumber;
        Boolean result;
        int i = 1;

        while (bufferNumber != 0) {
            i++;
            resultNumber = resultNumber * 10 + (bufferNumber % 10);
            bufferNumber /= 10;
        }
        result = (checkedNumber == resultNumber ? Boolean.TRUE : Boolean.FALSE);
        return result;
    }

    //evenCheck 1 - нечетный, 0 - четный
    private static void printEvenNumbers(int startOfInterval, int endOfInterval, int evenCheck) {
        String outStr = "";
        if (startOfInterval > endOfInterval) {
            System.out.println("Неверный интервал! Задайте правильный. Второе число должно быть больше первого.");
        } else {
            for (int i = startOfInterval; i <= endOfInterval; i++) {
                if (i % 2 == evenCheck) {
                    outStr = outStr + i + ", ";
                }
                if (outStr.length() > 80) {
                    System.out.println(outStr);
                    outStr = "";
                }
            }
            System.out.println(outStr);
        }
    }

    private static void printEvenNumbersTo100(int startOfInterval, int endOfInterval) {
        String outStr = "";
        if (startOfInterval > endOfInterval) {
            System.out.println("Неверный интервал! Задайте правильный. Второе число должно быть больше первого.");
        } else {
            for (int i = startOfInterval; i <= endOfInterval; i += 2) {
                outStr = outStr + (i + 1) + ", ";

                if (outStr.length() > 80) {
                    System.out.println(outStr);
                    outStr = "";
                }
            }
            System.out.println(outStr);
        }
    }

    private static int sumNums(int num1, int num2) {
        return num1 + num2;
    }

    private static int maxNum(int num1, int num2, int num3) {
        if (num1 < num2) {
            num1 = num2;
        }
        if (num1 < num3) {
            num1 = num3;
        }
        return num1;
    }

    private static String trueOrFalseName(boolean param) {
        String result;
        result = (param ? "истина" : "ложь");
        return result;
    }

    private static void decreaseEachArrayEl(double[] array) {
        double maxEl = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxEl < array[i]) {
                maxEl = array[i];
            }
        }
        System.out.println("maxEl = " + maxEl);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / maxEl;
        }

    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }


}