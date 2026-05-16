package Extra_create_class;

public class Employee {
    String name;
    String position;
    double salary;

    Employee (String someName, String somePosition, double someSalary){
        this.name = someName;
        this.position = somePosition;
        this.salary = someSalary;
    }

    String getName(){
        return name;
    }

    String getPosition(){
        return position;
    }

    double getSalary(){
        return salary;
    }

    void describe(){
        System.out.println(getName() + " работает как " + getPosition() + " с зарплатой " + getSalary());
    }
}
