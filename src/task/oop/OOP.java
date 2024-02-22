package task.oop;


// Реализуйте функциональность согласно описанию

// TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
//  1. Метод, принимающий 2 числа и возвращающий их сумму.
//  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
//  3. Метод, принимающий строку и возвращающий ее.
//  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
//  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.
class Parent {
    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    public int sumIntString(String string, int value) {
        return (Integer.parseInt(string) + value);
    }

    public String string(String string) {
        return string;
    }

    public void printMessage() {
        System.out.println("I am Parent");
    }

    public String sumOfTwoString(String string, String string1) {
        return string + string1;
    }

}

