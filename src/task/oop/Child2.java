package task.oop;

// TODO: Создайте класс Child2 и перегрузите методы.
//  1. Первый метод примет 3 числа и сложит их.
//  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
//  3. Третий метод примет две строки и вернет их конкатенацию.
//  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
//  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.
class Child2 extends Parent {

    public int sum(int value, int value1, int value2) {
        return value + value1 + value2;
    }

    public int sumParseString(String string, String string2, String string3) {
        int value = Integer.parseInt(string);
        int value1 = Integer.parseInt(string2);
        int value2 = Integer.parseInt(string3);
        int result;
        result = value + value1 + value2;

        return result;
    }


    public String sumTwoString(String string, String string1) {
        return string + string1;
    }

    public void printMessage(String string) {
        System.out.println("I am Child2" + string);
    }

    public String sumThreeString(String string, String string1, String string2) {
        return string + string1 + string2;
    }
}


