package task.oop;

class Triangle extends Figure {

    @Override
    void area(double height, double length) {
        System.out.println(height * length / 2);
    }
}