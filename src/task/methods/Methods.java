package task.methods;

import java.util.Arrays;

public class Methods {

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] numbers1 = {1, 3, 5, 7, 9};
    static int[] numbers2 = {2, 4, 6, 8, 10};
    int[] array;

    public static void main(String[] args) {
        // Пример вызова метода
        // String string;
        // string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        // System.out.println(sumOfTwoNumbers(1, 2));
        // System.out.println(sumOfTwoString("Hello ","friend"));
        // System.out.println(summationWithinAString("50",50));
        // System.out.println(stringLessInt("11", 22));
        // System.out.println(compareBooleanIsBoolean(true,false));
        // System.out.println(evenNumber(2));
        // System.out.println (arraySorting(numbers)+"\n"+ArraySorting(numbers1)+"\n"+ArraySorting(numbers2));
        //System.out.println(Arrays.toString(copyingAnArray(numbers1)));
        //System.out.println(sumArray(numbers));
        //ageTranslation(120);
        //nameСomparison("vadim","vADIM");
        //System.out.println(lastElement(numbers));
        //System.out.println(letterCounterA("AUSHDADAUSDHOAIFAUDAAAA"));
        //wasteMoney(800);

    }


    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

// Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int sumOfTwoNumbers(int value1, int value2) {
        return value1 + value2;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String sumOfTwoString(String string, String string1) {
        return string.concat(string1);
    }

    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой
    public static String summationWithinAString(String string1, int value) {
        return Integer.toString(Integer.parseInt(string1) + value);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean stringLessInt(String string, int value) {
        return Integer.parseInt(string) < value;

    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
    //  если обе false верни false
    public static boolean compareBooleanIsBoolean(boolean comparison, boolean comparison1) {
        return comparison || comparison1;
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean evenNumber(int value) {
        return value % 2 == 0;
    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String arraySorting(int[] array) {
        int a = 0;
        for (int f : array) {
            if (f % 2 == 0) {
                a++;
            }
        }
        return (a == array.length) ? "Массив четных чисел" : (a == 0) ? "Массив не четных чисел" : "Массив четных и не четных чисел";
    }


    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] copyingAnArray(int[] array) {
        int[] array1 = new int[array.length];
        /*for (int a = 0; a < array.length; a++) {
            array1[a] = array[a];
fyhfuytf
        }*/
        System.arraycopy(array, 0, array1, 0, array.length);
        return array1;
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
    //  то-есть если человек прожил 10 лет , это 120 месяцев так же сделайте перевод возраста в минуты и метод который рассчитает возраст в часах
    public static void ageTranslation(int fullYears) {
        int month = fullYears * 12;
        int hour = fullYears * 365 * 24;
        int minute = fullYears * 365 * 24 * 60;
        System.out.println("количество полных прожитых месяцев-" + month + "\n" + "количество прожитых часов-" + hour + "\n" + "количество прожитых минут-" + minute);
    }

    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static void nameСomparison(String naim, String naim1) {
        System.out.println(naim.equalsIgnoreCase(naim1));
    }

    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int lastElement(int[] array) {
        return array[array.length - 1];
    }

    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int letterCounterA(String string) {
        int value = 0;
        for (int a = 0; a < string.length(); a++) {
            if (string.charAt(a) == 'A') {
                value++;
            }
        }
        return value;
    }

    // TODO: Создайте метод кошелек , у него есть начальная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    public static int wallet = 700;

    public static void wasteMoney(int writeOff) {
        if (wallet >= writeOff) {
            wallet -= writeOff;
            System.out.println("Покупка совершена" + "\n" + "Ваш баланс:" + wallet);
        } else {
            System.out.println("У вас недостаточно средств на счёте" + "\n" + "Ваш баланс:" + wallet);
        }


    }
}