package memento;

public class Employee {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(this.name, this.phone);
    }

    public void revert(EmployeeMemento memento){
        this.name = memento.getName();
        this.phone = memento.getPhone();
    }
}
