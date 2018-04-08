package memento;

import java.util.Stack;

public class Caretaker {

    private Stack<EmployeeMemento> mementoStack = new Stack<>();

    public void save(Employee employee){
        mementoStack.push(employee.save());
    }

    public void revert(Employee employee){
        employee.revert(mementoStack.pop());
    }
}
