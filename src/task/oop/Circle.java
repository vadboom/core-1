package task.oop;


class Circle extends Figure {


    @Override
    void area(double radius, double square) {
        System.out.println(pi * radius * square);
    }
}

