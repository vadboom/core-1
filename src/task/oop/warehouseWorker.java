package task.oop;

abstract class warehouseWorker extends Employee {
    public warehouseWorker(int id, String surname, String name, int age) {
        super(id, surname, name, age);
    }

    @Override
    public int salaryEmployee(int salary) {
        return salary;
    }
}