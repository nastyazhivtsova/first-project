package static_final;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company (int someEmployeeID,String someEmployeeName){
        this.employeeName = someEmployeeName;
        employeeID = someEmployeeID;
    }

    String getEmployeeName(){
        return employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

//    void setEmployeeID(int newEmployeeId){
//        this.employeeID = newEmployeeId;
//    }

    void printCompanyName(){
        System.out.println(companyName);
    }

}
