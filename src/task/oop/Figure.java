package task.oop;


// TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
//  (например, метод для расчета площади).
//  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.
abstract class Figure {
    static final double pi = 3.14;



    abstract void area(double value, double value1);
}
