package task.oop;

// TODO: Создайте класс Child1 и переопределите все 5 методов.
//  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
//  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
//  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
//  4. Четвертый метод выводит на экран "I am Child1".
//  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.
class Child extends Parent {
    @Override
    public int sum(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int sumIntString(String string, int value) {
        return (Integer.parseInt(string) + value) * 2;
    }

    @Override
    public String string(String string) {
        return String.valueOf(string.charAt(0));
    }

    @Override

    public void printMessage() {
        System.out.println("I am Child");
    }

    @Override
    public String sumOfTwoString(String string, String string1) {
        int half = (string + string1).length() / 2;
        return (string + string1).substring(0, half);
    }
}


