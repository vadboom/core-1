package task.oop;

abstract class Manager extends Employee {

    public Manager(int id, String surname, String name, int age) {
        super(id, surname, name, age);
    }

    @Override
    public int salaryEmployee(int salary) {
        int bonus = 1200;

        return bonus + salary;
    }

}

