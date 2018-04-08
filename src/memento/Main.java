package memento;

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();
        employee.setName("Goose");
        employee.setPhone("000-00-00");
        System.out.println("Before save: " + employee.getName() + " " + employee.getPhone());
        caretaker.save(employee);
        System.out.println("After save: " + employee.getName() + " " + employee.getPhone());
        employee.setPhone("111-11-11");
        System.out.println("Changed number and not saved: " + employee.getName() + " " + employee.getPhone());
        caretaker.revert(employee);
        System.out.println("Reverted: " + employee.getName() + " " + employee.getPhone());
    }
}
