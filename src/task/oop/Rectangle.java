package task.oop;

class Rectangle extends Figure {

    @Override
    void area(double length, double width) {
        System.out.println(length * width);
    }
}

